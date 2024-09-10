/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasconstructor;

/**
 *
 * @author DAGH
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //object
        MahasiswaSI mahasiswa1 = new MahasiswaSI("Davin", 19, "09020623020", "Sistem Informasi");
        mahasiswa1.output();

        /* MahasiswaTeknik mahasiswa2 = new MahasiswaTeknik("Anton",19,"090234567","Teknik Informatika");
        mahasiswa2.output();*/
        System.out.println("");

        //up casting dari MahasiswaSI ke Mahasiswa
        Mahasiswa mahasiswaUp = (Mahasiswa) mahasiswa1;
        mahasiswaUp.output();

        System.out.println("");
        Me Davin = new Me("Davin", 19, "09020623020", "Sistem Informasi");
        Davin.bangunTidur();
        Davin.mandi();
        Davin.makan();
        Davin.kuliah();
        Davin.olahraga();
        Davin.belajar();
        Davin.cek();

        /*down casting 
        MahasiswaSI mahasiswa2 = (MahasiswaSI) mahasiswaUp;
        mahasiswa2.output();
        mahasiswa2.Ilmungoding();
         */
    }
}
