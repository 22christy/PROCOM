package pertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Laithan2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Input n = ");
		int n = Integer.parseInt(br.readLine());
		
		int i =0;
		int j =0;
		
		for (i = 1; i <= n; i++) {
			for ( j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("=================================");
		for (i = 1; i <= n; i++) {
			for ( j = 1; j <= n; j++) {
				System.out.print("* ");	
				if (i == j) {
				break;
				}
			}
			System.out.println();
		
		}
		
		System.out.println("=================================");
		for (i = 1; i <= n; i++) {
			for ( j = 1; j <= n; j++) {
				System.out.print("* ");	
				if ( n < (i+j)) {
					break;
				}
			}
			System.out.println();
		
		}
		System.out.println("=================================");
		for (i = 1; i <= n; i++) {
			for ( j = 1; j <= n; j++) {
				System.out.print("* ");	
				if (i == j) {
				break;
				}else if( n < (i+j)) {
					break;
				}
			}
			System.out.println();
		
		}
		System.out.println("=================================");
		for (i = 1; i <= n; i++) {
			for ( j = 1; j <= n; j++) {
				System.out.print("* ");	
				if (n < (j+i)) {
					break;
				}else if ((j >= n)&&(j-i)>4) {
					break;
				}else if ((j<= n)&& (i+j)<4) {
					System.out.print(" ");
					continue;
				}
				System.out.print("* ");
			}
			System.out.println();
		
		}
	}

}
