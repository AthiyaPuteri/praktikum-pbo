/**
 * File		: BangunDatarGeneric.java 24/05/2023
 * Nama		: Athiya Puteri Hidayat
 * NIM		: 24060121140128
 * Deskripsi	: Kelas konstruksi generic BangunDatar
 *		  
 */

public class BangunDatarGeneric<T1 extends BangunDatar>{
	private T1 bangunDatar;
	
	public void set(T1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T1 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

//Metode untuk memberikan nama yang lebih deskriptif pada parameter generic adalah 
//dengan mengubah suatu karakter 'T' menjadi karakter lain, seperti T1, T1234. Metode ini bertujuan 
//memberikan fleksibilitas dalam penggunaan data dan juga untuk membedakan 
//ketika terdapat lebih dari satu parameter generic dalam kelas tersebut.