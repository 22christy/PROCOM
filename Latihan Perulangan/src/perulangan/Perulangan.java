package perulangan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Perulangan {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 0;
		int jumlah = 0;
		
		System.out.print("Masukkan n = ");
		n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			if (i == n) {
				System.out.print(i + "=");
		} else {
			System.out.print(i + "+");
			}
		jumlah = jumlah + i;
		}
		System.out.println(jumlah);
		
	}

}
