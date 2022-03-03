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

public class NightscriptEventNightscriptImpl extends ASTWrapperPsiElement implements NightscriptEvent {

  public NightscriptEventNightscriptImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NightscriptVisitor visitor) {
    visitor.visitEvent(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NightscriptVisitor) accept((NightscriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NightscriptEventArgsList getEventArgsList() {
    return findNotNullChildByClass(NightscriptEventArgsList.class);
  }

  @Override
  @Nullable
  public NightscriptMultiFunction getMultiFunction() {
    return findChildByClass(NightscriptMultiFunction.class);
  }

  @Override
  @NotNull
  public PsiElement getEventdec() {
    return findNotNullChildByType(EVENTDEC);
  }

}
