/*
 * Jayden Rodriguez Lugo
 * version 5/9/2025
 */
package cop2805;

/**
 * main- calculates and outputs a table of values showing how much money somebody will make
 * given an amount of sales that month starting with 1,000
 */
public class main {
    public static void main(String[] args){
        //varibles
        double tSales = 0.00;
        
        //loop that iterates through the function around 20 times
        System.out.println("Sales          Income");
        do{
            tSales = tSales + 1000.00;//timer
            System.out.println("$"+tSales + "         " + "$" + computeIncome(tSales));//what user sees            
        }while(tSales != 20000); 
    }
    
    //takes an amount of sales, returns how much someone will take home in commission + base Salary
    public static double computeIncome(double salesAmount){
        //varibles
        int baseSalary = 5000;
        //if sales less than or equal to 5000
        if(salesAmount <= 5000){
            //multiples salesAmount to 8%
            salesAmount = (salesAmount * .8) + baseSalary;
        } else if (salesAmount <= 10000){ //if sales less than or equal to 10,000
            //multiples salesAmount to 10% minus the base salary plus 400 plus the base salary
            salesAmount = ((salesAmount - baseSalary) * .10) + 400 + baseSalary;
        } else if (salesAmount <= 20000){ //if sales less than or equal to 20,000
            //multiples salesAmount to 12% minus twice the base salary plus 400,500 and the base salary
            salesAmount = (((salesAmount - baseSalary) - baseSalary) * .12) + 400 + 500 + baseSalary;
        }
        return salesAmount;
    }
}
