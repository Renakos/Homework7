// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Medic medic = new Medic();
        Magic magic = new Magic();
        Warrior warrior = new Warrior();
        Object [] heroes = {"Medic","Magic","Warrior"};
        magic.applySuperAbility(magic.superAbilityType);
        medic.applySuperAbility(medic.superAbilityType);
        warrior.applySuperAbility(warrior.superAbilityType);
    }
}