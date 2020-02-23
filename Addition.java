import java.io.*;
import java.util.*;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n1, n2, nsum;
		System.out.println("This program adds together two integers, aka whole numbers.");
		System.out.println("Please enter the first integer: ");
		
		n1 = in.nextInt();
		System.out.println("Now please enter the second integer: ");
		n2 = in.nextInt();
		nsum = n1 + n2;
		System.out.println("The sum of the two integers is " + nsum);
	}

}
