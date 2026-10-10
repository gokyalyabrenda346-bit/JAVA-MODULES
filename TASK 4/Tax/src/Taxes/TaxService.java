package Taxes;
import Confidentials.Records;
public class TaxService {
    public void ShowTinIssued(String nin) {
        String name = new Records().name(nin);
        if(name!=null){
            System.out.println( "Passport: accepted for " + name );
        }
        else {
            System.out.println("Passport: person not found" + name);
        }
    }
}
