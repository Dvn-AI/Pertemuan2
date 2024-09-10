/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasconstructor;

/**
 *
 * @author DAGH
 */
public class MahasiswaSI extends Mahasiswa {
    private String mataKuliah;
    
    
    public MahasiswaSI(String nama, int umur,String NIM, String jurusan) {
    super(nama,umur,NIM,jurusan);
    }       
    
    /**
     *
     */
    @Override
    public void output(){
        super.output();
        this.mataKuliah= "PBO";
        System.out.println(this.getNama()+" sedang mengikuti kelas "+ this.mataKuliah);
    }
    public void Ilmungoding(){
        System.out.println("Ngoding Terus, kapan liburnya");
    }
}    

