public class A6dot26 {
	public static void main(String[] args) {
		for (int count = 0, number = 3; count < 100; number += 2) {
			if (isPal(number) && isPrime(number)) {
				System.out.printf("%7d", number);
				if (++count % 10 == 0) {
					System.out.println();
				}
			}
		}
	}

	private static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
				}
			}
		return true;
		}


	private static boolean isPal(int number) {
		String num = number + " ";
		for (int left = 0, right = num.length() - 1; left < right; left++, right--) {
			if (num.charAt(left) != num.charAt(right)) {
				return false;
			}
		}
		return true;
	}	
}