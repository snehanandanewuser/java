public class class1 {
    public static void main(String[] args) {

        int i = 2;
        String s3 = "Hello";
        String s1 = " hello world ";

        String s2 = new String("hello");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1 ==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.startsWith(s2));
        System.out.println(s1.endsWith(s2));
        System.out.println(s1.contains("w"));
        System.out.println(s1.length());
        System.out.println(s1.trim());
        System.out.println(s1.trim().length());                      //trims the space after and before
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        char[] A = s1.toCharArray();                                //changes string to array
        System.out.println(A[1]);
        String s4 = "hello world";
        String s5 = "world";
        char[] B = s4.toCharArray();
        System.out.println(s4.substring(2,9));
       System.out.println(s1.split("A"));
                                                                        // to string()
        String s6 ="";                                                 
        System.out.println(s6.isEmpty());

        System.out.println(s6.isBlank());
    }
}
//count characters in the string
//count number of words
//replace g with *
//find index for the particular char
    //int indexOf(char ch)
