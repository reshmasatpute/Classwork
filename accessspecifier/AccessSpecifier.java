package com.technoelevate.accessspecifier;

public class AccessSpecifier {
    private int x;
	public int y;
	protected int z;
	int a;
	public void m1() {
		System.out.println("I am public:");
	}
	private void m2() {
		System.out.println("I am private:");
	}
	protected void m3() {
		System.out.println("I am protected:");
	}
	 void m4() {
		System.out.println("I am default:");
	}
	
    public static void main(String[] args) {
	AccessSpecifier accessSpecifier=new AccessSpecifier();
    System.out.println(accessSpecifier.x);
    System.out.println(accessSpecifier.y);
    System.out.println(accessSpecifier.z);
    System.out.println(accessSpecifier.a);
    accessSpecifier.m1();
    accessSpecifier.m2();
    accessSpecifier.m3();
    accessSpecifier.m4();
}
}
