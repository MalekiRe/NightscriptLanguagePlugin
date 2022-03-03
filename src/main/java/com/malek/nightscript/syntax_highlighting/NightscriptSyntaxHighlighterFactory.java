package com.malek.nightscript.syntax_highlighting;

import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

public class NightscriptSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

    @NotNull
    @Override
    public NightscriptSyntaxHighlighter getSyntaxHighlighter(Project project, VirtualFile virtualFile) {
        return new NightscriptSyntaxHighlighter();
    }
}
