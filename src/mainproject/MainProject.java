
package mainproject;

import java.util.ArrayList;
import java.util.List;

public class MainProject {

   
    public static void main(String[] args) {
        ArrayList<Employee> Employees = new ArrayList();
        Employees.add(new TemporaryEmployee(1,"shahd","cse",2000,new Address("Tulkarm","West street")));
        Employees.add(new TemporaryEmployee(2,"Haifa","Dr",2000,new Address("Tulkarm","East street")));
        Employees.add(new PermanentEmployee(3,"Ali","manger",2000,new Address("Ramallah","East")));
        ArrayList<Employee> EmployeesCopy = new ArrayList();

        for(int i=0;i<Employees.size();i++){
            EmployeesCopy.add(Employees.get(i).clone());
        }
        
        System.out.println("Befor change");
        System.out.println("original :  "+Employees.get(0).toString());
        System.out.println("copy : "+EmployeesCopy.get(0).toString());
        System.out.println("===================================");
        
        EmployeesCopy.get(0).getAddress().setCity("Jenin");
        System.out.println("After change");
        System.out.println("original :  "+Employees.get(0).toString());
        System.out.println("copy : "+EmployeesCopy.get(0).toString());
        System.out.println("===================================");
        
        EmployeeCache e=new EmployeeCache();
        e.put(Employees);
       System.out.println( e.get(1));
        
    }
    
}
