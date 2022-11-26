package pertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pertemuan2b {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Kode Bulan = ");
		int kodebulan = Integer.parseInt(br.readLine());
		
		String namabulan = null;
		
		switch (kodebulan) {
		
		case 1 :
			namabulan = "Januari";
		break;
		
		case 2 :
			namabulan = "Februari";
		break;
		
		case 3 :
			namabulan = "Maret";
		break;
		
		case 4 :
			namabulan = "April";
		break;
		
		case 5 :
			namabulan = "Mei";
		break;
		
		case 6 :
			namabulan = "Juni";
		break;
		
		case 7 :
			namabulan = "Juli";
		break;
		
		case 8 :
			namabulan = "Agustus";
		break;
		
		case 9 :
			namabulan = "September";
		break;
		
		case 10 :
			namabulan = "Oktober";
		break;
		
		case 11 :
			namabulan = "November";
		break;
		
		case 12 :
			namabulan = "Desember";
		break;
		
		default :
			namabulan = "Tidak Ditemukan";
			System.out.println("Salah Kode Bulan");
		}
		System.out.println("Nama Bulan = " + namabulan);
		}
		 
		

		

	}


