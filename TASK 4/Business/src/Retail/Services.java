package Retail;
import Citizen.NationalID;
public class Services {
    public void ShowBusinessRegistration(String nin) {
        if(new NationalID().isValid(nin)){
            System.out.println( "Bussiness: registerd");
        }
        else {
            System.out.println("Bussiness: rejected,invalid ID");
        }
    }
}
