package com.monster.octal;

import java.math.BigInteger;

public class Base8Encoder extends Encoder{
    private static final char[] CHAR_SET = {'0', '1', '2', '3', '4', '5', '6', '7'};

    public Base8Encoder() {
        super.BASE = BigInteger.valueOf(8);
        super.CHAR_SET = CHAR_SET;
        super.loadValueMap();
    }

    private static class Holder {
        private static final Base8Encoder instance = new Base8Encoder();
    }

    public static Encode getInstance() {
        return Holder.instance;
    }

}
