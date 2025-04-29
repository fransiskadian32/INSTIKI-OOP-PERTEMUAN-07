/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan07;

/**
 *
 * @author LAB F
 * TGL:29-04-2025
 */
public class mahasiswa {
  private String NIM, NAMA;
  
  public void datamhs(){
      System.out.println("menampilkan data Mahasiswa");
      
  }
  public void datamhs(String nNIM){
  this.NIM = nNIM;
  System.out.printf("Data Mahasiswa Dengan NIM%S",this.NIM);
}
public void datamhs(String nNIM,String nNAMA){
    this.NIM = nNIM;
    this.NAMA = nNAMA;
    System.out.printf("Data Mahasiswa dengan NIM %S ADALAH %S\n", this.NIM,this.NAMA);
}
}