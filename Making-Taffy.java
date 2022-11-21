import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
       
       // Your code starts here
       
       Scanner scanner = new Scanner(System.in);
       
       // print starting taffy timer
       System.out.println("Starting Taffy Timer . . . ");
       int temp = 0;
       
       // while loop. if temp not 270..... 
       while(temp < 270)
       {
           // will ask for temp and store the user input. 
           System.out.print("Enter the temperature: ");
           temp = scanner.nextInt();
           
           // if greater or equal than 270, break
           if(temp >= 270)
           {
               // will berak the loop if criteria is met. 
               break;
           }
           
           // prints if taffy is not the right temp. 
           System.out.println("The mixture isn't ready yet.");
           
       }
       
       
       
       // print taffy is ready
       // after criteria is met for loop, will print this. 
       System.out.println("Your taffy is ready for the next step!");
       
    }
}