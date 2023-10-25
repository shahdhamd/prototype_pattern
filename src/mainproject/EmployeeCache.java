
package mainproject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeCache {
    private Map<Integer, Employee> cach = new HashMap<>();
    
    public void put(List<Employee> Employees){
        Employees.forEach( Employee-> cach.put(Employee.getId() , Employee)); //lambda expression
    }
    
    public Employee get(int e){
        return (Employee) cach.get(e);
    }
}

