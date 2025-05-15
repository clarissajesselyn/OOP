public class Character{
    public String name;
    public HP hp;
    public int damage;
    public int defense;

    public Character(String name, HP hp, int damage, int defense){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public String getName() {
        return name;
    }

    public void showHP(){
        System.out.print(name);
        hp.printHP();
    }
}
