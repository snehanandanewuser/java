public class copyonetoanother {
    public static void main(String[] args) {
        
        int[] A = {1,2,3,4};
        int[] B = new int[A.length];

        for (int i=0; i<A.length; i++){
            B[i] = A[i];
        }

        System.out.println("Printing the array A");
        for (int i=0; i<A.length; i++){
            System.out.println(A[i]);
        }

        System.out.println("Printing the array B");
        for (int i=0; i<B.length; i++){
            System.out.println(B[i]);
        }

    }
    
}
