package com.technoelevate.largest;
//WAJP to print max number in 5 number using conditional operator.
public class Largest {
    public static void main(String[] args) {
	int x=10;
	int y=20;
	int z=30;
	int a=1;
	int b=3;
	int res=x>y && x>z && x>a && x>b?x:y>z && y>a && y>b?y:z>a && z>b?z:a>b?a:b;
	System.out.println(res);
}
}
