import java.util.Arrays;

public class TopicString {
    public static void main(String[] args) {
        String str1 = "Algorithms";
        String str2 = "Java";
        String str3 = "https://www.amazon.com/demo?test=abc";
        String[] arr1 = new String[]{"I", "love", "Java"};

        System.out.println(problem1(str1, 2, 4));
        System.out.println(problem1(str1, 0, 4));

        System.out.println(problem2(str1, str2));

        System.out.println(Arrays.toString(problem3(str3)));

        System.out.println(problem4(arr1));
    }


    public static String problem1(java.lang.String str, int strt, int end) {
        /*
        Given string “Algorithms”, return  “go” and “Algo” using substring
         */
        return str.substring(strt, end);
    }


    public static Boolean problem2(String str1, String str2){
        /*
        Given two strings, compare if these two strings are equal by comparing each character
         */
        return Arrays.equals(str1.toCharArray(), str2.toCharArray());
    }


    public static String[] problem3(String str){
        /*
        Given string “https://www.amazon.com/demo?test=abc”, return [“https”,”www”,”amazon”,”com”,”demo”,”test”,”abc”]
         */
        String re = "[^a-z^A-Z]";
        return str.split(re);
    }


    public static String problem4(String[] arr){
        /*
        Given a list of string array, combine them into one string sentence, return the string sentence
         */
        StringBuilder ans = new StringBuilder();
        for (String word: arr){
            ans.append(word);
            ans.append(" ");
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }
}
