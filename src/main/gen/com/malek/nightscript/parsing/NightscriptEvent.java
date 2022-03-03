// This is a generated file. Not intended for manual editing.
package com.malek.nightscript.parsing;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NightscriptEvent extends PsiElement {

  @NotNull
  NightscriptEventArgsList getEventArgsList();

  @Nullable
  NightscriptMultiFunction getMultiFunction();

  @NotNull
  PsiElement getEventdec();

}
