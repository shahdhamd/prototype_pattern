
package mainproject;

public class PermanentEmployee extends Employee{
    private int Salary;
    private Address address;
    public PermanentEmployee(int id,String name,String department,int salary,Address address){
        super(id,name,department);
        this.Salary=salary;
        this.address=address;
    }
    
    public PermanentEmployee(PermanentEmployee p){

        this(p.getId(),p.getName(),p.getDepartment(),p.Salary,p.getAddress());
    }
    

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public void setData(int x) {
      this.Salary=x;
    }
    
    @Override
    public String toString() {
        return "Permanent Employee{{" + "Salary=" + this.Salary + super.toString() + address.toString();
    }

//    @Override
//    public Employee clone() {  //shallow copy
//        Employee clone = null;
//     if (this instanceof PermanentEmployee) {
//            clone = new PermanentEmployee(this);
//        }
//        return clone;
//    }
    
    @Override
    public Employee clone() { // deep copy
            Address a = new Address(this.getAddress().getCity(), this.getAddress().getStreetName()); // بعمل  ابجكت جديد بدل ما اوخد من الريفرنس لذلك اي تعديل على الاصل والريفرينس ما بظهر على النسخة
            Employee clone = new PermanentEmployee(this.getId(),this.getName(), this.getDepartment(), this.Salary, a);
        return clone;
    }
}
