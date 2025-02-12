import java.util.*;
//import -> udah ada dipakai aja
//package -> bikin sendiri
//dalam file ini bisa menggunakan semua yang termasuk dalam java.util
//* artinya pakai semua function dalam java.util

public class Main {
    //nama class sama dengan nama file
    int x = 99;
    String nama = "Anton";
    
    //constructor
    public Main(){
      System.out.println("Welcome" + nama);
    }
    
    // public Main(){
    //   x = 88;
    //   System.out.println(x);
    // }
    
    // public Main(int a){
    //   x = 88 + a;
    //   System.out.println(x);
    // }
    
    
    
    public static void main(String[] args) {
      new Main();
      // new Main();
      // new Main(100); //create object from class Main
      //kalau panggil dengan parameter akan otomatis cocokin
      
      // System.out.println("Hello, World!");
      //final -> constant 
      // final double value = 5.5;
      
      //Integer, String -> class -> ada attribute dan methodnya
      //Cth : String s;
      //s.Equal();
      //int, char, boolean, double -> type data primitive
  }
}