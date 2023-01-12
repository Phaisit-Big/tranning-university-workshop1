package com.example.restservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class FarewellController {


	@RequestMapping(path="/bye", method=RequestMethod.GET)
	public @ResponseBody String bye() {
		return "<H1>Bye Bye</H1>";
	}

}
