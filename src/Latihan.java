import java.io.*;

public class Latihan {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\t\tPROGRAM PENJUALAN SUSU");

		String nama = null, merk = null, ukuran = null;
		char kodeukuran;
		int kodesusu = 0, jumlah = 0, harga = 0;
		double subtotal = 0, potongan = 0, pajak = 0, total = 0;
		
		System.out.print("Masukkan Nama Pembeli \t\t: ");
		nama = br.readLine();
		
		System.out.print("Masukkan Kode Susu [1/2/3] \t: ");
		kodesusu = Integer.parseInt(br.readLine());
		
		System.out.print("Masukkan Kode Ukuran [S/M/L] \t: ");
		kodeukuran = br.readLine().charAt(0);
		
		System.out.print("Masukkan Jumlah Beli \t\t: ");
		jumlah = Integer.parseInt(br.readLine());
		
		if (kodesusu == 1 && (kodeukuran == 'S' || kodeukuran == 's')) 
		{
			merk = "Susu Indomilk";
			ukuran = "Small";
			harga = 5000;
		}
		else if (kodesusu == 1 && (kodeukuran == 'M' || kodeukuran == 'm')) 
		{
			merk = "Susu Indomilk";
			ukuran = "Medium";
			harga = 7500;
		}
		else if (kodesusu == 1 && (kodeukuran == 'L' || kodeukuran == 'l')) 
		{
			merk = "Susu Indomilk";
			ukuran = "Large";
			harga = 9500;
		}
		else if (kodesusu == 2 && (kodeukuran == 'S' || kodeukuran == 's')) 
		{
			merk = "Susu Dancow";
			ukuran = "Small";
			harga = 4500;
		}
		else if (kodesusu == 2 && (kodeukuran == 'M' || kodeukuran == 'm')) 
		{
			merk = "Susu Dancow";
			ukuran = "Medium";
			harga = 6500;
		}
		else if (kodesusu == 2 && (kodeukuran == 'L' || kodeukuran == 'l')) 
		{
			merk = "Susu Dancow";
			ukuran = "Large";
			harga = 8500;
		}
		else if (kodesusu == 3 && (kodeukuran == 'S' || kodeukuran == 's')) 
		{
			merk = "Susu Sustagen";
			ukuran = "Small";
			harga = 9500;
		}
		else if (kodesusu == 3 && (kodeukuran == 'M' || kodeukuran == 'm')) 
		{
			merk = "Susu Sustagen";
			ukuran = "Medium";
			harga = 15500;
		}
		else if (kodesusu == 3 && (kodeukuran == 'L' || kodeukuran == 'l')) 
		{
			merk = "Susu Sustagen";
			ukuran = "Large";
			harga = 19500;
		}	
		else  
		{
			merk = "";
			ukuran = "";
			harga = 0;
		}		
		
		subtotal = harga * jumlah;
		
		if (jumlah > 25) {
			potongan = 0.05 * subtotal;
		} else {
			potongan = 0;
		}
		
		pajak = 0.1 * subtotal;
		
		total = subtotal + pajak - potongan;
		
		System.out.println("\t\tSTRUK PEMBAYARAN");

		System.out.println("Nama Pembeli \t\t: " + nama);
		System.out.println("Merk Barang \t\t: " + merk);
		System.out.println("Jenis Ukuran \t\t: " + ukuran);
		System.out.println("Jumlah Beli \t\t: " + jumlah);
		System.out.println("Harga Barang \t\t: Rp. " + harga);
		System.out.println("Jumlah Pembayaran \t: Rp. " + String.format("%.0f", subtotal));
		System.out.println("Potongan \t\t: Rp. " +  String.format("%.0f", potongan));
		System.out.println("Pajak \t\t\t: Rp. " + String.format("%.0f", pajak));
		System.out.println("Total Pembayaran \t: Rp. " + String.format("%.0f", total));

	}

}
