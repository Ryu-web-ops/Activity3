public class Main {
    public static void main(String[] args) {

        Character character = new Character("Character", 100, 100, 100);
        character.walk();
        character.walk();
        character.walk();
        character.run();
        character.run();
        character.show_details();

        //calling the slash and heal function
//        character.slash();
//        character.heal();

        System.out.println("=================================");

        Shaman shaman = new Shaman("Shaman", 150, 100, 100);
        shaman.walk();
        shaman.walk();
        shaman.walk();
        shaman.run();
        shaman.run();
        shaman.heal();
        shaman.show_details();


        System.out.println("=================================");

        Swordsman swordsman = new Swordsman("Swordsman", 170, 100, 100);
        swordsman.walk();
        swordsman.walk();
        swordsman.walk();
        swordsman.run();
        swordsman.run();
        swordsman.slash();
        swordsman.slash();
        swordsman.catchphrase();
        swordsman.show_details();

    }
}