package com.epam.task.second.logic;

import com.epam.task.second.entities.Strings;

import org.apache.log4j.Logger;

public class StringTypeTextLogic extends TextLogic{
    private final static Logger LOGGER=Logger.getRootLogger();

    public Strings replaseKSymbolWithAnotherSymbol(final Strings string, char symbol,int position){
        LOGGER.debug("Input string - " + string.toString());
        String text =new String(string.toString());
        String [] arrayString=text.split(" ");
        StringBuilder resultText=new StringBuilder();
        for (int i=0;i<arrayString.length;i++){
            StringBuilder word=new StringBuilder();
            word.append(arrayString[i]);
            int wordSize=arrayString[i].length();
            if(wordSize>=position){
                word.deleteCharAt(position-1);
                word.insert(position-1,symbol);
            }
            resultText.append(word);
            if(i!=arrayString.length-1){
                resultText.append(" ");
            }
        }
        String result=resultText.toString();
        LOGGER.debug("Output string - " + result);
        return new Strings(result);
    }

    @Override
    public Strings delateWordsWithCertainLength(Strings string, int length) {
        LOGGER.debug("Input string - " + string.toString());
        String text =new String(string.toString());
        String [] arrayString=text.split(" ");
        StringBuilder resultText=new StringBuilder();
        for (int i=0;i<arrayString.length;i++){
            if ((arrayString[i].length() ==length) && !isVowelLetter(arrayString[i])) {
                if(i!=arrayString.length-1){
                    resultText.append(" ");
                }
            }
            else {
                resultText.append(arrayString[i]);
                if(i!=arrayString.length-1){
                    resultText.append(" ");
                }
            }
        }
        String result=resultText.toString();
        LOGGER.debug("Output string - " + result);
        return new Strings(result);
    }

    public boolean isVowelLetter(String word){
        switch (word.charAt(0)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'Y':
                return true;
            default:
                return false;

        }
    }


}
