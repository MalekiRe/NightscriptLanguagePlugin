package com.malek.nightscript;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class NightscriptFile extends PsiFileBase {
    public NightscriptFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, NightscriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return NightscriptFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Simple File";
    }
}
