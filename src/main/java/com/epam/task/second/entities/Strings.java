package com.epam.task.second.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Strings {

    private final List<Character> symbols;

    public Strings(Character... symbols){
        this.symbols=new ArrayList<Character>();
        this.symbols.addAll(Arrays.asList(symbols));
    }

    public Strings(String str){
        List<Character> list= new ArrayList<Character>();
        for(char ch:str.toCharArray()){
            list.add(ch);
        }
        this.symbols=list;
    }

    public Strings(List<Character> list){
        this.symbols=list;
    }

    public Strings(char[] str) {
        List<Character> list= new ArrayList<Character>();
        for(char ch:str){
            list.add(ch);
        }
        this.symbols=list;
    }

    public List<Character> getSymbols(){
        return symbols;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Strings strings = (Strings) o;
        return Objects.equals(symbols, strings.symbols);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbols);
    }

    @Override
    public String toString() {
        StringBuilder result=new StringBuilder();
        for(char symbol:symbols){
            result.append(symbol);
        }
        return result.toString();
    }

    public char[] toChar(){
        String string=this.toString();
        char[] elements=string.toCharArray();
        return elements;
    }
}
