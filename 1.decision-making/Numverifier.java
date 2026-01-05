class Numverifier{
	public static void main(String[] args) {
		int n = 3;
		if((n<0) && (n%2 ==0 )) {
			System.out.println(n+ " is a Negative and Even Number");
		}
		if((n<0) && (n%2 != 0)) {
			System.out.println(n+ " is a Negative and Odd Number");
		}
		if((n==0) && (n%2 ==0) && (n/2==0)) {
			System.out.println(n+ " is a Neutral number");
		}
		if((n>0) &&  (n%2 ==0)) {
			System.out.println(n+ " is a positive and even number");
		}
		
	}
}