package com.codingorca.cathireapi.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("hello")
	public Map<String, Object> hello() {
		Map<String, Object> result = new HashMap<String, Object>();
		/*
		 * {
		        id : 0,
		        title : "떼껄룩",
		        content : "흔한 떼껄룩입니다.",
		        price : 39800
		    },
		    {
		        id : 1,
		        title : "길껄룩",
		        content : "매우 강력한 길껄룩 입니다",
		        price : 159000
		    },
		    {
		        id : 2,
		        title : "집껄룩",
		        content : "약하지만 애교있는 집껄룩 입니다.",
		        price : 50000
		    },
		 * */
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		String[] titles = {"떼껄룩", "길껄룩", "집껄룩"};
		String[] contents = {"떼껄룩", "길껄룩", "집껄룩"};
		int[] prices = {39800, 159000, 45000};
		                   
		                   
		
		
		Map<String, Object> map = null;
		
		for(int i = 0; i < titles.length; i++) {
			map = new HashMap<String, Object>();
			map.put("id", i);
			map.put("title", titles[i]);
			map.put("content", contents[i]);
			map.put("price", prices[i]);
			list.add(map);
		}
		
		
		result.put("test", list);
		
		return result;
	}

}
