package latuts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latuts {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("=======TOKO PAKAIAN BAGUS=======");
		System.out.println("================================");
		System.out.print("berapa banyak Pakaian = ");
		int banyak= Integer.parseInt(br.readLine());	

		int []data = new int [banyak];
		int []subtotal = new int [banyak];
		String[] pilih = new String [banyak];
		String[] ukuran = new String [banyak];
		String []bahan = new String [banyak];
		String pilihan=null;
		int [] harga = new int [banyak];
		String jenis =null;
		int jumlah = 0;
		int total = 0;


		for (int i =0 ; i < banyak ; i++) {
			System.out.println("================================");
			System.out.printf("Data pakaian %d ", i+1);
			System.out.println();
			System.out.print("Masukan pilihan pakaian = ");
			pilihan = br.readLine();
			System.out.print("masukan bahan pakaian = ");
			jenis = br.readLine();
			System.out.print("Masukan ukuran pakaian = ");
			ukuran[i] = br.readLine();
			System.out.println("=================================");

				if (pilihan.equalsIgnoreCase("KM")){
					pilih[i]  = "kemeja";
					harga[i] = 120000;
				}else if(pilihan.equalsIgnoreCase("KS")){
					pilih[i] = "kaos";
					harga[i] = 60000;
				}else if(pilihan.equalsIgnoreCase("JT")){
					pilih[i]  = "Jaket";
					harga[i] = 120000;
				}else if(pilihan.equalsIgnoreCase("JS")){
					pilih[i]  = "Jas";
					harga[i] = 225000;
				}

				if (jenis.equalsIgnoreCase("C")) {
					bahan[i] = "Cotton";
				}else if (jenis.equalsIgnoreCase("J")) {
					bahan[i]  = "Jeans";
				}else if (jenis.equalsIgnoreCase("S")) {
					bahan[i]  = "Spandek";
				}else if (jenis.equalsIgnoreCase("W")) {
					bahan[i]  = "Wol";
				}

				System.out.println("Pilihan Pakaian = " + pilih[i]);
				System.out.println("Bahan Pakaian  = " + bahan[i]);
				System.out.println("Ukuran Pakaian = " + ukuran[i]);
				System.out.println("Harga Satuan =  "+ harga[i]);
				System.out.println("==================================");
				System.out.print("Masukkan Jumlah Beli = ");
				jumlah = Integer.parseInt(br.readLine());

				subtotal [i] = jumlah * harga[i];
				System.out.println("SubTotal  = " + subtotal[i]);

		}

		System.out.println("Jadi Pembelian Anda adalah = ");
		System.out.println("NO.     Pilihan \t Bahan\t\tUkuran \t\t Subtotal");
		System.out.println("===================================================================================");
		for (int i=0;i<banyak;i++) {
			System.out.printf("%d \t%s \t\t %s  \t%s \t\t %d ", i+1, pilih[i], bahan[i],ukuran[i], subtotal[i]);
			System.out.println();
			total = total+ subtotal[i];
		}
	
	System.out.println();
	System.out.println("Total Bayar = Rp." + total);
}
}