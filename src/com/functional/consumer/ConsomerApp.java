package com.functional.consumer;

import java.util.function.Consumer;

public class ConsomerApp {

	public static void main(String[] args) {
		displayMethod("abs");
		displayConsumer.accept("abs");

	}

	private static Consumer<String> displayConsumer = (inputValue) -> System.out.println(inputValue);

	private static void displayMethod(String inputValue) {
		System.out.println(inputValue);

	}

}
