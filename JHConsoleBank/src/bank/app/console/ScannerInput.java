package bank.app.console;

import java.util.Scanner;

final public class ScannerInput {
    private static final Scanner scanner = new Scanner(System.in);
    public String readString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
    public int readInt(String message) {
        while (true) {
            System.out.print(message);
            String inStr = scanner.nextLine().trim();
            try {
                return Integer.parseInt(inStr);
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력하세요.");
            }
        }
    }
    public boolean readYesNo(String message) {
        System.out.print(message + "(y/n)");
        String in = scanner.nextLine().trim();
        
        switch (in.toLowerCase()) {
            case "y" : return true;
            case "n" : return false;
            default : return false;
        }
    }
}
