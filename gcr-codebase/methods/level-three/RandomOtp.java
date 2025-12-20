public class RandomOtp {

	// method to generate a 6-digit OTP number
	public static int generateOTP()
	{
		int OTP = (int)(Math.random()*900000) * 100000;
		return OTP;
	}
	
	// method to create an array to save the OTP numbers generated 10 times
	public static int[] generateTenOtp()
	{
		int[] otp = new int[10];
		for(int i=0; i<otp.length; i++)
		{
			otp[i]=generateOTP();
		}
		return otp;
	}
	
	// method to ensure that the OTP numbers generated are unique
	public static boolean isUnique(int[] otp)
	{
		for(int i=0; i<otp.length; i++)
		{
			for(int j=i+1; j<otp.length; j++)
			{
				if(otp[i] == otp[j])
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int[] otp = generateTenOtp();
		System.out.println("The 10 random OTPs are: ");
		for(int i=0; i<otp.length; i++)
		{
			System.out.println(otp[i] + " ");
		}

		System.out.println();
		System.out.println("The OTP numbers generated are unique?: " + isUnique(otp));	
	}

}
