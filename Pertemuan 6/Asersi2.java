/**
 * File		: Asersi2.java 02/04/2023
 * Nama		: Athiya Puteri Hidayat
 * Deskripsi	: Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * 
 */

 //class Lingkaran
 class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari) {
		this.jariJari = jariJari;
	}
	public double hitungKeliling() {
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
 }

 //class Asersi2
 public class Asersi2{
	public static void main(String[] args) {
		double jariJari = 0;
		assert(jariJari > 0) : "jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran ="+kelilingLingkaran);
	}
 }

//secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 
//Jawab: Secara konsep, tidak terdapat kesalahan. Namun, penggunaan asersi tidak
//       terkalu berguna karena nilai 'jariJari' didefinisikan dengan 0. Oleh karena
//	 itu, asersi harus digunakan setelah variabel 'jariJari' diberikan nilai yang sesuai.