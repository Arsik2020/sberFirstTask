package ru.intern.sberfindallcity;

import ru.intern.sberutils.ProcessCity;
import ru.intern.sberutils.Utils;

public class Starter {

    public static void main(String[] args) {
        if (Utils.validate(args)) {
            ProcessCity process = new SberFindAllCity();
            process.doAction(args[0]);
        }
    }
}
