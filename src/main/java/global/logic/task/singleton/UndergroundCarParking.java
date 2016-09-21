package global.logic.task.singleton;

import java.util.List;

/**
 * Created by CygiMasterProgrammer on 2016-09-21.
 */
public class UndergroundCarParking extends PlaceAbstract {

    UndergroundCarParking() {

        weaponsInPlace();
    }

    private void weaponsInPlace() {
        Weapon Ax = new Weapon();
        Ax.setWeaponId(7);
        Ax.setName("Ax");
        Ax.setDamage(14);
        Ax.setArea(1);
        Ax.setRange(2);
        Ax.setWeaponKind(WeaponKind.SECANT);

        weaponsInPlace.add(Ax);
    }

}
