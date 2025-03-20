import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Input a degree in Fahrenheit:");
    float temp = sc.nextFloat();
    float celsius = (temp-32) * 5 / 9;
    System.out.println(temp + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    sc.close();
    }
}