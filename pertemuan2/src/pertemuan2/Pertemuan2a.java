package pertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pertemuan2a {

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Kode Bulan = ");
			int kodebulan = Integer.parseInt(br.readLine());
			
			String namabulan = null;
			
		if (kodebulan == 1) {
			namabulan = "Januari";
			
		} else if ( kodebulan == 2) {
			namabulan = "Februari";
			
		} else if ( kodebulan == 3) {
			namabulan = "Maret";

		} else if ( kodebulan == 4) {
			namabulan = "April";
			
		} else if ( kodebulan == 5) {
			namabulan = "Mei";
			
		} else if ( kodebulan == 6) {
			namabulan = "Juni";

		} else if ( kodebulan == 7) {
			namabulan = "Juli";
			
		} else if ( kodebulan == 8) {
			namabulan = "Agustus";
			
		} else if ( kodebulan == 9) {
			namabulan = "September";

		} else if ( kodebulan == 10) {
			namabulan = "Oktober";
			
		} else if ( kodebulan == 11) {
			namabulan = "November";
			
		} else if ( kodebulan == 12) {
			namabulan = "Desember";

		} else {
			System.out.println("Salah Kode Bulan");
		}
		System.out.println("Nama Bulan = " + namabulan);
		}	
}
