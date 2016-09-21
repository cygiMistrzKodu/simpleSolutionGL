package global.logic.task.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class GameTest {

    public static void main(String[] args) {

        System.out.println("Weapon number Before searching : " + AvailableWeaponSetSingleton.getInstance().numberOfAvailableWeapons());
        AvailableWeaponSetSingleton.getInstance().showAllWeapons();

        CountDownLatch countDownLatch = new CountDownLatch(3);

        Player Janek = new Player(countDownLatch);
        Janek.setName("Janek");
        Janek.setAge(18);
        Janek.setWeapon(AvailableWeaponSetSingleton.getInstance().chooseFromAvailableWeapon(1).get());
        Janek.lookForWeaponIn(new BlueHouse());

        Player Mariusz = new Player(countDownLatch);
        Mariusz.setName("Mariusz");
        Mariusz.setAge(22);
        Mariusz.setWeapon(AvailableWeaponSetSingleton.getInstance().chooseFromAvailableWeapon(2).get());
        Mariusz.lookForWeaponIn(new SmallVillage());

        Player Wiesiek = new Player(countDownLatch);
        Wiesiek.setName("Wiesiek");
        Wiesiek.setAge(25);
        Wiesiek.setWeapon(AvailableWeaponSetSingleton.getInstance().chooseFromAvailableWeapon(1).get());
        Wiesiek.lookForWeaponIn(new UndergroundCarParking());

        List<Thread> players = new ArrayList<>();
        players.add(new Thread(Janek));
        players.add(new Thread(Mariusz));
        players.add(new Thread(Wiesiek));
        players.forEach(p -> p.start());

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Weapon number After searching : " + AvailableWeaponSetSingleton.getInstance().numberOfAvailableWeapons());
        AvailableWeaponSetSingleton.getInstance().showAllWeapons();

        Wiesiek.changeWeapon(AvailableWeaponSetSingleton.getInstance().chooseFromAvailableWeapon(5).get());
        System.out.print("New weapon for: "+Wiesiek.getName() +" is "+  Wiesiek.getWeapon().getName());

    }

}

