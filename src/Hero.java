public class Hero {
    int health;
    int damage;
    String superAbilityType;


    public void applySuperAbility(String superAbilityType) {
        System.out.println(getClass() + " применил суперспособность " + superAbilityType);
    }
}
