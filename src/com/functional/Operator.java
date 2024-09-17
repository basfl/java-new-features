package com.functional;

public class Operator {

	public void performance() {
		Calculator add = (a, b) -> a + b;
		add.operate(5, 3);
		Calculator subtract = (a, b) -> a - b;
		subtract.operate(5, 3);
		Calculator multiply = (a, b) -> a * b;
		multiply.operate(5, 3);
		Calculator divide = (a, b) -> a / b;
		divide.operate(5, 3);

	}

}
