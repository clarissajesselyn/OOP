public class Enemies extends Character implements IAttack, IDamageable, IRecoverable, IHeal{
    
    public Player(String name, HP hp, int defense, int damage){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.defense = defense;
    }
}
