import org.apache.commons.lang3.StringUtils;

public class App {
    public static boolean isPalindrome(String text) {
       String input = (text.toLowerCase());
       return input.equals(StringUtils.reverse(input));


    }   
    public static void main(String[] args) {
      System.out.println(App.isPalindrome("Ага"));

    }
}
