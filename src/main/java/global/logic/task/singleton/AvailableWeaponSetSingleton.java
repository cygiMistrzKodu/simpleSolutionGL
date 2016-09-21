package global.logic.task.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AvailableWeaponSetSingleton {

    private List<Weapon> weapons = new ArrayList<>();

    private static class Holder {
        static final AvailableWeaponSetSingleton INSTANCE = new AvailableWeaponSetSingleton();

    }

    public static AvailableWeaponSetSingleton getInstance() {
        return Holder.INSTANCE;
    }

    private AvailableWeaponSetSingleton() {
        addBasicWeapons();
    }

    private void addBasicWeapons() {

        Weapon sword = new Weapon();
        sword.setWeaponId(1);
        sword.setName("Sword");
        sword.setDamage(10);
        sword.setRange(1);
        sword.setArea(1);
        sword.setWeaponKind(WeaponKind.SECANT);

        Weapon slingshot = new Weapon();
        slingshot.setWeaponId(2);
        slingshot.setName("Slingshot");
        slingshot.setDamage(3);
        slingshot.setRange(40);
        slingshot.setArea(1);
        slingshot.setWeaponKind(WeaponKind.HURLING);

        weapons.add(sword);
        weapons.add(slingshot);

    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public Optional<Weapon> chooseFromAvailableWeapon(int weaponId) {

        return weapons.stream()
                .filter(w -> w.getWeaponId() == weaponId)
                .findFirst();
    }

    public int numberOfAvailableWeapons () {
        return weapons.size();

    }

    public void showAllWeapons() {
            weapons.forEach(w -> System.out.println(w.toString()));
    }

}
