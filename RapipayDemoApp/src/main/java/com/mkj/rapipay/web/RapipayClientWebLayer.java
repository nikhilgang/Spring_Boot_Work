package com.mkj.rapipay.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mkj.rapipay.service.IRapipayClientService;

@RestController
@RequestMapping("/client")
public class RapipayClientWebLayer {

	@Autowired
	private IRapipayClientService rapipayServiceImpl;

	public RapipayClientWebLayer() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("constructor called //");
	}

	@RequestMapping("/hello")
	public String helloEndPoint() {
		return "Rapipay client Hello";
	}

	@RequestMapping("/sum/{num1}/{num2}")
	public int getSum(@PathVariable(name = "num1") Integer a, @PathVariable(name = "num2") Integer b) {

		return a + b;
	}

	@RequestMapping("/addition")
	public int getaddition(@RequestParam int num1,@RequestParam int num2) {
		return num1+num2;
	}

}
