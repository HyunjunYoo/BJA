import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner	in = new Scanner(System.in);
		int X = in.nextInt();
		int N = in.nextInt();

		int result = 0;
		
		for(int i=0; i<N; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			result += a * b;
		}
				
		if(X == result) {
			System.out.println("Yes");
		} else	{
			System.out.println("No");
		}
		
	}
}