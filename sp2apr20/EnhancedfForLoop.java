/**
 * 
 */
package sp2apr20;

/**
 * @author sharath
 *
 */
public class EnhancedfForLoop {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int[] numbers = {10, 20, 30, 40, 50};
        String number = "";             
        
        for (int x : numbers) {
            number += (number.equals("")) ? x : ", " + x + "";
            System.out.println(number);

        }

        System.out.print("\n");
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        String name = "";             
        for (String x : names) {
            name += (name.equals("")) ? x : ", " + x + "";
        }
        System.out.println(name);
	}

}
