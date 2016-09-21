package global.logic.task.singleton;


import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Player implements Runnable {

    CountDownLatch countDownLatch;

    private String name;
    private int age;
    private Weapon weapon;
    private Place place;

    Player(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void lookForWeaponIn(Place place) {
        this.place = place;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void run() {
        List<Weapon> weaponsInPlace = place.getWeapons();

        if(weaponsInPlace.size() > 0){
            weaponsInPlace.forEach(w -> AvailableWeaponSetSingleton.getInstance().addWeapon(w) );
        }
        countDownLatch.countDown();
    }
}
