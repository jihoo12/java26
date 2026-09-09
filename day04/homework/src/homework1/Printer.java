class Printer {
    private int numOfPapers;
    private boolean duplex;

    public Printer(int numOfPapers, boolean duplex) {
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }

    public void print(int amount) {
        int requiredPapers = amount;
        if (duplex) {
            requiredPapers = (amount / 2) + (amount % 2);
        }

        String type = duplex ? "양면으로" : "단면으로";

        if (numOfPapers == 0) {
            System.out.println("용지가 없습니다.");
            return;
        }

        if (requiredPapers > numOfPapers) {
            int shortPapers = requiredPapers - numOfPapers;
            System.out.printf("%s 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", type, shortPapers, numOfPapers);
            numOfPapers = 0;
        } else {
            numOfPapers -= requiredPapers;
            System.out.printf("%s %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", type, requiredPapers, numOfPapers);
        }
    }

    public boolean getDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}

public class PrinterDemo {
    public static void main(String[] args) {
        Printer p = new Printer(20, true);
        p.print(25);
        p.setDuplex(false);
        p.print(10);
    }
}
