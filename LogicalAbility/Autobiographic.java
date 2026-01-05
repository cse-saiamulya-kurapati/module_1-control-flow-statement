class Autobiographic{
	public static void main(String[] args) {
		int n = 2020;
		int temp = n;
		int c = 0;
		int s = 0;
		while(temp!=0) {
			c++;      
			temp = temp/10;
		}
		temp = n;
		while(temp!=0) {
			s += temp % 10;
            temp = temp / 10;
		}
		if(s==c) {
			System.out.println("Yes " +n+ " is a Autobiographic number");
		} else {
			System.out.println("No");
		}
	}
}
