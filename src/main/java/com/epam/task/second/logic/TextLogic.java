package com.epam.task.second.logic;

import com.epam.task.second.entities.Strings;

public abstract class TextLogic {
    abstract Strings replaseKSymbolWithAnotherSymbol(final Strings string, char symbol, int position);
    abstract Strings delateWordsWithCertainLength(final Strings string, int length);
}
