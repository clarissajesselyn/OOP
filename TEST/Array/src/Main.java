import java.util.*;

public class Main {

    int[] x = new int[4]; //declare array with 10 storage
//  int[][] x = new int [4][8];

    char nim[] = new char[10];
    ArrayList<Integer> y = new ArrayList<Integer>();
    //HashMap<K,V> z = ;
    //k->key v->value
    HashMap<String, Integer> z = new HashMap<String, Integer>();

    public Main(){
//      x[0][0] = 1;
//      System.out.println(x[0][0]);
        int [][] a = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(a.length); //panjang x[]; -> arr luar
        System.out.println(a[0].length); //panjang x[0]; -> arr dalam


        x[0] = 1;
        System.out.println(x[0]);

        y.add(7);
        y.add(5);
        y.add(4);
        y.add(90);
        System.out.println(y); //print semua y
        System.out.println(y.get(3)); //print y[3]

        for (Integer n : y){ //foreach -> looping buat semua isi arraylist
            System.out.println(n + " Size: " + y.size());
            //n -> temporary buat nampung y[0], dst
            //y.size() -> ukuran array y
        }

        z.put("sfx", 99);
        z.put("bgm", 10);
        System.out.println(z.get("sfx")); //print 99



    }
    public static void main(String[] args) {
        new Main();
    }
}