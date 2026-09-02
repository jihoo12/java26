package method;
import java.util.Scanner;
public class Gugudan {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    gugudan(num);
	}
	public static void gugudan(int num) {
	    System.out.println("[구구단 "+ num + "단]");
	    System.out.printf("[구구단 %d단]\n", num);
	    for (int i = 1; i <= 9; i++) {
		    System.out.println(num + " x " + i + " = " + num*i);
	    }
	}
}
