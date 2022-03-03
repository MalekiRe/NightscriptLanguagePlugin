package com.malek.nightscript;

import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.util.IconLoader;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

import static com.malek.nightscript.NightscriptCompletionContributor.builderArrayList;

public class NightscriptIcons {
    public static final Icon FILE = IconLoader.getIcon("/icons/nightscript_icon.resized.resized.png", NightscriptIcons.class);
    public static final ArrayList<String> stringList = new ArrayList();
    static {
        InputStream stream = NightscriptIcons.class.getResourceAsStream("/icons/the-file-name.txt");


        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
        BufferedReader br
                = null;
        br = new BufferedReader(new InputStreamReader(stream));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while (true) {
            try {
                if (!((st = br.readLine()) != null)) break;
                stringList.add(st);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        for(String s : NightscriptIcons.stringList) {
            builderArrayList.add(LookupElementBuilder.create(s));
        }

        // File path is passed as parameter


    }

}
