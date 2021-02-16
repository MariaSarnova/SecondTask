package com.epam.task.second.logic;

import com.epam.task.second.entities.Strings;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTextLogic extends TextLogic{
    @Override
    public Strings replaseKSymbolWithAnotherSymbol(Strings string, char symbol, int position) {
        throw new NotImplementedException();
    }

    @Override
    public Strings delateWordsWithCertainLength(Strings string, int length) {
        String text=string.toString();
        String[] words = text.split(" ");
        Pattern wordWithFirstVowelLetter = Pattern.compile("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]\\S{" + (length-1) + "}");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            Matcher validElementsMatcher = wordWithFirstVowelLetter.matcher(word);
            if (!validElementsMatcher.matches())
                result.append(word).append(" ");
        }
        return new Strings(result.toString());
    }
}

