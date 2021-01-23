package bean;
import java.util.Comparator;
public class EmployeeSortBySalary implements Comparator < Employee >{
	public int compare(Employee emp1, Employee emp2) {
        int value = 0;
        if (emp1.empSalary > emp2.empSalary)
            value = 1;
        else if (emp1.empSalary < emp2.empSalary)
            value = -1;
        else if (emp1.empSalary == emp2.empSalary)
            value = 0;
 
        return value;
    }

}

