package hellojava;
public class WishMessage1 {
    
    public static void printHello(int n)
    {
        for(int i =1;i<= n ; i++)
        {
             System.out.println(" Hello");
        }
    }
    
    
    public static void main(String [] args)
    {
        printHello(5);
        
        printHello(10);
        
        printHello(7);
    }
    
}
