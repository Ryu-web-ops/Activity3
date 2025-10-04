public class Shaman extends Character {
    Shaman(String name, int health, int Stamina, int Manna){
        super(name, health, Stamina, Manna);
    }
    public void heal(){
        health = health +5;
        Stamina = Stamina +5;
        Manna = Manna +5;
    }
}
