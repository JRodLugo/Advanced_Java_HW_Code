/*
 * Jayden Rodriguez Lugo
 * Version 6/5/2025
 */
package cop2805;
/**
 *
 * reads a list of values, sorts that list, then outputs the results into a separate file
 * file being data.txt
 */
import java.util.*; 
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.Collections;

public class MainSorter {
    //main function
    public static void main(String[] args) {
        //main Data list
        List<Double> mData = ReadFile("data.txt");
        Collections.sort(mData);//sorts the file
        WriteFile(mData, "data-sorted.txt"); //makes a new sorted file based on the inputed data
        
    }
    
    //Input is the files location, sorts the data by converting the string into a double, and returns a List<Double>
    public static List<Double> ReadFile(String file){
        //path of the file
        Path path = Paths.get(file);
        //The List
        List<Double> rdata = new ArrayList<Double>();
        //setting up a bufferedReader to read the data within the file within the try and catch incase somthing happens
        try{
            //reads file data
            BufferedReader reader = Files.newBufferedReader(path, Charset.defaultCharset());
            String sReader; 
            do{
                sReader = reader.readLine();//places the line of data into sReader
                if(sReader != null){//if somthings there then it adds it to the array
                    rdata.add(Double.parseDouble(sReader));
                }
            }while(sReader != null);//continues as long as the line has somthing
            
        }catch(IOException x){
            x.printStackTrace();
        }
        //returns the array
        return rdata;
    }
    
    //Input is a List<Double> of data to write and a String of the file's location
    public static void WriteFile(List<Double> data, String file){
        //path of the file
        Path path = Paths.get(file);
        
        //try and catch incase anything goes wrong
        try{
            //making a bufferwriter to convert into a print writer, also creates the new sorted file
            BufferedWriter buffer = Files.newBufferedWriter(path, Charset.defaultCharset(), StandardOpenOption.CREATE);
            PrintWriter printer = new PrintWriter(buffer);
            //this prints the data into the file
            for(Double d : data){
                printer.println(d);
            }
            //closes file, makes sure everything is writen on file
            printer.close();
            
        }catch(IOException x){
            x.printStackTrace();
        }
    }
    
}
