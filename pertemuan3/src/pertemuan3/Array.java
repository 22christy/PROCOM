package pertemuan3;
import java.io.*;
import java.util.*;

public class Array {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		String [] namaBuah = new String [5];
//		Scanner input = new Scanner(System.in);
//		
//		for(int i =0; i< namaBuah.length; i++) {
//			
//			System.out.println("Masukkan nama buah ke " + (i+1) + "= " );
//			namaBuah[i] = input.nextLine();
//			
//		}
//		
//		for(int i = 0; i<namaBuah.length; i++) {
//			System.out.println("Buah ke - " + (i+1) + "= " + namaBuah[i]);
//		}
//		int [] jumlah1 = new int [5];
		
		
//		String namaBuah = 
		
//		String []namaTeman = new String[4];
//		namaTeman [0]= "Ucok";
//		namaTeman [1] = "Kasdi";
//		namaTeman[2] = "Icak";
//		namaTeman[3] = "ocuk";
//		
//		System.out.println(namaTeman[3]);
//		
//		int[] umur = {17,19,101} ; 
//		String[] nama = {"Ucok", "Titi", "yo", "Kasdi", "Lilian"};
//		 
//		for(int i = 0; i<nama.length; i++) {
//			System.out.println(nama[i]);
//		}
//		System.out.printf(umur[]);
		
//		String []namaBuah = new String [5];
//		namaBuah [0]="Apel";
//		namaBuah [1]="Mangga";
//		namaBuah [2]="Jeruk";
//		namaBuah [3]="Stoberi";
//		namaBuah [4]="Durian";
//		
//		for(int i = 0; i<namaBuah.length; i++) {
//			System.out.println(namaBuah[i]);
//		}
		String [][] mahasiswa = {
				{"2222222", "Ucok"},
				{"4444444", "Icak"},
				{"3333333", "couk"}
		};
		
//		System.out.println(mahasiswa.length);
		for (int baris = 0; baris < mahasiswa.length; baris++) {
			for(int kolom = 0; kolom < mahasiswa[baris].length; kolom++) {
				System.out.print(mahasiswa[baris][kolom]+ " ");
			}
			System.out.println("");
		}
		
		
		
	}

}
