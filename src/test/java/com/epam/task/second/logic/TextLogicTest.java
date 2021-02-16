package com.epam.task.second.logic;

import com.epam.task.second.entities.Strings;
import org.junit.Assert;
import org.junit.Test;

public abstract class TextLogicTest {
    TextLogic logic;
    abstract public TextLogic getTextBehavior();
    Strings TEXT = new Strings("hello dear   friends");

    @Test
    public void testReplaseKSymbolWithAnotherSymbolShouldReplaseKSymbolWithAnotherSymbolWhenPositionOfreplacementApplied(){
        logic=getTextBehavior();

        Strings actual = logic.replaseKSymbolWithAnotherSymbol(TEXT,'j',7);

        Assert.assertEquals(new Strings("hello dear   friendj"),actual);

    }

    @Test
    public void testDelateWordsWithCertainLengthShouldDelateWordsWithCertainLengthWhenFirstLetterInWordIsConconant(){
        logic=getTextBehavior();

        Strings actual = logic.delateWordsWithCertainLength(TEXT,7);

        Assert.assertEquals(new Strings("hello dear   "),actual);

    }
}
