package lotr;

public class Elf extends Character{
    public Elf(){
        super(10, 10);
    }

    @Override
    public void kick(Character c){
        if (c.getPower() < getPower()){
            c.setHp(0);
        } else {
            c.setHp(c.getHp()-1);
        }
    }
    @Override
    public String toString() {
        return "Elf{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }

}

