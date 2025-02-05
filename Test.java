public class Test {
    Test(Double d){
        this(10);
        System.out.println("Double arg");
    }

    Test(int i){
        this();
        System.out.println("int args");
    }

    Test(){
        System.out.println("No args");
    }
    
    public static void main(String[] args){
        Test t1 = new Test();
    }
}
