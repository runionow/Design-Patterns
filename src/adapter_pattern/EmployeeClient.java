package adapter_pattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

   public List<Employee> getEmployeeList() {
       List<Employee> employees = new ArrayList<>();
       Employee employeeFromDB = new EmployeeDB("1234","Arun","Nekkalapudi","runionow@gmail.com");
       employees.add(employeeFromDB);

       EmployeeLdap empLDAP = new EmployeeLdap("1234","nekkalapudi","Varun","runionow@gmail.com");
       employees.add(new EmployeeAdapterLDAP(empLDAP));

       EmployeeCSV empCSV = new EmployeeCSV("1234,Sherlock,Holmes,sherlock@holmes.com");
       employees.add(new EmployeeAdapterCSV(empCSV));

       return employees;

   }
}
