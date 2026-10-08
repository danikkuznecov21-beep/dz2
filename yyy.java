package dz2;

import java.util.Scanner;

public class yyy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean res = (a % 2 == 0) && (b % 2 == 0) || (a % 2 == 0) &&(c % 2 == 0) || (b % 2 == 0) && (c % 2 == 0) ;
        // задача номер 6
        System.out.println(res);
    }
}

