package com.technoelevate.inheritance;

public class CommandLineArgs {

	public static void main(String[] args) {
		String s=args[1];
		int parseInt=Integer.parseInt(args[2]);
        System.out.println(parseInt);
        System.out.println(s);
	}

}
