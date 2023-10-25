
package mainproject;

public class TemporaryEmployee extends Employee{
    private int FixedAmount;
    private Address address;
    
    public TemporaryEmployee(int id,String name,String department,int FixedAmount,Address address){
        super(id,name,department);
        this.FixedAmount=FixedAmount;
        this.address=address;
    }
    
    public TemporaryEmployee(TemporaryEmployee e){
        this(e.getId(),e.getName(),e.getDepartment(),e.FixedAmount,e.address);
    }

    @Override
    public Address getAddress() {
       return address; 
    }

    @Override
    public void setData(int x) {
        this.FixedAmount=x;
    }
/*
    @Override
    public Employee clone() { // shallow copy
        return new TemporaryEmployee(this);
    }
*/
    @Override
    public Employee clone() { // deep copy
            Address a = new Address(this.getAddress().getCity(), this.getAddress().getStreetName()); 
           return new TemporaryEmployee(this.getId(),this.getName(), this.getDepartment(), this.FixedAmount, a);
    }
    
    @Override
    public String toString() {
        return "Temporary Employee{{" + "Fixed Amount=" + this.FixedAmount + super.toString() + address.toString();
    }
    
}
    
    

