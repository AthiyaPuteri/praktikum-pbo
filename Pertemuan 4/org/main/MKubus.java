/*
* File      : MKubus.java 21/03/2023
* Penulis   : Athiya Puteri Hidayat
* Deskripsi : driver class untuk kubus dan bujur sangkar
*/

package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus {
  public static void main(String[] args) {
    BujurSangkar bujurSangkar = new BujurSangkar(4);
    Kubus kubus = new Kubus(bujurSangkar);

    int jumlahSisi = bujurSangkar.getJumlahSisi();

    double luasAlas = kubus.hitungLuasAlas();
    System.out.println("Luas Permukaan Kubus dengan panjang sisi " + jumlahSisi + " satuan : " + luasAlas);

    double volumeKubus = kubus.hitungVolume();
    System.out.println("Volume Kubus dengan panjang sisi " + jumlahSisi + " satuan : " + volumeKubus);

  }
}
