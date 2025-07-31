/*
 * Jayden Rodriguez Lugo 
 * 07/10/2025
 */

package cop2805;

/**
 * this code implements two versions of the Fibonacci sequence 
 * and use threads to determine how much faster the second method is
 */

//librarys being used
import java.lang.Thread;
import java.lang.Runnable;


public class Threadonacci extends Thread {
    //main function
    public static void main(String[] args) {
        //the two threads
        rThread recurse = new rThread();
        dThread dynamic = new dThread();
        
        //runs the threads
        dynamic.start();
        recurse.start();   
    }//end of main
    
    
}//end of code
//non dynamic fibonacci function
class rThread extends Thread{
    //run class
    public void run(){
        //system time before fib calcs
        double bTime = System.currentTimeMillis();
        int fib = fibonacciR(40);
        //system timeafter fib calcs
        double aTime = System.currentTimeMillis();
        //total time it took system to calc fib sequence
        double CurrentTime = aTime - bTime;
        System.out.printf("Recursion Thread found the answer: %d in %.0fms \n", fib, CurrentTime);
    }//end of run
    
    //fibonacci function
    public int fibonacciR(int n){
        //the if statments return the first two numbers in the sequence
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        //if n dosn't equal the first two terms, it adds the function while subtracting n by either 1 or 2 to generate the sequence
        return fibonacciR(n-1) + fibonacciR(n-2);
    }//end of function 
}//end of rThread

//dynamic fibonacci function
class dThread extends Thread{
    //run class
    public void run(){
        //system time before fib calcs
        double bTime = System.currentTimeMillis();
        int fib = fibonacciD(40);
        //system timeafter fib calcs
        double aTime = System.currentTimeMillis();
        //total time it took system to calc fib sequence
        double CurrentTime = aTime - bTime;
        System.out.printf("Dynamic Thread found the answer: %d in %.0fms \n", fib, CurrentTime);
    }//end of run
    
    //dynamic fibonacci function
    public int fibonacciD(int n){
        //varibles
        int v1 = 0;
        int v2 = 1;
        int v3 = 0;
        //generates the sequence
        for(int i = 2; i<= n; i++){
            v3 = v1 + v2;
            v1 = v2;
            v2 = v3;
        }
        // returns the answer
        return v3;
    }//end of function
}// end of dThread
