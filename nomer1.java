package dz2;

import java.util.Scanner;

public class nomer1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        boolean res = x >=3 && x <= 8 ;
        System.out.println(res);
       
    }
}