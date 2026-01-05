class BeautifulNumber{
	public static void main(String[] args) {
		int c = 0;
		int n = 1234;
		int e = 0;
		int o = 0;
		while(n!=0) {
			int d = n % 10;
			if(d%2==0) {
               e++;
			}
			else 
				o++;
			n = n/10;
		}
		if(e==o) {
			System.out.println("Yes spy number");
		}
		else{
			System.out.println("Not spy number");
		}

	}
}