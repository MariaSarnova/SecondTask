package com.epam.task.second.logic;

import com.epam.task.second.entities.Strings;
import org.junit.Assert;
import org.junit.Test;

public class StringTypeTextLogicTest {
    private final StringTypeTextLogic logic=new StringTypeTextLogic();


    @Test
    public void testReplaseKSymbolWithAnotherSymbolShouldReplaseKSymbolWithAnotherSymbolWhenPositionOfreplacementApplied(){
        Strings text = new Strings("hello dear   friends");

        Strings actual = logic.replaseKSymbolWithAnotherSymbol(text,'j',7);

        Assert.assertEquals(new Strings("hello dear   friendj"),actual);

    }

    @Test
    public void testDelateWordsWithCertainLengthShouldDelateWordsWithCertainLengthWhenFirstLetterInWordIsConconant(){
        Strings text = new Strings("hello ear   friends");

        Strings actual = logic.delateWordsWithCertainLength(text,7);

        Assert.assertEquals(new Strings("hello ear   "),actual);

    }

}
