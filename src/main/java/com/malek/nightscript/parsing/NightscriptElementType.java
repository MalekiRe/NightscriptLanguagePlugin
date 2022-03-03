package com.malek.nightscript.parsing;

import com.intellij.psi.tree.IElementType;
import com.malek.nightscript.NightscriptLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class NightscriptElementType extends IElementType {

    public NightscriptElementType(@NotNull @NonNls String debugName) {
        super(debugName, NightscriptLanguage.INSTANCE);
    }

}