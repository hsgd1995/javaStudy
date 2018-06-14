package me.tang.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.junit.Test;

/**
 * Predicate
 * 
 * @author Administrator
 *
 */
public class Study3 {

	@Test
	public void test() {
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

		System.out.println("Languages which starts with J :");
		filter(languages, (str) -> ((String) str).startsWith("J"));

		System.out.println("Languages which ends with a ");
		filter(languages, (str1) -> ((String) str1).endsWith("a"));

		System.out.println("Print all languages :");
		filter(languages, (str) -> true);

		System.out.println("Print no language : ");
		filter(languages, (str) -> false);

		System.out.println("Print language whose length greater than 4:");
		filter(languages, (str) -> ((String) str).length() > 4);

	}

	@Test
	public void test16() {
		Predicate<String> startWithJ = (n) -> n.startsWith("J");
		Predicate<String> fourLength = (n) -> n.length() == 4;

		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		languages.stream().filter(startWithJ.and(fourLength)).forEach(System.out::println);
	}

	public static void filter(List<String> names, Predicate condition) {
		for (String name : names) {
			if (condition.test(name)) {
				System.out.println(name + " ");
			}
		}
	}
}
