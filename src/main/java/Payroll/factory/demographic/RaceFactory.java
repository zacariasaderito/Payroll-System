package Payroll.factory.demographic;

import Payroll.util.GenID;
import Payroll.domain.demographic.Race;

import java.util.UUID;

public class RaceFactory {

  public static Race getInstance(String description) {
      return new Race.Builder()
              .getId(GenID.generateID())
              .getDescription(description)
              .builder();

  }

}
