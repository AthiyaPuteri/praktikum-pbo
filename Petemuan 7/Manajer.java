/**
 * File		: Manajer.java 09/05/2023
 * Nama		: Athiya Puteri Hidayat
 * NIM		: 24060121140128
 * Deskripsi	: Kelas Manajer yang merupakan turunan dari kelas Pegawai 
 *		  
 */

public class Manajer extends Pegawai{
	private int tunjangan = 700000;

	public Manajer(String nama){
		setNama(nama);
	}
	
	public void tampilData(){
		super.tampilData();
		System.out.println("Tunjangan: "+tunjangan);
	}
}