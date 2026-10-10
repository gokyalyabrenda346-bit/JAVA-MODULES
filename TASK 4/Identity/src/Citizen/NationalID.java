package Citizen;
public class NationalID {
    public boolean isValid(String nin) {
        return nin.length() == 14;}
    public void ShowNationalId(String nin) {
        System.out.println("National ID: Valid");
        System.out.println("National ID: NotValid");
    }
}
