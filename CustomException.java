class CustomException extends Exception 
{ 
    public CustomException(String s) 
    { 
        super(s); 
    } 
} 
  
public class Main 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new CustomException("Custom Exception!!!!"); 
        } 
        catch (CustomException e){              
        System.out.println(e.getMessage()); 
        } 
    } 
}
