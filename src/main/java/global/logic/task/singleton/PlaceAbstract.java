package global.logic.task.singleton;

import java.util.ArrayList;
import java.util.List;


public abstract class PlaceAbstract implements Place {

    protected String placeName;
    protected List<Weapon> weaponsInPlace = new ArrayList<>();

    @Override
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    @Override
    public String getPlaceName() {
        return placeName;
    }

    @Override
    public List<Weapon> getWeapons() {
        return weaponsInPlace;
    }
}
