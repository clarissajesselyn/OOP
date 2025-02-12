import java.util.*;
public class Main {
    public Scanner sc;

    //constructor
    public Main(){
        sc = new Scanner (System.in);
        int angka = sc.nextInt(); sc.nextLine();
        String nama = sc.nextLine(); //input masukin yang dimasukin di sc ke varaiabel nama
        //nextLine -> bisa jadi kayak getchar
        System.out.println("Welcome " + nama);
        System.out.println(angka);

        System.out.println (Math.cos(88));

        Main.Hello(); //dipanggil sebagai static
        // Main m = new Main(); //panggil function yang tidak static
        // m.Hello2();
    }

//    public void Hello2(){
//
//    }

    public static void Hello(){
        System.out.println("Static Function");

    }

    public static void main(String[] args) {
        new Main();
    }

}