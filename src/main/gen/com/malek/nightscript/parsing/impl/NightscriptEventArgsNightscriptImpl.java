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

public class NightscriptEventArgsNightscriptImpl extends ASTWrapperPsiElement implements NightscriptEventArgs {

  public NightscriptEventArgsNightscriptImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NightscriptVisitor visitor) {
    visitor.visitEventArgs(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NightscriptVisitor) accept((NightscriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NightscriptEventArg> getEventArgList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NightscriptEventArg.class);
  }

}
