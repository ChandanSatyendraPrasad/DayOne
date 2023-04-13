public class DayOneThreeZaduuBina {


    public static void main(String[] args) {
        int n=5;
        int fact=1;
         /*while (n!=1)
        {
            System.out.println("Before N = "+n);
            System.out.println("Before FACT = "+fact);
            fact=fact*n;
            n--;
            System.out.println("After N = "+n);
            System.out.println("After FACT = "+fact);
        }*/

         for (int i=1;n>=i;i++)
        {
//            System.out.println("Before I = "+i);
//            System.out.println("Before FACT = "+fact);
            fact=fact*i;
//            System.out.println("After I = "+i);
//            System.out.println("After FACT = "+fact);
        }
        System.out.println("Factorial of N = "+n+" is "+fact);
    }

}
