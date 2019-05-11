package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class B 
{
	public static void main(String[] args) 
	{
		Map<String, String> map = new HashMap<>();
		map.put("abc", "xyz");
		map.put("aaa", "xyz");
		map.put("aba", "xyz");
		map.put("xyz", "xyz");
		map.put("axx", "xyz");
		
		Map<String, String> result = new LinkedHashMap<>();
		map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
		
		System.out.println(result);
	}
}
