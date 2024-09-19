package com.stream.gathers;

import java.util.List;
import java.util.stream.Gatherers;

public class Main {

	public static void main(String[] args) {
		List<String> words = List.of("word1", "word2", "word3", "word4", "word5", "word6");
		List<List<String>> fixedStream = words.stream().gather(Gatherers.windowFixed(2)).toList();
		System.out.println(fixedStream);

	}

}
