import java.util.*;
public class Manager extends Employee{
    private String name;
    private int id;
    private int NumberOfEmployeesUnder;

    Manager(int id, String name,int NumberOfEmployeesUnder) {
        super(id,name);

        this.NumberOfEmployeesUnder=NumberOfEmployeesUnder;
    }

    public void setNumberOfEmployeesUnder(){
        this.NumberOfEmployeesUnder=NumberOfEmployeesUnder;
    }
    public int getNumberOfEmployeesUnder(){
        return NumberOfEmployeesUnder;
    }

    public String employeeDetails() {
        
        return "Manager : Employee id :"+getId()+"Name: "+getName()+ "no.of employees under him: "+NumberOfEmployeesUnder;
    }
}
