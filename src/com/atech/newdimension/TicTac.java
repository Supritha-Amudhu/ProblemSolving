package com.atech.newdimension;

import java.util.Scanner;

public class TicTac {
	static String p1;
	static String p2;
	static int count = 0;
	static int toPlay = 1;

	public static void main(String[] args) {
		TicTac tic = new TicTac();
		int position;
		boolean flag = true;
		boolean win = false;
		Scanner scan = new Scanner(System.in);
		String[][] a = { { "1", "2", "3" }, { "4", "5", "6" },
				{ "7", "8", "9" } };
		try {
			System.out.println("This is how the game looks. Player 1 and 2 kindly pick from the symbols X and O : ");
			tic.print(a);
			System.out.println("Player 1 enter your symbol : (X or O)");
			p1 = scan.nextLine();
			System.out.println("Player 2 enter your symbol : (X or O)");
			p2 = scan.nextLine();			
			while (flag && count < 9 && !win) {
				/*System.out.println("Win : " + win + " Count : " + count
						+ "Flag : " + flag + "To Play : " + toPlay);*/
				if (toPlay == 1) {
					System.out.println("Player 1 enter your position : ");
					position = scan.nextInt();
					tic.Insert(a, position, 1);
					tic.print(a);
					if (count > 4) {
						win = tic.check(a, win);
					}
					if (count == 9)
						flag = false;
				} else if (!win && flag && count < 9 && toPlay == 2) {
					/*System.out.println("Win : " + win + " Count : " + count
							+ "Flag : " + flag + "To Play : " + toPlay);*/
					System.out.println("Player 2 enter your position : ");
					position = scan.nextInt();
					tic.Insert(a, position, 2);
					tic.print(a);
					if (count > 4) {
						win = tic.check(a, win);
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

	public boolean check(String[][] a, boolean win) throws Exception {
		if (a[0][0].equals(a[1][0]) && a[1][0].equals(a[2][0])) {
			if (a[0][0].equals(p1)) {
				System.out.println("Player 1 wins!");
			} else {
				System.out.println("Player 2 wins!");
			}
			win = true;
		} else if (a[0][1].equals(a[1][1]) && a[1][1].equals(a[2][1])) {
			if (a[0][1].equals(p1)) {
				System.out.println("Player 1 wins!");
			} else {
				System.out.println("Player 2 wins!");
			}
			win = true;
		} else if (a[0][2].equals(a[1][2]) && a[1][2].equals(a[2][2])) {
			if (a[0][2].equals(p1)) {
				System.out.println("Player 1 wins!");
			} else {
				System.out.println("Player 2 wins!");
			}
			win = true;
		} else if (a[0][0].equals(a[0][1]) && a[0][1].equals(a[0][2])) {
			if (a[0][0].equals(p1)) {
				System.out.println("Player 1 wins!");
			} else {
				System.out.println("Player 2 wins!");
			}
			win = true;
		} else if (a[1][0].equals(a[1][1]) && a[1][1].equals(a[1][2])) {
			if (a[1][0].equals(p1)) {
				System.out.println("Player 1 wins!");
			} else {
				System.out.println("Player 2 wins!");
			}
			win = true;
		} else if (a[2][0].equals(a[2][1]) && a[2][1].equals(a[2][2])) {
			if (a[2][0].equals(p1)) {
				System.out.println("Player 1 wins!");
			} else {
				System.out.println("Player 2 wins!");
			}
			win = true;
		} else if (a[0][0].equals(a[1][1]) && a[1][1].equals(a[2][2])) {
			if (a[0][0].equals(p1)) {
				System.out.println("Player 1 wins!");
			} else {
				System.out.println("Player 2 wins!");
			}
			win = true;
		} else if (a[0][2].equals(a[1][1]) && a[1][1].equals(a[2][0])) {
			if (a[0][2].equals(p1)) {
				System.out.println("Player 1 wins!");
			} else {
				System.out.println("Player 2 wins!");
			}
			win = true;
		}
		return win;
	}

	public void print(String[][] a) throws Exception {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void Insert(String[][] a, int position, int player) throws Exception {
		switch (position) {
		case 1: {
			if (!a[0][0].equals(p1) && !a[0][0].equals(p2)) {
				if (player == 1) {
					a[0][0] = p1;
					toPlay = 2;
				} else {
					a[0][0] = p2;
					toPlay = 1;
				}
				count++;
			} else {
				toPlay = player;
				/*System.out.println("Player : " + player + " To Play : "
						+ toPlay);*/
				System.out.println("Position 1 is already occupied. Enter again");		
			}
			break;
		}
		case 2: {
			if (!a[0][1].equals(p1) && !a[0][1].equals(p2)) {
				if (player == 1) {
					a[0][1] = p1;
					toPlay = 2;
				} else {
					a[0][1] = p2;
					toPlay = 1;
				}
				count++;
			} else {
				System.out
						.println("Position 2 is already occupied. Enter again");
			}
			break;
		}
		case 3: {
			if (!a[0][2].equals(p1) && !a[0][2].equals(p2)) {
				if (player == 1) {
					a[0][2] = p1;
					toPlay = 2;
				} else {
					a[0][2] = p2;
					toPlay = 1;
				}
				count++;
			} else {
				System.out
						.println("Position 3 is already occupied. Enter again");
			}
			break;
		}
		case 4: {
			if (!a[1][0].equals(p1) && !a[1][0].equals(p2)) {
				if (player == 1) {
					a[1][0] = p1;
					toPlay = 2;
				} else {
					a[1][0] = p2;
					toPlay = 1;
				}
				count++;
			} else {
				System.out
						.println("Position 4 is already occupied. Enter again");
			}
			break;
		}
		case 5: {
			if (!a[1][1].equals(p1) && !a[1][1].equals(p2)) {
				if (player == 1) {
					a[1][1] = p1;
					toPlay = 2;
				} else {
					a[1][1] = p2;
					toPlay = 1;
				}
				count++;
			} else {
				System.out
						.println("Position 5 is already occupied. Enter again");
			}
			break;
		}
		case 6: {
			if (!a[1][2].equals(p1) & !a[1][2].equals(p2)) {
				if (player == 1) {
					a[1][2] = p1;
					toPlay = 2;
				} else {
					a[1][2] = p2;
					toPlay = 1;
				}
				count++;
			} else {
				System.out
						.println("Position 6 is already occupied. Enter again");
			}
			break;
		}
		case 7: {
			if (!a[2][0].equals(p1) && !a[2][0].equals(p2)) {
				if (player == 1) {
					a[2][0] = p1;
					toPlay = 2;
				} else {
					a[2][0] = p2;
					toPlay = 1;
				}
				count++;
			} else {
				System.out
						.println("Position 7 is already occupied. Enter again");
			}
			break;
		}
		case 8: {
			if (!a[2][1].equals(p1) && !a[2][1].equals(p2)) {
				if (player == 1) {
					a[2][1] = p1;
					toPlay = 2;
				} else {
					a[2][1] = p2;
					toPlay = 1;
				}
				count++;
			} else {
				System.out
						.println("Position 8 is already occupied. Enter again");
			}
			break;
		}
		case 9: {
			if (!a[2][2].equals(p1) && !a[2][2].equals(p2)) {
				if (player == 1) {
					a[2][2] = p1;
					toPlay = 2;
				} else {
					a[2][2] = p2;
					toPlay = 1;
				}
				count++;
			} else {
				System.out
						.println("Position 9 is already occupied. Enter again");
			}
			break;
		}
		}
	}

}
