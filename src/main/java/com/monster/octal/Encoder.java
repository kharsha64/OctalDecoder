package com.monster.octal;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

abstract class Encoder implements Encode{

    protected static final Map<Character,Integer> VALUE_MAP = new HashMap<>();

    protected static BigInteger BASE;
    protected static char[] CHAR_SET;

    void loadValueMap() {
        IntStream.range(0,BASE.intValue()).forEach(i -> VALUE_MAP.put(CHAR_SET[i],i));
    }

    @Override
    public BigInteger getBase(){
        return BASE;
    }

    @Override
    public int getVal(char c) {
        return VALUE_MAP.get(c);
    }

    @Override
    public char getChar(int v) {
        return CHAR_SET[v];
    }
}
