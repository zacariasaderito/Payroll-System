package Payroll.factory;

import Payroll.domain.Race;

public class RaceFactory {
    public static Race getRace(String race){
        String finalRace;
        if (race.equals(Race.getWhite()))
        {
            finalRace = race;
        } else if (race.equals(Race.getBlack()))
        {
            finalRace = race;
        }
        else if (race.equals(Race.getColoured()))
        {
            finalRace = race;
        }
        else
        {
            finalRace = "Invalid Race";
        }

        return new Race.Builder()
                .race(finalRace)
                .build();
    }
}
