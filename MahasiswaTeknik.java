/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasconstructor;

/**
 *
 * @author DAGH
 */
public class MahasiswaTeknik extends Mahasiswa {
    public String mataKuliah;
    
    
    public MahasiswaTeknik(String nama, int umur,String NIM, String jurusan) {
    super(nama,umur,NIM,jurusan);
    this.mataKuliah = "Engineering";
    }       
    
    @Override
    public void output(){
        super.output();
        System.out.println(this.getNama()+" belajar "+ this.mataKuliah);
    }
}
