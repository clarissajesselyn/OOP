public class Player extends Character implements IAttack, IRecoverable, IHeal{
    public Player(String name, HP hp, int damage, int defense){
        super(name, hp, damage, defense);
    }

    @Override
    public void attack(IDamageable damageable) {
        System.out.println(this.name + " attacking " + ((Enemy) damageable).getName());
        ((Enemy) damageable).hp.value -= ((Enemy) damageable).takeDamage(this.damage, ((Enemy)damageable).getDefense());
    }

    @Override
    public void heal(int value) {
        this.hp.value+=value;
    }

    @Override
    public void recover(int value) {
        this.hp.value = value;
    }
}
