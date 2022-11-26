package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ukm {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Calculator");
	System.out.println("Perintah :");
	System.out.println("1. Penjumlahan");
	System.out.println("2. Pengurangan");
	System.out.println("3. Perkalian");
	System.out.println("4. Pembagian");
	
	System.out.print("Masukkan Perintah : ");
	int pilihan = Integer.parseInt(br.readLine());
	
	System.out.print("Masukkan a : ");
	int a = Integer.parseInt(br.readLine());
	System.out.print("Masukkan b : ");
	int b = Integer.parseInt(br.readLine());
	
	Ukm main = new Ukm();
	
	//new (namaclass) ().printNumber (tambah(a,b)) 
	// atau : main.printNumber (tambah(a,b))
	switch (pilihan) {
	case 1 :
		new Ukm ().printNumber(tambah(a,b));
	break;	
	case 2 :
		new Ukm ().printNumber(kurang(a,b));
	break;	
	case 3 :
		main.printNumber(kali(a,b));
	break;	
	case 4 :
		main.printNumber(bagi(a,b));
	break;	
	default :
		main.showError();
	}
	
	System.out.println("Apakah Anda Ingin Mengulang Program <Y/T> =");
	char repeat = br.readLine().charAt(0);
	
	if (repeat == 'Y'||repeat == 'y') {
		main(new String[] {});
	}else {
		System.out.println("Terima Kasih");
	}
	
	
	}
	static int tambah (int a , int b) {
		return a+b;
	}

	static int kurang (int a, int b) {
		return a-b;
	}
	static int kali (int a, int b) {
		int hasil = a*b;
		return hasil;
	}
	static int bagi (int a , int b) {
		int result;
		try {
			result = a/b;
		}catch(Exception e) {
			result =0;
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
		return result;
		
	}
	void printNumber (int number) {
		System.out.println("Hasil = " + number);
	}
	void printNumber (double number) {
		System.out.println("Hasil = " + number);
	}
	void showError() {
		System.out.println("Pilihan yang dipilih tidak valid");
	}
}
