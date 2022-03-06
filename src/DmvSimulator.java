
public class DmvSimulator {
	public static void main(String[] args) {
		System.out.println("Welcome to the DMV. Please wait until you get a number for your test.");
		int number = (int)(Math.random() * 100);
		System.out.println("Your number is " + number + ". Please wait your turn.");
		
		int count = number;
		boolean num = true;
		while ((count <= 100) && (num)){ 
	        count++;
	        System.out.println("Next in line, number " + count + ".");
	        if (count == 100) {
	        	count = 0;
	        } else if (count == 0) {
	        	count++;
	        	System.out.println("Next in line, number " + count + ".");
	        } else if (count == number) {
	        	System.out.println("Sorry, but you do not have the required paperwork.");
	        	num = false;
	        }
		}
	        
	   
	    }
}

