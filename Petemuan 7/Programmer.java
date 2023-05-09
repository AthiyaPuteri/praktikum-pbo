/**
 * File		: Programmer.java 09/05/2023
 * Nama		: Athiya Puteri Hidayat
 * NIM		: 24060121140128
 * Deskripsi	: Kelas Programmer yang merupakan turunan dari kelas Pegawai
 *		  
 */

public class Programmer extends Pegawai{
	private int bonus = 450000;

	public Programmer(String nama){
		setNama(nama);
	}

	public void tampilData(){
		super.tampilData();
		System.out.println("Bonus: "+bonus);
	} 
}