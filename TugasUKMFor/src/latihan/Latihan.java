package latihan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Input n = ");
		int n = Integer.parseInt(br.readLine());
		
		int i = 0;
		int j = 0;
		
		for (i = 1; i <= n; i++) {
			for ( j = 1; j <= n; j++) {
				if ( j == 1 || j == i) {
					System.out.print("*");
				} else if (i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
