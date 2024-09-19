package com.statement.before.constructor;

public class Square extends Thing {
	
	 @SuppressWarnings("preview")
	Square(int l,int h) {
		if (l<0) throw new IllegalArgumentException();
		super(l,h);
			
	}
	 
	 public static void main(String[] args) {
		 var _=new Square(2, 2);
	 }

}
