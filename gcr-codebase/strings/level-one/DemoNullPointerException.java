public class DemoNullPointerException {

	public static void generateException()
	{
		String text = null;
		System.out.println(text.length());
	}
	
	public static void handleException()
	{
		String text = null;
		try {
			System.out.println(text.length());
		}
		catch(NullPointerException e){
			System.out.println("Null Pointer Exception Handled Successfully.");
		}	
	}
	
	public static void main(String[] args) {
		
		
	        // Calling method that generates exception
	        System.out.println("Generating NullPointerException:");
	        try {
	            generateException();
	        } catch (NullPointerException e) {
	            System.out.println("Exception caught in main method.");
	            // Calling method that handles exception
		        System.out.println("\nHandling NullPointerException:");
		        handleException();
	        }	       
	}

}