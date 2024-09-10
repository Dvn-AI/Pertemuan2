/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasconstructor;

/**
 *
 * @author DAGH
 */
public class Mahasiswa {
    public String nama;
    public int umur;
    public String NIM;
    public String jurusan;

    public Mahasiswa(String nama, int umur,String NIM,String jurusan) {
        System.out.println("Halo dari konstuktor");
        this.nama = nama;
        this.umur = umur;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }
    public void kuliah(){
        System.out.println("Hari ini masuk kuliah");
    }
        public void output(){
        System.out.println(this.nama+ " adalah mahasiswa");
        System.out.println("Umur :"+ umur);
        System.out.println("NIM :"+ NIM);
        System.out.println("Jurusan :"+ jurusan);
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the umur
     */
    public int getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }
    

    
}

