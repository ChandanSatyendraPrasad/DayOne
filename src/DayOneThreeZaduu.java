public class DayOneThreeZaduu {
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

        for (;n!=1;n--)
        {
            System.out.println("Before N = "+n);
            System.out.println("Before FACT = "+fact);
            fact=fact*n;
            System.out.println("After N = "+n);
            System.out.println("After FACT = "+fact);
        }

    }
}
