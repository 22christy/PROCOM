package pertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pertemuan2c {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input n = ");
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {

			System.out.println(n);
			
		}
		

	}

}
