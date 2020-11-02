package helloworld;

import java.util.Date;

public class HW3_01 {
	public static void main(String[] args) {
		Date date = new Date();
		date.setTime(10000);
		System.out.println("The time after 10000 milliseconds since Jan 1, 1970 is " + date.toString());
		date.setTime(100000);
		System.out.println("The time after 100000 milliseconds since Jan 1, 1970 is " + date.toString());
		date.setTime(1000000);
		System.out.println("The time after 1000000 milliseconds since Jan 1, 1970 is " + date.toString());
		date.setTime(1000000);
		System.out.println("The time after 10000000 milliseconds since Jan 1, 1970 is " + date.toString());
		date.setTime(10000000);
		System.out.println("The time after 100000000 milliseconds since Jan 1, 1970 is " + date.toString());
		date.setTime(100000000);
		System.out.println("The time after 1000000000 milliseconds since Jan 1, 1970 is " + date.toString());
		date.setTime(1000000000);
		System.out.println("The time after 10000000000 milliseconds since Jan 1, 1970 is " + date.toString());
		date.setTime(10000000000L);
		System.out.println("The time after 100000000000 milliseconds since Jan 1, 1970 is " + date.toString());
		date.setTime(100000000000L);
		System.out.println("The time after 1000000000000 milliseconds since Jan 1, 1970 is " + date.toString());
	}
}
