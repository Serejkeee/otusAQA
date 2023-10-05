import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {


        System.out.println(reverseWords("abc"));
        System.out.println(hexToBin("17"));
        System.out.println(Arrays.toString(generateArrWithFibanachi(0)));
        System.out.println(toCamelCase("hello .?,.! world"));
        System.out.println(isPalindrome("ab..!!.bc"));
        System.out.println(getLargest("Hello world city Ryazn"));
    }

    public static String reverseWords(String inputText) {
        // TODO
        StringBuilder stringBuilder = new StringBuilder(inputText);

        return stringBuilder.reverse().toString();
    }

    public static String hexToBin(String hexBase) {
        //TODO
        int num = Integer.parseInt(hexBase);
        return Integer.toBinaryString(num);
    }

    public static int[] generateArrWithFibanachi(int length) {

        if (length < 0 || length == 0) {
            return new int[0];
        }
        int[] num = new int[length];
        for (int i = 0; i < length; i++) {
            num[i] = i + 1;
        }
        return num;
    }

    public static String toCamelCase(String str) {
        // TODO

        String result = str.replaceAll("[^a-zA-Zа-яА-Я\\s]", "");
        String[] parts = result.split("_|-|\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            sb.append(Character.toUpperCase(parts[i].charAt(0)));
            if (parts[i].length() > 1) {
                sb.append(parts[i].substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }

    public static boolean isPalindrome(String input) {
        String result = input.replaceAll("[^a-zA-Zа-яА-Я\\s]", "").replaceAll(" ", "");
        StringBuilder stringBuilder = new StringBuilder(result);

        stringBuilder.reverse();
        // TODO
        return result.equals(stringBuilder.toString());
    }

    public static String getLargest(String input) {
        // TODO
        String[] words = input.split("\\s+");
        int maxLength = 0;
        String longestWord = "";

        for (int i = 0;i < words.length;i++) {
            if (words[i].length() >= maxLength) {
                maxLength = words[i].length();
                longestWord = words[i];
            }
        }

        return longestWord;

    }


        public static void get(String input){
        Random rand = new Random();
        int[] array = new int[10];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Fill the array with random numbers and calculate the sum
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100); // Generate random numbers between 0 and 99
            sum += array[i];
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
        }

        double average = (double) sum / array.length;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }



}