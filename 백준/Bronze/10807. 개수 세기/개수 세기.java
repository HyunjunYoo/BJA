import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result=0;
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		
		for(int j=0; j<arr.length; j++) {
			if(arr[j] == v) {result += 1;}
		}
		
		System.out.println(result);
	}
}