package com.epam.task.second.logic;

import com.epam.task.second.entities.Strings;
import org.junit.Assert;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RegexTextLogicTest extends TextLogicTest{

    @Override
    public TextLogic getTextBehavior() {
        return new RegexTextLogic();
    }
}
