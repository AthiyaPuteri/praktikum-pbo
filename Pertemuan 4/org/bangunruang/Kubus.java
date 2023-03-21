/*
* File      : Kubus.java 21/03/2023
* Penulis   : Athiya Puteri Hidayat
* Deskripsi : representasi dari objek kubus, turunan kelas bujursangkar
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
  private BujurSangkar permukaan;

  public Kubus(BujurSangkar permukaan) {
    this.permukaan = permukaan;
  }

  public double hitungVolume() {
    double sisi = permukaan.getPanjangSisi();
    double volume = sisi * sisi * sisi;
    return volume;
  }

  public double hitungLuasAlas() {
    double luasAlas = permukaan.hitungLuas();
    return luasAlas;
  }
}