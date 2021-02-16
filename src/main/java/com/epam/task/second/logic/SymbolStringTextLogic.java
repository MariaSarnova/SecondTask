package com.epam.task.second.logic;

import com.epam.task.second.entities.Strings;

public class SymbolStringTextLogic extends TextLogic{
    @Override
    public Strings replaseKSymbolWithAnotherSymbol(Strings string, char symbol,int position) {
        char[] text = string.toChar();
        int firstWordLength = 0;
        if(text[0]!=' '){
            firstWordLength = wordLength(text,0);
            if(firstWordLength>=position){
                text[position-1]=symbol;
            }
        }
        for(int i=firstWordLength;i<text.length;i++){
            if(i+1!=text.length&&text[i]==' '&&text[i+1]!=' '){
                int wordLength=wordLength(text,i+1);
                if(wordLength>=position){
                    text[i+position]=symbol;
                }
            }
            else {
                i++;
            }
        }


        return new Strings(text);
    }


    public int wordLength(char[] text,int currentPosition){
        int size=0;
        for(int i=currentPosition;i<text.length;i++){
            if(text[i]!=' '){
                size++;
            }
            else{
                return size;
            }
        }
        return size;
    }

    @Override
    public Strings delateWordsWithCertainLength(Strings string, int length) {
        char[] text = string.toChar();
        char[] resultText= new char[text.length];
        int wordLength = 0;
        int currentPosition=0;
        for(int i=0;i<text.length;i++){

            if(text[i]!=' '){
                wordLength=wordLength(text,i);
                char[] word=findSubstring(text,i);
                if ((wordLength ==length) && !isVowelLetter(word)){
                    i+=wordLength;
                    if(i<text.length){
                        resultText[currentPosition]=text[i];
                        currentPosition++;
                    }
                }
                else{
                    for(int j=i;j<wordLength+i;j++){
                        resultText[currentPosition]=text[j];
                        currentPosition++;
                    }
                    i+=wordLength-1;
                }
            }
            else {
                if((i+1!= text.length)&&(text[i+1]!=' ')){
                    resultText[currentPosition]=text[i];
                    currentPosition++;
                    wordLength=wordLength(text,i+1);
                    char[] word=findSubstring(text,i+1);
                    if ((wordLength ==length) && !isVowelLetter(word)){
                        i+=wordLength+1;
                        if(i<text.length){
                            resultText[currentPosition]=text[i];
                            currentPosition++;
                        }
                    }
                    else{
                        i++;
                        for(int j=i;j<wordLength+i;j++){
                            resultText[currentPosition]=text[j];
                            currentPosition++;
                        }
                        i+=wordLength-1;
                    }
                }
                else{
                    if((i+1!= text.length)&&(text[i+1]==' ')){
                        resultText[currentPosition]=text[i];
                        currentPosition++;
                    }
                }
            }
        }
        char[] result=new char[currentPosition];
        for(int i=0;i<currentPosition;i++){
            result[i]=resultText[i];
        }
            return new Strings(result);

    }

    public char[] findSubstring(char[] text,int currentPosition){
        int size=wordLength(text,currentPosition);
        char[] result=new char[size];

        for(int i=currentPosition;i<text.length;i++){
            if(text[i]!=' '){
                result[i-currentPosition]=text[i];
            }
            else{
                return result;
            }
        }
        return result;
    }

    public boolean isVowelLetter(char[] word){
        switch (word[0]) {
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
