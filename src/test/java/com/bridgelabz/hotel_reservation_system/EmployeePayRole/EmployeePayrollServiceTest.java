package com.bridgelabz.hotel_reservation_system.EmployeePayRole;

import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.Test;
import com.bridgelabz.hotel_reservation_system.EmployeePayRole.EmployeePayrollService.IOService;


public class EmployeePayrollServiceTest {
    @Test 
    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmps= {
                new EmployeePayrollData(1," Jeff Bezos",100000.0),
                new EmployeePayrollData(2,"Bill Gates",200000.0),
                new EmployeePayrollData(3,"Mark Zuckerberg",300000.0)
        };
        EmployeePayrollService employeePayrollService;
        employeePayrollService =new EmployeePayrollService(Arrays.asList(arrayOfEmps));
        employeePayrollService.writeEmployeePayrollData(IOService.FIlE_IO);
        long entries=employeePayrollService.countEntries(IOService.FIlE_IO);
        employeePayrollService.printData();
        assertEquals(3,entries);
    } 
    
}