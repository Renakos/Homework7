public class Warrior extends Hero{
    String superAbilityType = "SUPER ATTACK";


    public void applySuperAbility(String superAbilityType) {
        System.out.println(getClass().getName() + " применил суперспособность " + superAbilityType);
    }
}
