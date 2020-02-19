
/*
Code explaining hierarchy of employee where manager extends an employee
*/
public class Employee {
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    private int id;
    private String name;
    int getId(){
        return id;
    }
    void setId(){
        this.id=id;
    }
    String getName(){
        return name;
    }
    void setName(){
        this.name=name;
    }
    public String employeeDetails(){
        return "Employee id: "+id+"Employee name: "+name;
    }
}
