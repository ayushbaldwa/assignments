public class EmployeeHierarchy {
    public static void main(String args[]){
            Employee employee=new Employee(2308,"haseeb");
            Manager manager= new Manager(2307,"ayush",20);
            System.out.println(manager.employeeDetails());
            System.out.println(employee.employeeDetails());
    }
}
