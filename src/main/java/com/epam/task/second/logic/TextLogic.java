package com.epam.task.second.logic;

import com.epam.task.second.entities.Strings;

public interface TextLogic {
    Strings replaseKSymbolWithAnotherSymbol(final Strings string, char symbol, int position);
    Strings delateWordsWithCertainLength(final Strings string, int length);
}
