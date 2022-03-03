package com.malek.nightscript;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class NightscriptLanguage extends Language {
    public static final Language INSTANCE = new NightscriptLanguage();

    protected NightscriptLanguage() {
        super("Nightscript");
    }
}
