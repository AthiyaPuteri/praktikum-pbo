/**
 * File		: Pegawai.java 09/05/2023
 * Nama		: Athiya Puteri Hidayat
 * NIM		: 24060121140128
 * Deskripsi	: SuperClass dari kelas Programmer dan Manajer 
 *		  
 */

public class Pegawai{
	String nama;
	int gajiPokok = 5000000;

	public void setNama(String nama){
		this.nama = nama;
	}

	public void tampilData(){
		System.out.println("Nama : "+nama + ", Gaji Pokok : "+gajiPokok);
	}
}