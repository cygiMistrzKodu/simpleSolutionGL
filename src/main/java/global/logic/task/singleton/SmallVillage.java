package global.logic.task.singleton;

public class SmallVillage extends PlaceAbstract {

    SmallVillage(){
        weaponsInPlace();
    }

    private void weaponsInPlace() {
        Weapon rocketLauncher = new Weapon();
        rocketLauncher.setWeaponId(5);
        rocketLauncher.setName("Rocket Launcher");
        rocketLauncher.setDamage(400);
        rocketLauncher.setArea(60);
        rocketLauncher.setRange(100);
        rocketLauncher.setWeaponKind(WeaponKind.MISSILE);

        weaponsInPlace.add(rocketLauncher);

        Weapon crossbow = new Weapon();
        crossbow.setWeaponId(6);
        crossbow.setName("Crossbow");
        crossbow.setDamage(15);
        crossbow.setArea(1);
        crossbow.setRange(70);
        crossbow.setWeaponKind(WeaponKind.HURLING);

        weaponsInPlace.add(crossbow);
    }

}
