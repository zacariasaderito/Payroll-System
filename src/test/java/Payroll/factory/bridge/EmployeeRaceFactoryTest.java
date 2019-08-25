package Payroll.factory.bridge;

import Payroll.domain.bridge.EmployeeRace;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRaceFactoryTest {

    @Test
    public void getInstance() {
        EmployeeRace employeeRace = EmployeeRaceFactory.getInstance("EMP-123", "RAC-1");
        Assert.assertNotEquals("EMP-123", employeeRace.getRaceID());
    }

    @Test
    public void getInstanceR() {
        EmployeeRace employeeRace = EmployeeRaceFactory.getInstance("EMP-123", "RAC-1");
        Assert.assertEquals("RAC-1", employeeRace.getRaceID());
    }
}