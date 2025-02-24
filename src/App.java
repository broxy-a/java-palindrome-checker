import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;


public class App {
    public static boolean isPalindrome(String text) {
       String input = (text.toLowerCase());
       String reversed = StringUtils.reverse(input);
       
       return input.equals(reversed);


    }   
    public static void main(String[] args) {
      //System.out.println(App.isPalindrome("Ага"));
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите слово для проверки на палиндром: ");

      
      String input = scanner.nextLine();
      System.out.println("Результат " + isPalindrome(input));

      scanner.close();

      
    }
}
