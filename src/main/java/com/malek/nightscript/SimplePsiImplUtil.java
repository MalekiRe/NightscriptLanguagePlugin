package com.malek.nightscript;

import com.intellij.lang.ASTNode;
import com.malek.nightscript.parsing.NightscriptEventArg;
import com.malek.nightscript.parsing.NightscriptTypes;

public class SimplePsiImplUtil {
    public static String getKey(NightscriptEventArg element) {
        ASTNode keyNode = element.getNode().findChildByType(NightscriptTypes.EVENT_ARG);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(NightscriptEventArg element) {
        ASTNode valueNode = element.getNode().findChildByType(NightscriptTypes.WHENKEYWORD);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }
}
