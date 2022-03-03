// This is a generated file. Not intended for manual editing.
package com.malek.nightscript.parsing;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.malek.nightscript.parsing.NightscriptTypes.*;
import static com.malek.nightscript.parsing.NightscriptParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class NightscriptParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // FUNCTION_ARG comma ARGS | FUNCTION_ARG
  public static boolean ARGS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARGS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGS, "<args>");
    r = ARGS_0(b, l + 1);
    if (!r) r = FUNCTION_ARG(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FUNCTION_ARG comma ARGS
  private static boolean ARGS_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARGS_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FUNCTION_ARG(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && ARGS(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // whenkeyword eventdec EVENT_ARGS_LIST leftcurlybracket [MULTI_FUNCTION] rightcurlybracket
  public static boolean EVENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EVENT")) return false;
    if (!nextTokenIs(b, WHENKEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHENKEYWORD, EVENTDEC);
    r = r && EVENT_ARGS_LIST(b, l + 1);
    r = r && consumeToken(b, LEFTCURLYBRACKET);
    r = r && EVENT_4(b, l + 1);
    r = r && consumeToken(b, RIGHTCURLYBRACKET);
    exit_section_(b, m, EVENT, r);
    return r;
  }

  // [MULTI_FUNCTION]
  private static boolean EVENT_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EVENT_4")) return false;
    MULTI_FUNCTION(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // eventlambda
  public static boolean EVENT_ARG(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EVENT_ARG")) return false;
    if (!nextTokenIs(b, EVENTLAMBDA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EVENTLAMBDA);
    exit_section_(b, m, EVENT_ARG, r);
    return r;
  }

  /* ********************************************************** */
  // EVENT_ARG [comma EVENT_ARG]
  public static boolean EVENT_ARGS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EVENT_ARGS")) return false;
    if (!nextTokenIs(b, EVENTLAMBDA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EVENT_ARG(b, l + 1);
    r = r && EVENT_ARGS_1(b, l + 1);
    exit_section_(b, m, EVENT_ARGS, r);
    return r;
  }

  // [comma EVENT_ARG]
  private static boolean EVENT_ARGS_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EVENT_ARGS_1")) return false;
    EVENT_ARGS_1_0(b, l + 1);
    return true;
  }

  // comma EVENT_ARG
  private static boolean EVENT_ARGS_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EVENT_ARGS_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && EVENT_ARG(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // leftsquarebracket [EVENT_ARGS] rightsquarebracket
  public static boolean EVENT_ARGS_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EVENT_ARGS_LIST")) return false;
    if (!nextTokenIs(b, LEFTSQUAREBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFTSQUAREBRACKET);
    r = r && EVENT_ARGS_LIST_1(b, l + 1);
    r = r && consumeToken(b, RIGHTSQUAREBRACKET);
    exit_section_(b, m, EVENT_ARGS_LIST, r);
    return r;
  }

  // [EVENT_ARGS]
  private static boolean EVENT_ARGS_LIST_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EVENT_ARGS_LIST_1")) return false;
    EVENT_ARGS(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // eventlambda leftparen [ARGS] rightparen
  public static boolean EVENT_LAMBDA_FUNCTION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EVENT_LAMBDA_FUNCTION")) return false;
    if (!nextTokenIs(b, EVENTLAMBDA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, EVENTLAMBDA, LEFTPAREN);
    r = r && EVENT_LAMBDA_FUNCTION_2(b, l + 1);
    r = r && consumeToken(b, RIGHTPAREN);
    exit_section_(b, m, EVENT_LAMBDA_FUNCTION, r);
    return r;
  }

  // [ARGS]
  private static boolean EVENT_LAMBDA_FUNCTION_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EVENT_LAMBDA_FUNCTION_2")) return false;
    ARGS(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // MULTI_EVENT
  public static boolean FINISHED_COMPILATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FINISHED_COMPILATION")) return false;
    if (!nextTokenIs(b, WHENKEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MULTI_EVENT(b, l + 1);
    exit_section_(b, m, FINISHED_COMPILATION, r);
    return r;
  }

  /* ********************************************************** */
  // NORMAL_FUNCTION | EVENT_LAMBDA_FUNCTION
  public static boolean FUNCTION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FUNCTION")) return false;
    if (!nextTokenIs(b, "<function>", EVENTLAMBDA, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION, "<function>");
    r = NORMAL_FUNCTION(b, l + 1);
    if (!r) r = EVENT_LAMBDA_FUNCTION(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FUNCTION | integer | floatvar | doublevar | string | bool
  public static boolean FUNCTION_ARG(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FUNCTION_ARG")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_ARG, "<function arg>");
    r = FUNCTION(b, l + 1);
    if (!r) r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, FLOATVAR);
    if (!r) r = consumeToken(b, DOUBLEVAR);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, BOOL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EVENT [',' MULTI_EVENT]
  public static boolean MULTI_EVENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTI_EVENT")) return false;
    if (!nextTokenIs(b, WHENKEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EVENT(b, l + 1);
    r = r && MULTI_EVENT_1(b, l + 1);
    exit_section_(b, m, MULTI_EVENT, r);
    return r;
  }

  // [',' MULTI_EVENT]
  private static boolean MULTI_EVENT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTI_EVENT_1")) return false;
    MULTI_EVENT_1_0(b, l + 1);
    return true;
  }

  // ',' MULTI_EVENT
  private static boolean MULTI_EVENT_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTI_EVENT_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && MULTI_EVENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FUNCTION semicolon [MULTI_FUNCTION]
  public static boolean MULTI_FUNCTION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTI_FUNCTION")) return false;
    if (!nextTokenIs(b, "<multi function>", EVENTLAMBDA, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTI_FUNCTION, "<multi function>");
    r = FUNCTION(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && MULTI_FUNCTION_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [MULTI_FUNCTION]
  private static boolean MULTI_FUNCTION_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTI_FUNCTION_2")) return false;
    MULTI_FUNCTION(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier leftparen [ARGS] rightparen
  public static boolean NORMAL_FUNCTION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NORMAL_FUNCTION")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, LEFTPAREN);
    r = r && NORMAL_FUNCTION_2(b, l + 1);
    r = r && consumeToken(b, RIGHTPAREN);
    exit_section_(b, m, NORMAL_FUNCTION, r);
    return r;
  }

  // [ARGS]
  private static boolean NORMAL_FUNCTION_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NORMAL_FUNCTION_2")) return false;
    ARGS(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FINISHED_COMPILATION
  static boolean root(PsiBuilder b, int l) {
    return FINISHED_COMPILATION(b, l + 1);
  }

}
