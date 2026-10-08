package dz2;

import java.util.Scanner;

public class rrr {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            double x = in.nextDouble();
            boolean res = (x >= 100 && x <= 999 && x % 5 == 0);

            System.out.println(res);
            // задача номер 4
        }
    }

