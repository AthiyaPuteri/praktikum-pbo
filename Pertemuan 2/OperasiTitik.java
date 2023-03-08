/*
	OperasiTitik.java  08/03/2023
	Nama      : Athiya Puteri Hidayat
	NIM       : 24060121140128
	Deskripsi : kelas untuk operasi titik
*/

class OperasiTitik{
	private void refleksiSumbuX(Titik titik) {
		Double ordinat = titik.getOrdinat();
		titik.setOrdinat(-1 * ordinat);
	}
	private void refleksiSumbuY(Titik titik) {
		Double absis = titik.getAbsis();
		titik.setAbsis(-1 * absis);
	}

	public Titik refleksiX(Titik t1){
		refleksiSumbuX(t1);
       		return t1;
	}
    
   	public Titik refleksiY(Titik t1){
       		refleksiSumbuY(t1);
        	return t1;
    }
}