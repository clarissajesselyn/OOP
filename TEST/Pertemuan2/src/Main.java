import java.util.*;
public class  Main {

    int x;
    float y = 99f;
    String name = "Budi";

    public Main(){
        x = Integer.parseInt("996");
        System.out.println(x);
        System.out.println(name.equals("budi")); //sama namanya (case sensitive) -> true/false
        System.out.println(name.compareTo("budi")); //return <0, 0, >0

        System.out.println(name=="budi"); //buat compare juga

        System.out.println(name.substring(2)); //print mulai dari index 2 - selesai

        System.out.println(name.indexOf("-")); //kalau ga ada dia return -1
        System.out.println(name.indexOf("d")); //kalau ada dia return index pertama dia ketemu






    }



    public static void main (String[] args){
        new Main();
    }

}