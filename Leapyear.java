import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year =sc.nextInt();
        if((year%400==0)|| (year%4==0 && year%100 !=0)){
            System.out.print(year + " is a leap year");
        }else{
            System.out.print(year + " is not a leap year");
        }

    }
}
