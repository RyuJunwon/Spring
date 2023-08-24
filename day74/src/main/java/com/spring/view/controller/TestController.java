package com.spring.view.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
//	@RequestMapping(value="/test.do", method=RequestMethod.POST)
//	@ResponseBody
//	public String test() {
//		System.out.println(" 로그 : .ajax() 메소드 수행함");
//		return "KIM";
//	}
	
	@RequestMapping(value="/test02.do", method=RequestMethod.POST)
	@ResponseBody
	public String test02(@RequestParam Map<String, Object> map) { // 인자를 줄이는 방식
		System.out.println("count: " + map.get("count"));
		System.out.println("apple: " + map.get("apple"));
		System.out.println("banana: " + map.get("banana"));
		int count = Integer.parseInt(map.get("count").toString());
		count++;
		return String.valueOf(count);
	}
	
	@RequestMapping(value="/test.do", method=RequestMethod.POST)
	@ResponseBody
	public String test(@RequestParam("count")int count, @RequestParam("apple")int apple, @RequestParam("banana")int banana) {
		System.out.println("count: " + count);
		System.out.println("apple: " + apple);
		System.out.println("banana: " + banana);
		count++;
		return String.valueOf(count);
	}
}
