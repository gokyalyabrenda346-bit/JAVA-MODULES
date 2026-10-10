package Passports;
import Confidentials.Records;
public class PassportService {
    public void ShowPassportApplication(String nin) {
    String name = new Records().name(nin);
    if(name!=null){
        System.out.println( "Passport: accepted for " + name );
    }
    else {
        System.out.println("Passport: person not found" + name);
    }
}
}
