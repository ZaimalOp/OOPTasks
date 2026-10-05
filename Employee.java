import java.util.scanner;

class Employee{
private int emplyeeId;
private string employeeName;

public void setData(int id, String name) {
employeeId = id;
employeeName = name;
}

public void getData() {
System.out.println("Employee ID: " + employeeId);
System.out.println("Employee Name: " + employeeName);
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
sc.nextLine();

System.out.print("Enter Employee Name: ");
String name = sc.next();
sc.nextLine();


e.setData(id, name);

System.out.println("Employee Details:");
e.getData();

e.showDesignation();

}
}