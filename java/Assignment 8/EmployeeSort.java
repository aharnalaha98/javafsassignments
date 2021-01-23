package bean;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
	public int emplId;
    	public String empName;
    	public double empSalary;
 											//Employee.java
    	public Employee(int emplId, String empName, double empSalary) 
	{
        	this.emplId = emplId;
        	this.empName = empName;
        	this.empSalary = empSalary;
    	}

}





//package bean;
//import java.util.Comparator;

public class EmployeeSortById implements Comparator < Employee >
{											//EmployeeSortById.java
		public int compare(Employee emp1, Employee emp2) 
		{
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





//package bean;

//import java.util.Comparator;

public class EmployeeSortByName implements Comparator<Employee>
{											//EmployeeSortByName.java
	public int compare(Employee emp1, Employee emp2) 
	{
        	return emp1.empName.compareTo(emp2.empName);
    	}
}



//package bean;
//import java.util.Comparator;
public class EmployeeSortBySalary implements Comparator < Employee >
{
	public int compare(Employee emp1, Employee emp2) 
	{
        	int value = 0;									//EmployeeSortBySalary.java
        	if (emp1.empSalary > emp2.empSalary)
            		value = 1;
        	else if (emp1.empSalary < emp2.empSalary)
            		value = -1;
        	else if (emp1.empSalary == emp2.empSalary)
            		value = 0;
 
        	return value;
    	}

}




//package bean;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;

public class EmployeeSort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	List <Employee> employees = new ArrayList <Employee> ();
    	employees.add(new Employee(10, "Dinesh", 18000));
    	employees.add(new Employee(16, "Pankaj", 19000));
    	employees.add(new Employee(13, "Mayur", 14000));
    	employees.add(new Employee(9, "Pravin", 22000));

    	System.out.println("----Sort By Employee Id----");						//EmployeeSort.java
    	Collections.sort(employees, new EmployeeSortById());

    	printEmployees(employees);

    	System.out.println("\n----Sort By Employee Name----");
    	Collections.sort(employees, new EmployeeSortByName());

    	printEmployees(employees);
    	
    	System.out.println("\n----Sort By Employee Salary----");
    	Collections.sort(employees, new EmployeeSortBySalary());

    	printEmployees(employees);


	}

	
	public static void printEmployees(List <Employee> employees) 
	{
        	for (Employee e: employees) 
		{
            		System.out.println("Id->" + e.emplId + " Name -> " + e.empName + " Salary-> " + e.empSalary);
        	}
    	}

}


