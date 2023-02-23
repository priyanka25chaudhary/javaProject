package ExceptionHandaling;
/*Java try block is used to enclose the code that might throw an exception. 
 * It must be used within the method.
 */

public class TryCatchExample {  
  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest code");  
    }  
      
}  
