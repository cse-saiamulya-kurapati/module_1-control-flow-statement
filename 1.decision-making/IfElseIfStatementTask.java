class IfElseIfStatementTask {
	public static void main(String[] args) {
		char signal = 'b';
		if((signal == 'R') || (signal == 'r')) {
			System.out.println("stop");
		}
		else if((signal == 'Y') || (signal == 'y')) {
			System.out.println("ready");
		}
		else if((signal == 'G') || (signal == 'g')) {
			System.out.println("go");
		}
		else {
			System.out.println("no");
		}
	}
}