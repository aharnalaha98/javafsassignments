package bean;

import java.util.Comparator;

public class EmployeeSortByName implements Comparator<Employee>{
	public int compare(Employee emp1, Employee emp2) {
        return emp1.empName.compareTo(emp2.empName);
    }
}
