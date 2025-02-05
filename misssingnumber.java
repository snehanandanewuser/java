public class misssingnumber {
    public static void main(String[] args) {
        int[] A = {1,5,6,2,4};
        int n = A.length + 1;     //n for calculating the total sum of the array

        //the expected sum
        int expected_sum = n * (n + 1) / 2;
        System.out.println("the expected sum " + expected_sum);

        //the actual sum
        int total_sum = 0;
        for(int i=0; i<A.length; i++){
            total_sum +=A[i];
        }
        System.out.println("the actual sum " + total_sum);

        //calculating the missing number
        int missing_number = expected_sum - total_sum;
        System.out.println("the missin number is " + missing_number);

    }
    
}
