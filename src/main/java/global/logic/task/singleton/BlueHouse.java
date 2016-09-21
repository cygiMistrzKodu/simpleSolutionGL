package global.logic.task.singleton;

public class BlueHouse extends PlaceAbstract {

    public BlueHouse() {
        weaponsInPlace();
    }

    private void weaponsInPlace() {
        Weapon grenade = new Weapon();
        grenade.setWeaponId(4);
        grenade.setName("Grenade");
        grenade.setDamage(200);
        grenade.setArea(30);
        grenade.setRange(40);
        grenade.setWeaponKind(WeaponKind.HURLING);

        weaponsInPlace.add(grenade);
    }


}
