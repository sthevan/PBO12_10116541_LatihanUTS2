/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sthevan.model;

/**
 *
 * @author STHEVAN REYNALDO  SIMAK LANDO (10116541) PBO-12
 */
class gajiPegawai{
    private String nama;
private String alamat;
private int uangtunjangan,uangTransport,gajiPokok,totalGaji;

    public void setnama(String nama){
this.nama=nama;
}
public String Getnama(){
return nama;
}
public void setAlamat(String alamat){
this.alamat=alamat;

}
public String getAlamat(String alamat){
return alamat;
}
public void SetUangtrasnport(int uangTransport){
this.uangTransport=uangTransport;
}

public int getUangtrasnport(int uangTransport){
return uangTransport;
}
public void setUangtunjangan(int uangTunjangan){
this.uangtunjangan=uangTunjangan;
}
public int getUangtunjangan(){
return uangtunjangan;
}
public void GajiPokok(int gajiPokok){
this.gajiPokok=gajiPokok;
}
public int getGajiPokok(){
return gajiPokok;
}
public int totalGaji(){
    totalGaji=uangTransport+uangtunjangan+gajiPokok;
return totalGaji;
}
    
}
public class IF12_10116541_LatihanUTS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
