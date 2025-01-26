public class pattern{
    public static void main(String[] args) {
        int[] rowSymbols = {1, 2, 3, 4, 5};

        for (int i = 0; i < rowSymbols.length; i++) {
            char symbol = (i % 2 == 0) ? '?' : '#'; 

            for (int j = 0; j < rowSymbols[i]; j++) {
                System.out.print(symbol);
            }

            System.out.println();
        }
    }
}