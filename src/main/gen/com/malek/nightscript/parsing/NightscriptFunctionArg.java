// This is a generated file. Not intended for manual editing.
package com.malek.nightscript.parsing;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NightscriptFunctionArg extends PsiElement {

  @Nullable
  NightscriptFunction getFunction();

  @Nullable
  PsiElement getBool();

  @Nullable
  PsiElement getDoublevar();

  @Nullable
  PsiElement getFloatvar();

  @Nullable
  PsiElement getInteger();

  @Nullable
  PsiElement getString();

}
