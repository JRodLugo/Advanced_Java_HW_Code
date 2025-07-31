/*
 * Jayden Rodriguez Lugo
 * 5/20/25
 */

package cop2805;
/**
 *
 * creates an array of strings, integers and doubles
 * with the help of a generic function
 */
public class JohnGeneric {

    
    //main 
    public static void main(String[] args) {
        //arrays
        String[] colors = {"Red", "Green", "Blue"};
        Integer[] numbers = {1,2,3};
        Double[] circleRadius = {3.0, 5.9, 2.9};
        //prints the minimum from the arrays
        System.out.printf("Colors: %s\n" , min(colors));
        System.out.printf("Numbers: %s\n" , min(numbers));
        System.out.printf("Circle Radius: %s\n" , min(circleRadius));

        
    }
    
    //generic String function min that takes in an array object
    public static<E extends Comparable<E>> String min(E o[]){
        E minElement = o[0];//sets the minelement to the first index of the inputed array
        for(int i = 0; i< o.length; i++){ //loops through the array
            //if minElement.compareTo(o[i]) is less than o
            if(minElement.compareTo(o[i]) > 0){
                //sets minElement to what ever o[i] is
                minElement = o[i];
            }
        }
        //returns minElement as a string
        return minElement.toString();
    }
}
