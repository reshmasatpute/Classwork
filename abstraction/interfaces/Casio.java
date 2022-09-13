package com.technoelevate.abstraction.interfaces;

public class Casio implements Calculator,ScientificCalculator {

	@Override
	public String trignometric(String angle1, String angle2) {
		if (angle1.equals("sin") && angle2.equals("cos")) {
			return "tan";
		}
		return "invalid";
	}

	@Override
	public int add(int x, int y) {
		
		return x+y;
	}

	@Override
	public int substract(int x, int y) {
		
		return x-y;
	}

}
