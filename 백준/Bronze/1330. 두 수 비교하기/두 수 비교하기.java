import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A > B) {
			System.out.println(">");
		} else if (A < B){
			System.out.println("<");
		} else if(A == B) {
			System.out.println("==");
		}
	}
}