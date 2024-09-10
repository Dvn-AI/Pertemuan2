/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasconstructor;

/**
 *
 * @author DAGH
 */
public class Me extends Mahasiswa implements Holiday, DailyActivity {

    public Me(String nama, int umur, String NIM, String jurusan) {
        super(nama, umur, NIM, jurusan);
    }
    
    public void cek(){
        super.kuliah();
        this.kuliah();
    }
    @Override
    public void bangunTidur(){
    System.out.println("Saya bangun tidur jam 06:00");
    }
    
    @Override
    public void makan(){
    System.out.println("Saya makan nasi dengan lauk seadanya"); 
    }
    
    @Override
    public void mandi(){
    System.out.println("Saya mandi setelah makan");
    }
    
    @Override
    public void kuliah(){
    System.out.println("Saya berangkat kuliah jam 07:00");
    }
    
    @Override
    public void olahraga(){
    System.out.println("Saya olahraga saat liburan");
    }
    
    /**
     *
     */
    @Override
    public void belajar(){
    System.out.println("Saya belajar saat liburan");
    }
}
