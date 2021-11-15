package com.mkj.rapipay.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public String helloEndPoint()
	{
		return "Rapipay client Hello";
	}
	
	
}
