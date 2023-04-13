import java.util.Scanner;

public class DayOneFour {
    public DayOneFour() {
        System.out.println("FACTORIAL is 1");
    }
    int fact_value;

    public DayOneFour(int fact_value) {
        this.fact_value = fact_value;
        int fact=1;
        while (fact_value!=1)
        {
            fact=fact*fact_value;
            fact_value--;
        }
        System.out.println("FACTORIAL IS = "+fact);
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the value of n for factorial ::");
        int i = scanner.nextInt();
        System.out.println("Value of n = "+i);
        if(i==0)
        {
            DayOneFour dayOneFour = new DayOneFour();
        }
        else
        {
            DayOneFour dayOneFour1=new DayOneFour(i);
        }

    }
}
