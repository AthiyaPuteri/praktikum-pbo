/**
 * File		: BangunDatarGenericTest.java 24/05/2023
 * Nama		: Athiya Puteri Hidayat
 * NIM		: 24060121140128
 * Deskripsi	: Main class untuk generic bangun datar
 *		  
 */

public class BangunDatarGenericTest{
    public static void main(String[] args){
        Lingkaran lingkaran = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = 
                new BangunDatarGeneric<Lingkaran>();
        bdg.set(lingkaran);
        System.out.println("keliling lingkaran : "
                                    +bdg.hitungKeliling());
        System.out.println("tipe generic : "
                            +bdg.get().getClass().getName());
    }
}