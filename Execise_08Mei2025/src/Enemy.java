public class Enemy extends Character implements IAttack, IDamageable, IRecoverable, IHeal{
    public Enemy(String name, HP hp, int defense, int damage){
        super(name, hp, damage, defense);
    }
    @Override
    public void attack(IDamageable damageable) {
        System.out.println(this.name + " attacking " + ((Enemy) damageable).getName());
        ((Enemy) damageable).setHPAfterAttacked(damageable.takeDamage(damage, ((Enemy)damageable).defense));
    }

    @Override
    public int takeDamage(int damage, int defense) {
        System.out.println(this.name + " is taking damage for " + damage + " point(s)");
        return damage >= defense ? damage - defense : 0;
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


