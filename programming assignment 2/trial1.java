import java.util.Scanner;
public class trial1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number; 

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a positive integer");
        number=in.nextInt();

        if (number <0)
            System.out.println("Error: Not a positive integer");
        else { 

            System.out.print("Convert to binary is:");
            System.out.print(binaryform(number));
        }
    }

    private static Object binaryform(int number) {
        int remainder;

        if (number <=1) {
            System.out.print(number);
            return null;   // KICK OUT OF THE RECURSION
        }

        remainder= number %2; 
        binaryform(number >>1);
        System.out.print(remainder);
        { 
          return null;
        } 
 


	}

}
