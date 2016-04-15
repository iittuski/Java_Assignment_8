package j8;

import java.util.Scanner;

public class j8 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println(
				"Enter The month index \n 1-Jan \n 2-Feb \n 3-Mar \n 4-Apr \n 5-May \n 6-Jun \n 7-July \n 8-Aug \n 9-Sep \n 10-Oct \n 11-Nov \n 12-dec");
		int i = s.nextInt();
		switch (i) {
		case 1:
			System.out.println("Total No of Days in january are 30");
			break;
		case 2:
			System.out.println("Total No of Days in feb are 28");
			break;
		case 3:
			System.out.println("Total No of Days in mar are 30");
			break;
		case 4:
			System.out.println("Total No of Days in apr are 31");
			break;
		case 5:
			System.out.println("Total No of Days in may are 30");
			break;
		case 6:
			System.out.println("Total No of Days in jun are 31");
			break;
		case 7:
			System.out.println("Total No of Days in july are 30");
			break;
		case 8:
			System.out.println("Total No of Days are aug are 31");
			break;
		case 9:
			System.out.println("Total No of Days are sep are 30");
			break;
		case 10:
			System.out.println("Total No of Days are oct are 31");
			break;
		case 11:
			System.out.println("Total No of Days are nov are 30");
			break;
		case 12:
			System.out.println("Total No of Days are dec are 31");
			break;

		}

	}

}
