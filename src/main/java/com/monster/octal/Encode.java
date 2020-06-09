package com.monster.octal;

import java.math.BigInteger;

public interface Encode {

    BigInteger getBase();
    int getVal(char c);
    char getChar(int v);
}
