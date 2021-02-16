package com.epam.task.second.logic;

import com.epam.task.second.entities.Strings;
import org.junit.Assert;
import org.junit.Test;

public class StringTypeTextLogicTest extends TextLogicTest{
    @Override
    public TextLogic getTextBehavior() {
        return new StringTypeTextLogic();
    }

}
