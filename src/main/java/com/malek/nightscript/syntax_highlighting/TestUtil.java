package com.malek.nightscript.syntax_highlighting;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.malek.nightscript.NightscriptFile;
import com.malek.nightscript.NightscriptFileType;
import com.malek.nightscript.parsing.NightscriptEventArg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestUtil {
    public static List<NightscriptEventArg> findProperties(Project project, String key) {
        List<NightscriptEventArg> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(NightscriptFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            NightscriptFile simpleFile = (NightscriptFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                NightscriptEventArg[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, NightscriptEventArg.class);
                if (properties != null) {
                    for (NightscriptEventArg property : properties) {
                        if (key.equals(property.getKey())) {
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static List<NightscriptEventArg> findProperties(Project project) {
        List<NightscriptEventArg> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(NightscriptFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            NightscriptFile simpleFile = (NightscriptFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                NightscriptEventArg[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, NightscriptEventArg.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}
