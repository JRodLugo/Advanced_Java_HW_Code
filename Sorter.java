/*
 * Jayden Rodriguez Lugo
 * version 
 */

package cop2805;
import java.util.*; // allows us to use the framwork tools
import java.util.Comparator;
import java.util.Collections;
/**
 *
 * 
 */
public class Sorter {

    public static void main(String[] args) {
        //ArrayList of doubles
        ArrayList<Double> numList =  new ArrayList<Double>();
        //values added to the array
        numList.add(1.5);
        numList.add(2.35);
        numList.add(-4.7);
        numList.add(0.01);
        //prints original list
        System.out.print("Example Output: \n\nOriginal List: \n");
        PrintList(numList); // this simply prints out the list
        //prints a sorted list 
        Collections.sort(numList); // this sorts the list 
        System.out.print("\nSorted List:\n");
        PrintList(numList);
        //looks for the value 1.5 within the index
        System.out.printf("\nFound 1.5 at index %d\n", Collections.binarySearch(numList,1.5));
        //zeros out the list
        System.out.println("Zero List");
        Collections.fill(numList, 0.0);//0.0 because numList is a double
        PrintList(numList);
        
    }
    
    //method for printing out an array
    public static void PrintList(ArrayList list){
        //declaring an iterator to iterate through the list
        Iterator it = list.iterator();
        //prints out the array
        while(it.hasNext()){
            Object obj = it.next();//moves though the list
            System.out.println(obj); // prints out the list
        }
        
    }
}
