package soal2_Christy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soal2_Christy {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("");
	System.out.println("                APLIKASI NILAI MAHASISWA");
	System.out.println("");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	System.out.print("Masukkan NPM \t= ");
	String npm = br.readLine();
	System.out.print("Masukkan Nama \t= ");
	String nama = br.readLine();
	System.out.print("Masukkan Nilai Kuis \t= ");
	int Nkuis = Integer.parseInt(br.readLine());
	System.out.print("Masukkan Nilai Tugas \t= ");
	int Ntugas = Integer.parseInt(br.readLine());
	System.out.print("Masukkan Nilai UTS \t= ");
	int Nuts = Integer.parseInt(br.readLine());
	System.out.print("Masukkan Nilai UAS \t= ");
	int Nuas = Integer.parseInt(br.readLine());
	System.out.print("Masukkan Nilai Softskill \t= ");
	int Nsoftskill = Integer.parseInt(br.readLine());
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	int kuis = (int) (0.1*Nkuis);
	int tugas = (int) (0.2*Ntugas);
	int uts = (int) (0.3*Nuts);
	int uas = (int) (0.3*Nuas);
	int softskill = (int) (0.1*Nsoftskill);
	int total = kuis + tugas + uts + uas + softskill;
	
	String grade = " ";
	
	if (total >= 80 && total <= 100) {
		grade = "A";
	}else if (total >= 76) {
		grade = "A-";
	}else if (total >= 72) {
		grade = "B+";
	}else if (total >= 68) {
		grade = "B";
	}else if (total >= 64) {
		grade = "B-";	
	}else if (total >= 60) {
		grade = "C+";
	}else if (total >= 56) {
		grade = "C";
	}else if (total >= 46) {
		grade = "D";
	}else if (total < 46) {
		grade = "E";
	}
	
	System.out.println("NPM \t= " + npm);
	System.out.println("Nama \t= " + nama);
	System.out.println("Total Nilai \t= " + total);
	System.out.println("Grade \t= " + grade);
	}

}
