
public class JavaVar {
    // datatypes;
    // class level vars
    
        public static void main(String[] args) throws Exception {
            // datatype variables [=value];
            int games = 3;
            double allowance = 40.50;
            long battlepass; // We define battlepass
            
            battlepass = 15; // We assign a value to battlepass
             
            // Print of our variable values, along with a string that explains what our values
            System.out.println(" Number of games I own = " + games);
            System.out.println();
            System.out.println(" My monthly allowance = " + allowance);
            System.out.println(" Cost of the battlepass = " + battlepass);
            System.out.println();
    
            double amountOfBp = (int) allowance/battlepass; // Calculating the amount of battlepasses possible (int)
            
            System.out.println(" How many battlepasses can I buy in a week = " + amountOfBp); // Value printed 
            double cost = battlepass*amountOfBp; // Calculating exact cost of battlepasses (double)
            System.out.println(" How much do they cost? = " + cost); // Value printed
    
    
        }
    }
    