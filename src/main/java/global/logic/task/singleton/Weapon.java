package global.logic.task.singleton;

import com.sun.javafx.binding.StringFormatter;

public class Weapon {

    private int weaponId;
    private String name;
    private int damage;
    private int range;
    private int area;
    private WeaponKind weaponKind;

    public int getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(int weaponId) {
        this.weaponId = weaponId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public WeaponKind getWeaponKind() {
        return weaponKind;
    }

    public void setWeaponKind(WeaponKind weaponKind) {
        this.weaponKind = weaponKind;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        String formatPattern = "Weapon\nWeapon id: %s \nName: %s \nDamage: %s \nRange: %s \nArea: %s\nWeapon Kind: %s \n";
        return String.format(formatPattern, weaponId, name, damage, range, area, weaponKind);
    }
}
