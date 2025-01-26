public class secondlargestelement {
    public static void main(String[] args) {
        int[] A = {1, 3, 6, 2, 8, 20};

        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                second_max = max;
                max = A[i];
            } else if (A[i] > second_max && A[i] != max) {
                second_max = A[i];
            }
        }

        if (second_max == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second maximum number is " + second_max);
        }
    }
}
