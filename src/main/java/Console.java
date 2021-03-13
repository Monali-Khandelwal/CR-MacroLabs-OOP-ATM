import java.util.Scanner;

public class Console {

    public String getStringInput() {
        Scanner s = new Scanner(System.in);
        String userInput = s.nextLine();
        return userInput;

    }

}
