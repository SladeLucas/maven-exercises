import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;


public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something:");
        String input = scanner.nextLine();
        System.out.println("You entered: " + "\"" + input + "\"");
        System.out.println(StringUtils.isNumeric(input) + ", " + "\"" + input + "\"" + " is not a number");
        System.out.println("Case Flipped: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));
    }
}
