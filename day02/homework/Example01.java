package homework;

public class Example01 {

    public static void main(String[] args) {
        int totalRows = 6;

        for (int row = 1; row <= totalRows; row++) {
            String spaces = " ".repeat(totalRows - row);
            String stars = "*".repeat(2 * row - 1);

            System.out.println(spaces + stars);
        }
    }
}
