
package mainproject;

public abstract class Employee {
    private final int id;
    private final String Name;
    private final String Department;
    
    public Employee(int id,String name,String department){
        this.id=id;
        this.Department=department;
        this.Name=name;
    }
    public abstract Address getAddress();

    public abstract void setData(int x);
    
    public abstract Employee clone();
    
    public String getName() {
        return Name;
    }

    public String getDepartment() {
        return Department;
    }
    
    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "{ id=" +id+" Name="+ Name + ", Department=" + Department + '}';
    }

}
