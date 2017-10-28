package com.atech.newdimension;

public class EqualDigits {
	public static int length = 1;

	public static void main(String[] args) {
		int a = 10;
		boolean result = false;
		while (a < 1001) {
			length = findLength(a);
			result = checkEqual(a);
			if (result) {
				System.out.println(a);
			}
			a++;
		}
	}

	public static boolean checkEqual(int a) {
		int r = 0;
		boolean flagCheck = true, result = false;
		while (length > 0 && flagCheck) {
			result = false;
			r = a % 10;
			a = a / 10;
			length--;
			flagCheck = (r == (a % 10));

			if (!flagCheck)
				break;
			else if (flagCheck && length > 1) {
				result = checkEqual(a);
				break;
			} else if (length == 1 && flagCheck) {
				result = true;
				break;
			}
		}
		return result;
	}

	public static int findLength(int a) {
		length = 1;
		int r = 0;
		while ((a / 10) != 0) {
			r = a % 10;
			a = a / 10;
			length++;
		}
		return length;
	}

}
