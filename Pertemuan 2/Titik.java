/*
	Titik.java  08/03/2023
	Nama      : Athiya Puteri Hidayat
	NIM       : 24060121140128
	Deskripsi : kelas untuk titik
*/

class Titik{
	public Double absis;
	public  Double ordinat;
	public  static int counterTitik;
	
	public void Titik(){
		counterTitik++;	
	}
	public void setAbsis(Double a){
		absis = a;
	}

	public void setOrdinat(Double o) {
		ordinat = o;
	}

	public Double getAbsis() {
		return absis;
	}

	public Double getOrdinat() {
		return ordinat;
	}

	public static int getCounterTitik() {
		return counterTitik;
	}
}