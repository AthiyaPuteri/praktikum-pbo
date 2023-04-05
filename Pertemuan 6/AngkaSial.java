/**
 * File		: AngkaSial.java 02/04/2023
 * Nama		: Athiya Puteri Hidayat
 * Deskripsi	: Program penggunaan exception buatan sendiri  
 * 		  Pengenalan klausa 'throw' dan 'throws'
 */

 public class AngkaSial{
 	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka == 13) {
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}

	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
			}
	}
 }

//Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi
//Jawab : Untuk baris 12 akan dieksekusi ketika metode 'cobaAngka()' dipanggil pada baris 18 dan 20, tetapi
//        tidak akan dieksekusi ketika eksepsi tejadi pada baris 19.
//Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
//Jawab : Untuk baris 21 akan dieksekusi setelah blok 'catch' dieksekusi.