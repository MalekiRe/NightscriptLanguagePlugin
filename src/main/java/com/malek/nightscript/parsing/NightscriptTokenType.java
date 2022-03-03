package com.malek.nightscript.parsing;

import com.intellij.psi.tree.IElementType;
import com.malek.nightscript.NightscriptLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class NightscriptTokenType extends IElementType {
    public NightscriptTokenType(@NotNull @NonNls String debugName) {
        super(debugName, NightscriptLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
