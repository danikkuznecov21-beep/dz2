package dz2;

import java.util.Scanner;

public class nomer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        boolean res =  (a + b == 0) || (a + c == 0) || (a + d == 0) ||
                (b + c == 0) || (b + d == 0) || (c + d == 0);


        System.out.println(res);
    }
}


