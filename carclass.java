class Car{
    String brand;
    String model;
    int year;

    public void getinfo(){
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.year);
    }

}


public class carclass {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.brand = "xyz";
        c1.model = "xxx";
        c1.year = 2021;
        c1.getinfo();


        Car c2 = new Car();
        c2.brand = "xoz";
        c2.model = "xvb";
        c2.year = 2022;
        c2.getinfo();


    }
    
}
