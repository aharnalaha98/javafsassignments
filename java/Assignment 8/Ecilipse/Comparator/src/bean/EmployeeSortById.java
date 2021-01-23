package bean;
import java.util.Comparator;

public class EmployeeSortById implements Comparator < Employee >{
	public int compare(Employee emp1, Employee emp2) {
        int value = 0;
        if (emp1.emplId > emp2.emplId)
            value = 1;
        else if (emp1.emplId < emp2.emplId)
            value = -1;
        else if (emp1.emplId == emp2.emplId)
            value = 0;
 
        return value;
    }

}
