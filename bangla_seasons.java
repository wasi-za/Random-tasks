import java.util.Scanner;
public class bangla_seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();

        String season;

        switch (month) {
            case 4:
            case 5:
            case 6:
                season = "Grishmo (Summer)";
                break;
            case 7:
            case 8:
            case 9:
                season = "Barsha (Monsoon)";
                break;
            case 10:
            case 11:
                season = "Sharad (Autumn)";
                break;
            case 12:
            case 1:
            case 2:
                season = "Hemanta (Winter)";
                break;
            case 3:
                season = "Bashonto (Spring)";
                break;
            default:
                season = "Invalid month";
                break;
        }

        System.out.println("The season for month " + month + " is: " + season);

        scanner.close();
    }
}

