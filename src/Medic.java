public class Medic extends Hero{
    String superAbilityType  = "ULTRA HEAL";


    public void applySuperAbility(String superAbilityType) {
        System.out.println(getClass().getName() + " применил суперспособность " + superAbilityType);
    }
}
