
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 12121;
		int rev = 0;
		int rem ;
		int temp=n;
		while(n!=0) {
			rem=n%10;
			rev = rev*10+rem;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
