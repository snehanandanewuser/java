public class integersum {
    public static void main(String[] args){

        int sum =0;
        int i=0;

        for(i=10;i<=950;i++){
            if(i%6==0 && i%9==0){
                sum = sum + i;
            } 
        }
        System.out.println(sum);
    }
    
}
