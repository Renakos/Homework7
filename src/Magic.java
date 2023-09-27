public class Magic extends Hero{
    String superAbilityType = "INVISIBILITY";


    public void applySuperAbility(String superAbilityType) {
        System.out.println(getClass().getName() + " применил суперспособность " + superAbilityType);
    }
}
