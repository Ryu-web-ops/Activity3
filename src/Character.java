public class Character {
    String name;
    int health;
    int Stamina;
    int Manna;

    public Character(String name, int health, int Stamina, int Manna) {
        this.name = name;
        this.health = health;
        this.Stamina = Stamina;
        this.Manna = Manna;
    }
    public void show_details(){
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Stamina: " + Stamina);
        System.out.println("Manna: " + Manna);
    }
    public void walk(){
        Stamina = Stamina -1 ;

    } public void run (){
        Stamina  = - 03;

    }

}
