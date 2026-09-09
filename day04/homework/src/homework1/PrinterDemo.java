public class PrinterDemo {
        public static void main(String[] args) {
        Printer printer = new Printer(20, true);
        printer.print(25);
        printer.setDuplex(false);
        printer.print(10);
    }
}
