import java.util.scanner;

class Employee{
private int emplyeeId;
private string employeeName;

public void setEmployeeId(int id){
this.employeeId = employeeId;

}

public int getEmployeeId{
return employeeId;
}

public void setEmployeeName(string name){
this.employeeName = employeeName;

}

public string getEmployeeName(){
return employeeName;
}

public void showDesignation(){
System.out.println("Employee Designation: Employee");

}

}

public class main {
public static void main(String[] args){
        
Scanner sc = new Scanner(System.in);
Employee e = new Employee();

System.out.print("Enter Employee ID: ");
int id = sc.nextInt();
sc.nectline();

System.out.print("Enter Employee Name: ");
String name = sc.next();
emp.setEmployeeName(name);

System.out.println("Employee ID: " + emp.getEmployeeId());
System.out.println("Employee Name: " + emp.getEmployeeName());
emp.showDesignation();
    }
}