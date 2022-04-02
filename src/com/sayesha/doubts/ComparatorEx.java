package com.sayesha.doubts;


import java.util.*;



class Employee
{
String employeeName;
float salary;

public Employee(String employeeName, float salary) {
super();
this.employeeName = employeeName;
this.salary = salary;
}
@Override
public String toString() {
return "Employee [employeeName=" + employeeName + ", salary=" + salary + "]";
}
public String getEmployeeName() {
return employeeName;
}
public void setEmployeeName(String employeeName) {
this.employeeName = employeeName;
}
public float getSalary() {
return salary;
}
public void setSalary(float salary) {
this.salary = salary;
}

}



class CompareBySalary implements Comparator<Employee>
{
public int compare(Employee e1,Employee e2)
{
if(e1.getSalary()==e2.getSalary())
{
return 0;
}
else
{
if(e1.getSalary()>e2.getSalary())
{
return 1;
}
else
{

return -1;
}
}
}
}



class CompareByName implements Comparator<Employee>
{

public int compare(Employee e1,Employee e2)
{
return e1.getEmployeeName().compareTo(e2.getEmployeeName());
}
}





public class ComparatorEx {

public static void main(String args[])
{
//TreeSet set=new TreeSet(new CompareByName());
TreeSet set=new TreeSet(new CompareBySalary());
set.add(new Employee("Peter",23000));
set.add(new Employee("Sam",11000));
set.add(new Employee("Edgar",15000));
set.add(new Employee("Mathew",17000));
System.out.println(set);


}



}