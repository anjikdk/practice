package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A 
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("abc","Hyd","Blr","Ram","aaa");
		
		List<String> list1 = list.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
		System.out.println(list1);
		
		
		Map<String, String> map = new HashMap<>();
		map.put("abc", "xyz");
		map.put("aaa", "xyz");
		map.put("aba", "xyz");
		map.put("xyz", "xyz");
		map.put("axx", "xyz");
		
		List<String> mapToList = map.keySet().stream().collect(Collectors.toList());
		System.out.println(mapToList);
		
		Map<String, String> result = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println(map);
		System.out.println(result);
	}
}
