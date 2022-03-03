package com.malek.nightscript;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import com.malek.nightscript.parsing.NightscriptTokenType;
import com.malek.nightscript.parsing.NightscriptTypes;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class NightscriptCompletionContributor extends CompletionContributor {
    static ArrayList<LookupElementBuilder> builderArrayList = new ArrayList<>();
    CompletionProvider p =  new CompletionProvider<>() {
        public void addCompletions(@NotNull CompletionParameters parameters,
                                   @NotNull ProcessingContext context,
                                   @NotNull CompletionResultSet resultSet) {
            for(LookupElementBuilder lookupElementBuilder : builderArrayList) {
                resultSet.addElement(lookupElementBuilder);
            }
            resultSet.addElement(LookupElementBuilder.create("when"));
        }
    };
    static {

    }
    public NightscriptCompletionContributor() {
        extend(null, PlatformPatterns.psiElement(), p

        );
    }
}
