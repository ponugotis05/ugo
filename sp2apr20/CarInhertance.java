/**
 * 
 */
package sp2apr20;

/**
 * @author sharath
 *
 */

class Vehicle{
	
}
	public class CarInhertance extends Vehicle{

	/**
	 * @param args`
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle ab;
		ab = new CarInhertance();  
		ab = new Vehicle();
		CarInhertance a = new CarInhertance();
		  
	        boolean result = a instanceof Vehicle;
	        System.out.println("Car == a :" + result);
	        boolean result1 = ab instanceof CarInhertance;

	        System.out.println("car == ab:" + result1);
	        String name = "James";
	        // following will return true since name is type of String
	        boolean result2 = name instanceof String;
	        System.out.println("name ='James' instanceof String :" + result2);
	}

}
