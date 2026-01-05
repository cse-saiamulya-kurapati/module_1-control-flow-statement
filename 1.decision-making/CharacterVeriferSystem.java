class CharacterVerifierSystem{
	public static void main(String[]args){
		char a='F';
		if(a>=48 && a<=57){
			System.out.println(a+" is a digit.");
		}
		else if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){
			System.out.println(a+" is an uppercase vowel alphabet.");
		}
		else if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
			System.out.println(a+" is a lowercase vowel alphabet.");
		}
		else if(a>=97 && a<=122){
			System.out.println(a+" is a lowercase consonant alphabet.");
		}
		else if(a>=65 && a<=90){
			System.out.println(a+" is an uppercase consonant alphabet.");
		}
		else{
			System.out.println(a+" is a special character.");
		}
	}
}