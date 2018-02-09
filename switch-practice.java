class Untitled {
	public static void main(String[] args) {
		char ch = 'a';
		switch (ch) {
			case 'a':
			case 'A':
			  System.out.print(ch);
			case 'b':
			case 'B':
			  System.out.print(ch);
			  break;
			case 'c':
			case 'C':
			  System.out.print(ch);
			  break;
			case 'd':
			case 'D':
			  System.out.print(ch);
		}
		
		float x;
		float y;
		x = 0;
		y = (x > 0) ? 10 : -10;
		
		System.out.println(y);

	}
}