public class Enquiry {
    Enquiry(String Name, long Mobile, String emailId, String Address){
        System.out.println("ok");
    }
    Enquiry(String Name, String emailId, String Address){
        System.out.println("MobileNo is missing");
    }

    public static void main(String[] args) {
        Enquiry E1 = new Enquiry("XYZ", 9127565, "XYY", "aaA");
        Enquiry E2 = new Enquiry("XYZ", "XYY", "aaA");

    }
}
