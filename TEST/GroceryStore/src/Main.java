import java.util.*;
public class Main {
    Scanner sc = new Scanner (System.in);
    ArrayList<Store> list = new ArrayList<Store>();
    public Main(){
        int choice = -1;
        do{
            printMenu();
            do {
                choice = sc.nextInt(); sc.nextLine();
            } while (choice<1 || choice>5);

            switch (choice){
                case 1:addGrocery(list, sc); break;
                case 2:addItem(list, sc); break;
                case 3: updateStoreName(list,sc); break;
                case 4: ; break;
                case 5: ; break;
            }

        } while (true);

    }
    public static void addGrocery(ArrayList<Store> list, Scanner sc){
        String id, name;
        int maxNumber;

        System.out.print("Input Store ID: ");
        id = sc.nextLine();
        System.out.print("Input Store Name: ");
        name = sc.nextLine();
        System.out.print("Input Store Max Item: ");
        maxNumber = sc.nextInt();
        list.add(new Store (id, name, maxNumber));
        System.out.println("Grocery has been added succesfully");
    }
    public static void addItem(ArrayList<Store> list, Scanner sc){
        System.out.print("Enter Store Name: ");
        String storeName = sc.nextLine();
        for (Store _list: list){
            if (_list.storeName.equals(storeName)) {
                if (_list.nowAmount < _list.maxNumber) {
                    String id, name, brandName;
                    int price, quantity;
                    System.out.print("Input Item Id:");
                    id = sc.nextLine();
                    System.out.print("Input Item Name:");
                    name = sc.nextLine();
                    System.out.print("Input Item Brand:");
                    brandName = sc.nextLine();
                    System.out.print("Input Item Price:");
                    price = sc.nextInt();
                    System.out.print("Input Item Quantity:");
                    quantity = sc.nextInt();
                    _list.nowAmount++;
                    _list.addItem(new Item (id, name, brandName, price, quantity));
                    System.out.println("Item has been added succesfully");
                    return;
                }
            }
        }

        System.out.println ("Store Not Found");
        return;
    }

    public void updateStoreName(ArrayList<Store> list, Scanner sc){
        System.out.print("Inset Store Name: ");
        String storeName = sc.nextLine();
        for (Store _list: list){
            if (_list.storeName.equals(storeName)) {
                System.out.print("Input new store name: ");
                _list.storeName = sc.nextLine();
                System.out.println("Store name has been changed");
                return;
            }
        }
        System.out.println ("Store Not Found");
    }

    public void updateItem(ArrayList<Store> list, Scanner sc){
        System.out.print("Inset Item Name: ");
        String itemName = sc.nextLine();
        for (Store _list: list){
            if (_list)
        }
    }



    public static void printMenu(){
        System.out.println("Grocery Store Management");
        System.out.println("1. Insert New Grocery");
        System.out.println("2. Insert New Item To Grocery");
        System.out.println("3. Update Grocery Name");
        System.out.println("4. Update Item Information");
        System.out.println("5. Remove Item and Store");
    }
    public static void main(String[] args) {
        new Main();
    }
}

class Store{
    String storeId;
    String storeName;
    int nowAmount = 0;
    int maxNumber;
    ArrayList<Item> items = new ArrayList<Item>();


    public Store(String storeId, String storeName, int maxNumber){
        this.storeId = storeId;
        this.storeName = storeName;
        this.maxNumber = maxNumber;
    }

    public void addItem (Item item){
        items.add(item);
    }
}

class Item {
    String id, name, brandName;
    int price, quantity;
    public Item(String itemId, String itemName, String itemBrandName, int price, int quantity){
        this.id = itemId;
        this.name = itemName;
        this.brandName = itemBrandName;
        this.price = price;
        this.quantity = quantity;
    }

}