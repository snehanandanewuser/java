import java.util.*;

public class assignment1{
    public static void main(String[] args) {

//create two strings
        String str1 = "Sneha";
        String str2 = "Nanda";

//find the length of both strings
        System.out.println(str1.length());
        System.out.println(str2.length());

//concatenate the strings
        String concateString = str1 + str2;
        System.out.println(concateString);

//swap the first characters of both strings
        String s1 = str2.charAt(0) + str1.substring(1);

//swap the first character of each string
        String s2 = str1.charAt(0) + str2.substring(1);

//print the swapped string
        System.out.println("Swapped string str1 " + s1);
        System.out.println("Swapped string str2 " + s2);

//input the index number and print the character of that strings and also check if index is valid
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index");
        int index = sc.nextInt();

        char[] A = concateString.toCharArray();

        if(index>=0 && index<concateString.length()){
            System.out.println("the character at that index is " + A[index]);
        }
        else{
            System.out.println("index is out of bound");
        }

//input character and find its index and also check if the character exists in string or not
        System.out.println("enter the character");
        char searchchar = sc.next().charAt(0);
        int charindex = concateString.indexOf(searchchar);

        if(charindex!= -1){
            System.out.println("the character found at the index " + charindex);
        }
        else{
            System.out.println("the character doesnot exists");
        }

//split the concatenated string at space
        String[] splitStrings = concateString.split(" ");
        System.out.println("split string: " + Arrays.toString(splitStrings));

//loop through the concatenated string and print repeated characters and their  counts
        int[] charcount = new int[256];  // array to store count of characters

        for(char c: concateString.toCharArray()){
            //ignore spaces
            if(c != ' '){
                charcount[c]++;
            }

            for(int i=0; i<charcount.length; i++){
                if(charcount[i] > 1){
                    System.out.println((char) i + ": " + charcount[i] );
                }

            }
    }

//reverse the concatenated string using loop
        StringBuilder reversestring = new StringBuilder();
        for(int i=concateString.length()-1; i>=0; i--){
            reversestring.append(concateString.charAt(i));
        }
        System.out.println("reverse string " + reversestring);

//identify the vowels in the concatenated string and print out its index
        System.out.println("vowels and their indexices");
        for(int i=0; i<concateString.length(); i++){
            char c = concateString.charAt(i);
            if("AEIOUaeiou".indexOf(c) != -1){
                System.out.println(c + " at index " + i);
            }
        }
// create an array and perform sum calculation
        int[] numbers = {10,62,32,47,50};
        int sum = 0;
        for(int i=0; i<5; i++){
            sum = sum + numbers[i];
        }
        System.out.println("sum " + sum);

//loop through the array and perform the sum calculations
        int min = numbers[0];
        int max = numbers[0];
        for(int i=0; i<5; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("max value " + max + " min value " + min);

//loop through to find the second largest element
        int largest = numbers[0];
        int secondlargest = numbers[1];
        for(int i=0; i<5; i++){
            if(numbers[i]>largest){
                secondlargest = largest;
                largest = numbers[i];
            }
            else if(numbers[i]>secondlargest && numbers[i] != largest){
                secondlargest = numbers[i];
            }
        }
        System.out.println("the second largest element " + secondlargest);

//sum of numbers at even and at odd places
        int evensum=0;
        int oddsum=0;
        for(int i=0; i<5; i++){
            if(i%2 == 0){
                evensum = evensum + numbers[i];
            }
            else{
                oddsum = oddsum + numbers[i];
            }
        }
        System.out.println("even sum " + evensum);
        System.out.println("odd sum " + oddsum);
}
}