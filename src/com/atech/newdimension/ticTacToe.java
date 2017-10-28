package com.atech.newdimension;

import java.util.*;

public class ticTacToe {
	static String p1;
	static String p2;
	static int count = 0;
	static int toPlay = 1;
	static boolean isEqual;
	static int r;
	static int c;
	static int rows = 3;
	static int col = 3;
	static int position;
	static String[][] a = { { "1", "2", "3" }, { "4", "5", "6" },
			{ "7", "8", "9" } };
	static boolean win = false;

	public static void main(String[] args) {
		ticTacToe tic = new ticTacToe();
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		try {
			System.out
					.println("This is how the game looks. Player 1 and 2 kindly pick from the symbols X and O : ");
			tic.print(a);
			System.out.println("Player 1 enter your symbol : (X or O)");
			p1 = scan.nextLine();
			System.out.println("Player 2 enter your symbol : (X or O)");
			p2 = scan.nextLine();
			while (flag && count < 9 && !win) {
				if (toPlay == 1) {
					System.out.println("Player 1 enter your position : ");
					position = scan.nextInt();
					tic.Insert(a, position, 1);
					tic.print(a);
					if (count > 4) {
						tic.check(a, win);
					}
					if (count == 9)
						flag = false;
				} else if (!win && flag && count < 9 && toPlay == 2) {
					System.out.println("Player 2 enter your position : ");
					position = scan.nextInt();
					tic.Insert(a, position, 2);
					tic.print(a);
					if (count > 4) {
						tic.check(a, win);
					}
				}
			}

			if (count == 9 && !win) {
				System.out.println("The game comes to a draw.");
			}
		} catch (Exception ex) {
			System.out.println("Exception caught.");
			ex.printStackTrace();
		}
	}

	public void check(String[][] a, boolean win) throws Exception {
		if (checkEqual(positionCalculate(1), positionCalculate(4),
				positionCalculate(7)) == true) {
			checkWhoWins(positionCalculate(1));
		} else if (checkEqual(positionCalculate(2), positionCalculate(5),
				positionCalculate(8)) == true) {
			checkWhoWins(positionCalculate(2));
		} else if (checkEqual(positionCalculate(3), positionCalculate(6),
				positionCalculate(9)) == true) {
			checkWhoWins(positionCalculate(3));
		} else if (checkEqual(positionCalculate(1), positionCalculate(2),
				positionCalculate(3)) == true) {
			checkWhoWins(positionCalculate(1));
		} else if (checkEqual(positionCalculate(4), positionCalculate(5),
				positionCalculate(6)) == true) {
			checkWhoWins(positionCalculate(4));
		} else if (checkEqual(positionCalculate(7), positionCalculate(8),
				positionCalculate(9)) == true) {
			checkWhoWins(positionCalculate(7));
		} else if (checkEqual(positionCalculate(1), positionCalculate(5),
				positionCalculate(9)) == true) {
			checkWhoWins(positionCalculate(1));
		} else if (checkEqual(positionCalculate(3), positionCalculate(5),
				positionCalculate(7)) == true) {
			checkWhoWins(positionCalculate(3));
		}
	}

	public boolean checkEqual(String a, String b, String c) throws Exception {
		if ((a.equals(b)) && b.equals(c)) {
			isEqual = true;
		} else {
			isEqual = false;
		}
		return isEqual;
	}

	public void checkWhoWins(String a) throws Exception {
		if (a.equals(p1)) {
			System.out.println("Player 1 wins!");
		} else {
			System.out.println("Player 2 wins!");
		}
		win = true;
	}

	public void print(String[][] a) throws Exception {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public String insertCheck(String a, int player) throws Exception {
		if (!a.equals(p1) && !a.equals(p2)) {
			if (player == 1) {
				a = p1;
				toPlay = 2;
			} else {
				a = p2;
				toPlay = 1;
			}
			count++;
		} else {
			toPlay = player;
			System.out.println("Position 1 is already occupied. Enter again");
		}
		return a;
	}

	public String positionCalculate(int position) {
		r = position / (col + 1);
		if (position % col == 0) {
			r = (position / col) - 1;
			c = col - 1;
		} else {
			r = (position / col);
			c = (position % col) - 1;
		}
		return a[r][c];
	}

	public void Insert(String[][] a, int position, int player) throws Exception {
		positionCalculate(position);
		a[r][c] = insertCheck(a[r][c], player);

	}
}