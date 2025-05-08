public class Player extends Character implements IAttack, IDamageable, IRecoverable, IHeal{
    public Player(String name, HP hp, int damage, int defense){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.defense = defense;
    }
}
