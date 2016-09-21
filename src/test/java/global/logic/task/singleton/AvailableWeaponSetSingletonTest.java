package global.logic.task.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AvailableWeaponSetSingletonTest {

    @Test
    public void basicWeaponsAreAvailableTest() {

        AvailableWeaponSetSingleton availableWeaponSetSingleton = AvailableWeaponSetSingleton.getInstance();

        Weapon sword =  availableWeaponSetSingleton.chooseFromAvailableWeapon(1).get();
        Weapon slingshot = availableWeaponSetSingleton.chooseFromAvailableWeapon(2).get();

        String expectedSwordName = "Sword";
        String expectedSlingshotName = "Slingshot";

        assertEquals(expectedSwordName, sword.getName());
        assertEquals(expectedSlingshotName, slingshot.getName());

    }

    @Test
    public void whenAddNewWeaponInOtherPlaceThenIsSecondIsAvailableTest() {

        addNewWeaponToAvailableWeapons();

        AvailableWeaponSetSingleton availableWeaponSetSingletonAnother = AvailableWeaponSetSingleton.getInstance();

        int expectedNumberOfWeapons = 3;
        String expectedWeaponName = "Glock";

        assertEquals(expectedNumberOfWeapons, availableWeaponSetSingletonAnother.numberOfAvailableWeapons());
        assertEquals(expectedWeaponName,availableWeaponSetSingletonAnother.chooseFromAvailableWeapon(3).get().getName());
    }

    private void addNewWeaponToAvailableWeapons() {

        AvailableWeaponSetSingleton availableWeaponSetSingletonOne = AvailableWeaponSetSingleton.getInstance();

        Weapon handGun = new Weapon();
        handGun.setWeaponId(3);
        handGun.setName("Glock");
        handGun.setDamage(30);
        handGun.setArea(1);
        handGun.setRange(80);
        handGun.setWeaponKind(WeaponKind.SHOOTING);

        availableWeaponSetSingletonOne.addWeapon(handGun);
    }


}
