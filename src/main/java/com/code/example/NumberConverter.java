package com.code.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author：aiwei
 * @Description：NumberConverter
 * @CreateDate：2021/2/19 11:53
 */
public class NumberConverter {

	private NumberConverter() {
	}

	private static final Map phoneMap = new HashMap<Integer, String>() {{
		put(0, "");
		put(1, "");
		put(2, "abc");
		put(3, "def");
		put(4, "ghi");
		put(5, "jkl");
		put(6, "mno");
		put(7, "pqrs");
		put(8, "tuv");
		put(9, "wxyz");
	}};

	/**
	 * Convert numbers to letters
	 *
	 * @param number
	 * @return
	 */
	public static List<String> combination(Integer[] number) {
		List<String> resultList = new ArrayList<>();
		for (Integer letters : number) {
			char[] chars = String.valueOf(letters).toCharArray();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < chars.length; i++) {
				int anInt = Integer.parseInt(String.valueOf(chars[i]));
				sb.append(phoneMap.get(anInt));
			}
			resultList.add(sb.toString());
		}
		List<String> combineList = combineResult(resultList);
		return combineList;
	}

	private static List<String> combineResult(List<String> resultList) {
		List<String> collect = resultList.stream().filter(s -> !"".equals(s)).collect(Collectors.toList());
		if (collect.size() <= 1) {
			return collect;
		} else {
			return outPutList(collect.get(0), collect.get(collect.size() - 1));
		}
	}

	private static List<String> outPutList(String s1, String s2) {
		List<String> collect = new ArrayList<>();
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				collect.add(s1.substring(i, i + 1) + s2.substring(j, j + 1));
			}
		}
		return collect;
	}
}
