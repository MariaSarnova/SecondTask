package com.epam.task.second.logic;

import com.epam.task.second.entities.Strings;
import org.junit.Assert;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RegexTextLogicTest {
    private final RegexTextLogic logic=new RegexTextLogic();


    @Test(expected = NotImplementedException.class)
    public void testReplaseKSymbolWithAnotherSymbolShouldReplaseKSymbolWithAnotherSymbolWhenPositionOfreplacementApplied(){
        Strings text = new Strings("hello dear   friends");

        Strings actual = logic.replaseKSymbolWithAnotherSymbol(text,'j',7);
    }
    @Test
    public void testDelateWordsWithCertainLengthShouldDelateWordsWithCertainLengthWhenFirstLetterInWordIsConconant(){
        Strings text = new Strings("hello ear   friends");

        Strings actual = logic.delateWordsWithCertainLength(text,7);

        Assert.assertEquals(new Strings("hello ear   "),actual);

    }
}
