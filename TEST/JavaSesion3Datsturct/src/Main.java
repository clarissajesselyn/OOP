import java.util.*;
public class Main {
//    ArrayList<String> arr = new ArrayList
//            <String>();
//    HashSet<String> set = new HashSet<String>();
    //hashset -> sorted kecil -> besar

//    HashMap<String, Integer> map = new HashMap<String, Integer>();


    ArrayList<Human> list = new ArrayList<Human>();
    //Human  -> Supaya class apapun yang inherit dengan human bisa di input

    public Main(){
//        arr.add("hello");
//        String word = arr.get(0);
//        for (int i = 0; i<word.length(); i++){
//            System.out.println(word.charAt(i));
//        }

//        set.add("1");
//        set.add("5");
//        set.add("3");
//        System.out.println("Set" + set);

//        map.put("a", 1);
//        map.put("b", 2);
//        map.put("c", 3);
//
//        System.out.println("Map" + map);
//        map.forEach(
//            (k, v) -> {
//                System.out.println(k + "->" + v);
//            }
//        );

        list.add(new Worker());
        list.add(new Student());


    }
    public static void main(String[] args) {
        new Main();
    }
}

class Human {
    private String nim;
    public Human(){

    }
    public Human (int x){

    }
    public Human(int x, int y){

    }
    public Human(String nim, int y){
        nim = "9";
        this.nim = nim;
        //this ini buat akses nim yang di atas yang di class bukan parameter
    }
    //constructor dari class
    //nama sama tapi parameter harus berbeda
    //urutan juga pengaruh

    public void setNIM(String v){
        nim = v;
    }

    public String getNIM(){
        return nim;
    }
}
class Student extends Human{}
class Worker extends Human{}