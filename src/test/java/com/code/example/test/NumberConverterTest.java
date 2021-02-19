package com.code.example.test;

import com.code.example.NumberConverter;
import org.junit.Test;

import java.util.List;

/**
 * @Author：aiwei
 * @Description：NumberConverterTest
 * @CreateDate：2021/2/19 12:10
 */
public class NumberConverterTest {

	@Test
	public void testExample1() {
		Integer[] number = {2, 3};
		List<String> list = NumberConverter.combination(number);
		System.out.println(list.toString());
	}

	@Test
	public void testExample2() {
		Integer[] number = {8};
		List<String> list = NumberConverter.combination(number);
		System.out.println(list.toString());
	}

	@Test
	public void testExample3() {
		Integer[] number = {0};
		List<String> list = NumberConverter.combination(number);
		System.out.println(list.toString());
	}

	@Test
	public void testExample4() {
		Integer[] number = {1};
		List<String> list = NumberConverter.combination(number);
		System.out.println(list.toString());
	}

	@Test
	public void testExample5() {
		Integer[] number = {0, 1};
		List<String> list = NumberConverter.combination(number);
		System.out.println(list.toString());
	}

	@Test
	public void testExample6() {
		Integer[] number = {0, 0};
		List<String> list = NumberConverter.combination(number);
		System.out.println(list.toString());
	}

	@Test
	public void testExample7() {
		Integer[] number = {23, 45};
		List<String> list = NumberConverter.combination(number);
		System.out.println(list.toString());
	}

	@Test
	public void testExample8() {
		Integer[] number = {2, 23};
		List<String> list = NumberConverter.combination(number);
		System.out.println(list.toString());
	}

	@Test
	public void testExample9() {
		Integer[] number = {99, 6};
		List<String> list = NumberConverter.combination(number);
		System.out.println(list.toString());
	}
}
