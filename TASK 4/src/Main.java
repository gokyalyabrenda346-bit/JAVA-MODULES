import Citizen.NationalID;
import Taxes.TaxService;
import Passports.PassportService;
import Retail.Services;
import java.util.Scanner;
public class Main {
    Scanner key = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("GOVERNMENT SERVICES");
        System.out.println("-------------------");
        System.out.println("1. National ID check");
        System.out.println("2. Tax collection");
        System.out.println("3. Passport processing");
        System.out.println("4. Business registration");

        System.out.print("Choose service: ");
        int ChosenService = key.nextInt();

        System.out.print("Enter NIN: ");
        String nin = key.next();

        System.out.println("RESULT");


    }
}