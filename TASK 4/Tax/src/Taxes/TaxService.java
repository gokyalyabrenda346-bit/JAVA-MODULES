package Taxes;
import Confidentials.Records;
public class TaxService {
    public void ShowTinIssued(String nin) {
        String name = new Records().name(nin);
        if(name!=null){
            System.out.println( "Tax: TIN issued to " + name );
        }
        else {
            System.out.println("Tax: person not found" + name);
        }
    }
}
