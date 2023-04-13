public class DayOneZero {
    static int num = 10;//Assignment Operator
    static int sum;
    public static void main(String[] args) {
        while (num != 0)//Not Equal
        {
            System.out.println("Before NUMBER= " + num);
            System.out.println("Before SUM= " + sum);
            sum = sum + num;
            num--;
            System.out.println("After NUMBER= " + num);
            System.out.println("After SUM= " + sum);
        }
    }
}
