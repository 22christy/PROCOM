package latihan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan18okt {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Luas Bangun Ruang");
		System.out.println("1. \tPersegi Panjang");
		System.out.println("2. \tSegitiga");
		System.out.println("3. \tLingkaran");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.print("Masukkan Pilihan <1/2/3> = ");
		int pilihan = Integer.parseInt(br.readLine());
		
		String bangun = null;
		double phi = 3.14;
		int panjang = 0;
		int lebar = 0;
		int alas = 0;
		int tinggi = 0;
		
		switch (pilihan) {
		case 1 :
			bangun = "Persegi Panjang";
			System.out.print("Masukkan Panjang \t= ");
			panjang = Integer.parseInt(br.readLine());
			System.out.print("Masukkan Lebar \t\t= ");
			lebar = Integer.parseInt(br.readLine());		
			System.out.print("Luas Persegi Panjang Adalah \t= " + panjang*lebar + "cm^");
			break;
			
		case 2 :
			bangun = "Segitiga";
			System.out.print("Masukkan Alas \t\t= ");
			alas = Integer.parseInt(br.readLine());
			System.out.print("Masukkan Tinggi \t= ");
			tinggi = Integer.parseInt(br.readLine());
			System.out.print("Luas Segitiga Adalah \t= " + alas*tinggi/2 + "cm^");
			break;
			
		case 3 :
			bangun = "Lingkaran";
			System.out.println("Masukkan Phi \t\t= " + phi);
			phi = 3.14; 
			System.out.print("Masukkan Jari-Jari \t= ");
			int jarijari = Integer.parseInt(br.readLine());
			System.out.print("Luas Lingkaran Adalah \t= " + String.format("%2f",phi*jarijari*jarijari) + "cm^");
			break;
			
		default :
			System.out.println("Salah Kode Pilihan");
		}
		
		
		
		

	}

}
