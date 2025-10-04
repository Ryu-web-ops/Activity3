public class Swordsman extends Character {
    Swordsman(String name, int health, int Stamina, int Manna) {
        super(name, health, Stamina, Manna);
    }
    public void slash(){
        Manna = Manna - 10;
    }
    public void catchphrase (){
        System.out.println("I AM POWERFUL!");
    }


}
