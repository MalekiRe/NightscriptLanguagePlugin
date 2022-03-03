// This is a generated file. Not intended for manual editing.
package com.malek.nightscript.parsing.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.malek.nightscript.parsing.NightscriptTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.malek.nightscript.parsing.*;
import com.malek.nightscript.SimplePsiImplUtil;

public class NightscriptFunctionArgNightscriptImpl extends ASTWrapperPsiElement implements NightscriptFunctionArg {

  public NightscriptFunctionArgNightscriptImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NightscriptVisitor visitor) {
    visitor.visitFunctionArg(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NightscriptVisitor) accept((NightscriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NightscriptFunction getFunction() {
    return findChildByClass(NightscriptFunction.class);
  }

  @Override
  @Nullable
  public PsiElement getBool() {
    return findChildByType(BOOL);
  }

  @Override
  @Nullable
  public PsiElement getDoublevar() {
    return findChildByType(DOUBLEVAR);
  }

  @Override
  @Nullable
  public PsiElement getFloatvar() {
    return findChildByType(FLOATVAR);
  }

  @Override
  @Nullable
  public PsiElement getInteger() {
    return findChildByType(INTEGER);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

}
