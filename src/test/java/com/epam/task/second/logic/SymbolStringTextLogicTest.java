package com.epam.task.second.logic;

import com.epam.task.second.entities.Strings;
import org.junit.Assert;
import org.junit.Test;

public class SymbolStringTextLogicTest {
    private final SymbolStringTextLogic logic=new SymbolStringTextLogic();


    @Test
    public void testReplaseKSymbolWithAnotherSymbolShouldReplaseKSymbolWithAnotherSymbolWhenPositionOfreplacementApplied(){
        Strings text = new Strings("hello dear   friends");

        Strings actual = logic.replaseKSymbolWithAnotherSymbol(text,'j',7);

        Assert.assertEquals(new Strings("hello dear   friendj"),actual);

    }

    @Test
    public void testWordLengthShouldReturnWordLengthWhenPositionOfFirstLettetApplied(){
        Strings text = new Strings("hello dear   friends");

        int actual = logic.wordLength(text.toChar(),6);

        Assert.assertEquals(4,actual);
    }

    @Test
    public void testFindSubstringShouldReturnSubstringWhenPositionOfFirstLettetApplied(){
        Strings text = new Strings("hello dear   friends");
        Strings expected=new Strings("hello");
        char[] actual = logic.findSubstring(text.toChar(),0);

        Assert.assertEquals(expected,new Strings(actual));
    }

    @Test
    public void testDelateWordsWithCertainLengthShouldDelateWordsWithCertainLengthWhenFirstLetterInWordIsConconant(){
        Strings text = new Strings("hello dear   friends");
        Strings expected=new Strings("hello    friends");
        Strings actual = logic.delateWordsWithCertainLength(text,4);

        Assert.assertEquals(expected,actual);
    }

}
