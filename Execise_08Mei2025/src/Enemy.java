public class Enemy extends Character implements IAttack, IDamageable, IRecoverable, IHeal{
    public Enemy(String name, HP hp, int damage, int defense){
        super(name, hp, damage, defense);
    }
    @Override
    public void attack(IDamageable damageable) {
        System.out.println(this.name + " attacking " + ((Enemy) damageable).getName());
        ((Enemy) damageable).hp.value -= ((Enemy) damageable).takeDamage(this.damage, ((Enemy)damageable).getDefense());
    }

    @Override
    public int takeDamage(int damage, int defense) {
        damage = damage >= defense ? damage - defense : 0;
        System.out.println(this.name + " is taking damage for " + damage + " point(s)");
        return damage;
    }

    @Override
    public void heal(int value) {
        this.hp.value += value;
    }

    @Override
    public void recover(int value) {
        this.hp.value = value;
    }
}


