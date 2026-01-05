class SpyNumber {
	public static void main(String[] args) {
		int n = 1124;
		int s = 0;
		int p = 1;
		int temp = n;
		while(temp!=0) {
			s += temp%10;
			temp = temp / 10;
		}
		temp = n;
		while(temp!=0) {
			p *= temp%10;
			temp = temp/10;
		}
		if(s == p) {
			System.out.println("yes it is spy number");
		}
		 else{
		 	System.out.println("No not a spy number");
		 }

	}
}