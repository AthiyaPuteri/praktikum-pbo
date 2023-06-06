/**
 * File		: LambdaMap.java 05/06/2023
 * Nama		: Athiya Puteri Hidayat
 * NIM		: 24060121140128
 * Deskripsi 	: Implementasi lambda pada map
**/

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<Integer, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put(121140128, "Athiya Puteri Hidayat");
	mahasiswaMap.put(121130076, "Mahardika Putra Wardhana");
	mahasiswaMap.put(121130800, "Thifa Ziada Taqiyya");
	mahasiswaMap.put(121140164, "Zenobia Wirandi Zenaide");
        mahasiswaMap.put(121140100, "Zhafira Amanda");


        // lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
