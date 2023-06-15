package org.example.GenerarAleatiorio;

public class GenerarAleatorio {
    public static int generateAleatory(int startNumber, int endNumber){
        int xn = 0;
        int xn1 = 0;

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        while ( (!(xn1 >= startNumber && xn1 <= endNumber))){

            xn = (int) (System.currentTimeMillis());
            xn1 = ((1103515245 * xn + 12345) % 32768) % endNumber;

            // xn1 = xn1 % max;
            if (xn1 < 0){
                xn1 *= -1;
            }

            // System.out.println(xn1);
            xn = xn1;

        }
        return xn1;
    }
}
