/**
 * File		: LambdaList.java 05/06/2023
 * Nama		: Athiya Puteri Hidayat
 * NIM		: 24060121140128
 * Deskripsi	: Implementasi lambda pada list, digunakan sebagai parameter pada method
**/

public class LambdaList{
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakab sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}