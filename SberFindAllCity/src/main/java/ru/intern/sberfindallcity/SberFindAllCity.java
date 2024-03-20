package ru.intern.sberfindallcity;

import java.util.List;
import ru.intern.sberutils.ProcessCity;
import ru.intern.sberutils.bean.City;

public class SberFindAllCity extends ProcessCity {

    @Override
    public void doAction(String path) {
        List<City> allCities = super.doProcess(path);

        for (City city : allCities) {
            System.out.println(city.toString());
        }
    }

}
