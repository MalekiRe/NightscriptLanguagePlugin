// This is a generated file. Not intended for manual editing.
package com.malek.nightscript.parsing;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.malek.nightscript.parsing.impl.*;

public interface NightscriptTypes {

  IElementType ARGS = new NightscriptElementType("ARGS");
  IElementType EVENT = new NightscriptElementType("EVENT");
  IElementType EVENT_ARG = new NightscriptElementType("EVENT_ARG");
  IElementType EVENT_ARGS = new NightscriptElementType("EVENT_ARGS");
  IElementType EVENT_ARGS_LIST = new NightscriptElementType("EVENT_ARGS_LIST");
  IElementType EVENT_LAMBDA_FUNCTION = new NightscriptElementType("EVENT_LAMBDA_FUNCTION");
  IElementType FINISHED_COMPILATION = new NightscriptElementType("FINISHED_COMPILATION");
  IElementType FUNCTION = new NightscriptElementType("FUNCTION");
  IElementType FUNCTION_ARG = new NightscriptElementType("FUNCTION_ARG");
  IElementType MULTI_EVENT = new NightscriptElementType("MULTI_EVENT");
  IElementType MULTI_FUNCTION = new NightscriptElementType("MULTI_FUNCTION");
  IElementType NORMAL_FUNCTION = new NightscriptElementType("NORMAL_FUNCTION");

  IElementType BOOL = new NightscriptTokenType("bool");
  IElementType COLON = new NightscriptTokenType(":");
  IElementType COMMA = new NightscriptTokenType(",");
  IElementType DOUBLEVAR = new NightscriptTokenType("doublevar");
  IElementType EVENTDEC = new NightscriptTokenType("eventdec");
  IElementType EVENTLAMBDA = new NightscriptTokenType("eventlambda");
  IElementType FLOATVAR = new NightscriptTokenType("floatvar");
  IElementType IDENTIFIER = new NightscriptTokenType("identifier");
  IElementType INTEGER = new NightscriptTokenType("integer");
  IElementType LEFTCURLYBRACKET = new NightscriptTokenType("{");
  IElementType LEFTPAREN = new NightscriptTokenType("(");
  IElementType LEFTSQUAREBRACKET = new NightscriptTokenType("[");
  IElementType RIGHTCURLYBRACKET = new NightscriptTokenType("}");
  IElementType RIGHTPAREN = new NightscriptTokenType(")");
  IElementType RIGHTSQUAREBRACKET = new NightscriptTokenType("]");
  IElementType SEMICOLON = new NightscriptTokenType(";");
  IElementType STRING = new NightscriptTokenType("string");
  IElementType WHENKEYWORD = new NightscriptTokenType("when");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGS) {
        return new NightscriptArgsNightscriptImpl(node);
      }
      else if (type == EVENT) {
        return new NightscriptEventNightscriptImpl(node);
      }
      else if (type == EVENT_ARG) {
        return new NightscriptEventArgNightscriptImpl(node);
      }
      else if (type == EVENT_ARGS) {
        return new NightscriptEventArgsNightscriptImpl(node);
      }
      else if (type == EVENT_ARGS_LIST) {
        return new NightscriptEventArgsListNightscriptImpl(node);
      }
      else if (type == EVENT_LAMBDA_FUNCTION) {
        return new NightscriptEventLambdaFunctionNightscriptImpl(node);
      }
      else if (type == FINISHED_COMPILATION) {
        return new NightscriptFinishedCompilationNightscriptImpl(node);
      }
      else if (type == FUNCTION) {
        return new NightscriptFunctionNightscriptImpl(node);
      }
      else if (type == FUNCTION_ARG) {
        return new NightscriptFunctionArgNightscriptImpl(node);
      }
      else if (type == MULTI_EVENT) {
        return new NightscriptMultiEventNightscriptImpl(node);
      }
      else if (type == MULTI_FUNCTION) {
        return new NightscriptMultiFunctionNightscriptImpl(node);
      }
      else if (type == NORMAL_FUNCTION) {
        return new NightscriptNormalFunctionNightscriptImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
