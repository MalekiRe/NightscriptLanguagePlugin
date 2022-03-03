package com.malek.nightscript.parsing;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

public class NightscriptLexerAdapater extends FlexAdapter {
    public NightscriptLexerAdapater() {
        super(new _NightscriptLexer(null));
    }
}
