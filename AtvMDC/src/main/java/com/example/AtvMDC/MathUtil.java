package com.example.AtvMDC;

public class MathUtil {
    public static int mdc(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        final int maior = Integer.max(a, b);
        b = Integer.min(a, b);
        a = maior;
        // P1
        if (b > 0 && a % b == 0) return b;

        // P3
        if (b == 0) return a;

        return -1;
    }
}
