/*
 * File : Poligon.java 08/03/2023
 * Penulis : Athiya Puteri Hidayat
 * Deskripsi : representasi dasar dari objek poligon (segi banyak)
*/

package org.poligon;

public class Poligon {
  protected int jumlahSisi;

  public Poligon() {

  }

  public void setJumlahSisi(int jumlahSisi) {
    this.jumlahSisi = jumlahSisi;
  }

  public int getJumlahSisi() {
    return this.jumlahSisi;
  }

}