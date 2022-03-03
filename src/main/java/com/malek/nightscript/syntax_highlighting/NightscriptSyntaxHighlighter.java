package com.malek.nightscript.syntax_highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.malek.nightscript.parsing.NightscriptLexerAdapater;
import com.malek.nightscript.parsing.NightscriptTypes;
import com.thaiopensource.xml.dtd.om.Def;
import org.jetbrains.annotations.NotNull;

import java.util.*;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;
import static com.malek.nightscript.parsing.NightscriptTypes.*;

public class NightscriptSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new NightscriptLexerAdapater();
    }

    public TextAttributesKey @NotNull [] createKeyChecker(String name, TextAttributesKey textAttributesKey) {
        return new TextAttributesKey[]{createTextAttributesKey(name,textAttributesKey)};
    }
    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(LEFTCURLYBRACKET) || tokenType.equals(RIGHTCURLYBRACKET)) {
            return createKeyChecker("BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
        }
        if(tokenType.equals(INTEGER) || tokenType.equals(DOUBLEVAR) || tokenType.equals(FLOATVAR)) {
            return createKeyChecker("CONSTANT", DefaultLanguageHighlighterColors.NUMBER);
        }
        if(tokenType.equals(BOOL)) {
            return createKeyChecker("BOOL", DefaultLanguageHighlighterColors.CONSTANT);
        }
        if(tokenType.equals(STRING)) {
            return createKeyChecker("STRING", DefaultLanguageHighlighterColors.STRING);
        }
        if(tokenType.equals(SEMICOLON)) {
            return createKeyChecker("SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
        }
        if(tokenType.equals(LEFTSQUAREBRACKET) || tokenType.equals(RIGHTSQUAREBRACKET)) {
            return createKeyChecker("SQUARE_BRACKET", DefaultLanguageHighlighterColors.BRACKETS);
        }
        if(tokenType.equals(LEFTPAREN) || tokenType.equals(RIGHTPAREN)) {
            return createKeyChecker("PAREN", DefaultLanguageHighlighterColors.PARENTHESES);
        }
        if(tokenType.equals(WHENKEYWORD)) {
            return createKeyChecker("WHEN_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
        }
        if(tokenType.equals(IDENTIFIER)) {
            return createKeyChecker("FUNCTION", DefaultLanguageHighlighterColors.FUNCTION_CALL);
        }
        if(tokenType.equals(EVENTLAMBDA)) {
            return createKeyChecker("EVENT_FUNC_ARG", DefaultLanguageHighlighterColors.FUNCTION_CALL);
        }
        if(tokenType.equals(EVENTDEC)) {
            return createKeyChecker("EVENT_IDENTIFIER", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
        }
        return EMPTY_KEYS;
    }

}