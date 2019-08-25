package Payroll.factory.bridge;

import Payroll.domain.bridge.EmployeeGender;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest {

    @Test
    public void getInstance() {
        EmployeeGender employeeGender = EmployeeGenderFactory.getInstance("EMP-123", "GEN-1");
        Assert.assertEquals("EMP-123", employeeGender.getEmployeeID());
    }

    @Test
    public void getInstanceG(){
        EmployeeGender employeeGender = EmployeeGenderFactory.getInstance("EMP-123", "GEN-1");
        Assert.assertEquals("GEN-1", employeeGender.getGenderID());
    }
}