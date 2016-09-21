package global.logic.task.singleton;

import java.util.List;

public interface Place {
    void setPlaceName(String placeName);
    String getPlaceName();
    List<Weapon> getWeapons();
}
