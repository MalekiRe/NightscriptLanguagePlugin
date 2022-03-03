package com.malek.nightscript;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.apache.tools.ant.taskdefs.optional.extension.resolvers.URLResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.io.*;

import static com.malek.nightscript.NightscriptIcons.stringList;

public class NightscriptFileType extends LanguageFileType {

    public static final NightscriptFileType INSTANCE = new NightscriptFileType();

    private NightscriptFileType() {
        super(NightscriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Nightscript File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Simple language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "nightscript";
    }
    static final ClassLoader loader = NightscriptFileType.class.getClassLoader();
    @Nullable
    @Override
    public Icon getIcon() {

        return NightscriptIcons.FILE;
    }

}