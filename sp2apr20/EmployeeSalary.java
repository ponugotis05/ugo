/**
 * 
 */
package sp2apr20;

/**
 * @author sharath
 *
 */
public class EmployeeSalary {

	/**
	 * @param args
	 */
    public String name;

    // salary  variable is visible in Employee class only.
    private double salary;

    // The name variable is assigned in the constructor.
    public EmployeeSalary (String empName){
        name = empName;
    }

    // The salary variable is assigned a value.
    public void setSalary(double empSalperhour, double hoursworked){
        salary = empSalperhour*hoursworked;
    }

    // This method prints the employee details.
    public void printEmp(){
        System.out.println("name  : " + name );
        System.out.println("salary :" + salary);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(&name));
		 EmployeeSalary empOne = new EmployeeSalary("sharath");
	        empOne.setSalary(15,160);
	        empOne.printEmp();
	}

}
