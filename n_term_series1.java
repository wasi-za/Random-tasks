import java.util.Scanner;

public class n_term_series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n-term number: ");
        int n=sc.nextInt();
        int sum=0, term=1;
        for (int i = 1; i <= n; i++) {
            sum += term;
            term += 20; 
        }
        System.out.println("The sum of the series is: " + sum);

        sc.close();
    }
}
