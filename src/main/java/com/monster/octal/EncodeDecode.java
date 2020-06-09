package com.monster.octal;

import java.math.BigInteger;

public class EncodeDecode {

    public static byte[] decode(String num, Encode encoder) {
        BigInteger decimal = BigInteger.ZERO;
        BigInteger base = BigInteger.ONE;

        int temp = num.length();
        while (temp > 0) {
            BigInteger last_digit = BigInteger.valueOf(encoder.getVal(num.charAt(--temp)));
            decimal = decimal.add(base.multiply(last_digit));
            base = base.multiply(encoder.getBase());
        }

        return decimal.toByteArray();
    }
}
