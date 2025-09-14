package src;

public class CharAtMethod {
    public static void main(String[] args) {
        String fname = "Donali";
        String lname = "biswal";
        String fullname = fname + " " + lname;
        for(int i = 0; i < fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
    }
}
