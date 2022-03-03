package com.malek.nightscript.parsing;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.malek.nightscript.parsing.NightscriptTypes.*;

%%

%{
  public _NightscriptLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _NightscriptLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

FLOATVAR=([\d]+|[\d]+\.[\d]*)f
DOUBLEVAR=([\d]+\.[\d]*)
INTEGER=[\d]+
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\'|\\)*\")
BOOL=(true|false)
EVENTLAMBDA=(#)[a-zA-Z_0-9]+
EVENTDEC=[A-Z][a-zA-Z_0-9]*
IDENTIFIER=((@([a-zA-Z_0-9]+)(\.[a-zA-Z_0-9]+)*) ) | ([a-zA-Z_0-9]+)

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "{"                { return LEFTCURLYBRACKET; }
  "}"                { return RIGHTCURLYBRACKET; }
  "("                { return LEFTPAREN; }
  ")"                { return RIGHTPAREN; }
  ","                { return COMMA; }
  ";"                { return SEMICOLON; }
  ":"                { return COLON; }
  "when"             { return WHENKEYWORD; }
  "["                { return LEFTSQUAREBRACKET; }
  "]"                { return RIGHTSQUAREBRACKET; }

  {FLOATVAR}         { return FLOATVAR; }
  {DOUBLEVAR}        { return DOUBLEVAR; }
  {INTEGER}          { return INTEGER; }
  {STRING}           { return STRING; }
  {BOOL}             { return BOOL; }
  {EVENTLAMBDA}      { return EVENTLAMBDA; }
  {EVENTDEC}         { return EVENTDEC; }
  {IDENTIFIER}       { return IDENTIFIER; }

}

[^] { return BAD_CHARACTER; }
