
import java.math.BigInteger;
import java.util.Scanner;

public class DifferentIntegersSize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger n=scan.nextBigInteger();

        int sbyteMin = -128;
        int sbyteMax = 127;

        int byteMin = 0;
        int byteMax = 255;

        int shortMin = -32678;
        int shortMax = 32767;

        int inteMin = -2147483648;
        int inteMax = 2147483647;

        int ushortMin = 0;
        int ushortMax = 65535;

        long uintMin = 0;
        long uintMax = 4294967295L;

        long longMin = -9223372036854775808L;
        long longMax = 9223372036854775807L;


        if (n > longMax || n < longMin) {
            System.out.println(n + " can't fit in any type");
        } else {
            System.out.println(n + " can fit in:");

            if (n <= sbyteMax && n >= sbyteMin) {
                System.out.printf("* sbyte%n");
            } else if (n <= byteMax && n >= byteMin) {
                System.out.printf("* byte%n");
            } else if (n <= Short.MAX_VALUE && n >= Short.MIN_VALUE) {
                System.out.printf("* short%n");
            } else if (n <= ushortMax && n >= ushortMin) {
                System.out.printf("* ushort%n");
            } else if (n <= Integer.MAX_VALUE && n >= Integer.MIN_VALUE) {
                System.out.printf("* int%n");
            } else if (n <= uintMax && n >= uintMin) {
                System.out.printf("* uint%n");
            } else if (n <= longMax && n >= longMin) {
                System.out.printf("* long%n");
            }
        }
    }
}