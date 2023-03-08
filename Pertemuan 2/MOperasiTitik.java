/*
	MOperasiTitik.java  08/03/2023
	Nama      : Athiya Puteri Hidayat
	NIM       : 24060121140128
	Deskripsi : Main
*/

public class MOperasiTitik {
	public static void main(String[] args){
		Titik t1;
		t1 = new Titik();
		t1.setAbsis(4.0);
		t1.setOrdinat(4.0);
        	OperasiTitik op = new OperasiTitik();
            
        	System.out.println("t1.x = " + t1.absis);
		System.out.println("t1.y = " + t1.ordinat);   
      
        	op.refleksiX(t1);
        	System.out.println("t1.x setelah refleksi x = " + t1.getAbsis());
                System.out.println("t1.y setelah refleksi x = " + t1.getOrdinat());

        	op.refleksiY(t1);
        	System.out.println("t1.x setelah refleksi y = " + t1.getAbsis());
		System.out.println("t1.y setelah refleksi y = " + t1.getOrdinat()); 
		 
    }
}