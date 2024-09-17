package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java22Stuff {

	public static void main(String[] args) {
		
		record Person(int age,String name) {}
		notUsedVariable();
		stringTemplate();
		switchExpressions();
		var person=new Person(12, "name");
		System.out.print(person.age());
		namedGroupRegularExpression();
		
		
		
	

	}

	private static void namedGroupRegularExpression() {
		String line="1;New York;8 336 817";
		 Pattern pattern = Pattern.compile(
	                "(?<index>\\d+);" + // Matches digits and captures as "index"
	                "(?<city>[a-zA-Z ]+);" + // Matches letters and spaces, captures as "city"
	                "(?<population>[\\d ]+)$" // Matches digits and spaces, captures as "population"
	        );

		
		Matcher matcher = pattern.matcher(line);
		if (matcher.matches()){
			var index=matcher.group("index");
			var city=matcher.group("city");
			var population=matcher.group("population");
			System.out.println(STR."\n the index=\{index} city=\{city} and population=\{population}");
			
		}else {
			System.out.println("didnt match");
		}
		
	}

	private static void switchExpressions() {
		String day="monday";
		String time="";
		time=switch(day) {
		case "sat","sunday"->"9";
		case "monday"->"7:30";
		case "friday"->"8";
		default -> "6:30";
				
		};
		System.out.println(STR."time is \{time}");
		
	}

	private static void stringTemplate() {
		String name="bob";
		int age=40;
		System.out.println(STR."hi my name is \{name} and age is \{age}");
		
	}

	private static void notUsedVariable() {
		try {
			var num=Integer.parseInt("12b");
		}catch (Exception _) {
			System.out.println("This is not an integer");
		}
		
	}

}
