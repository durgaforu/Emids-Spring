package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/one.htm")
	String myMethod() {
		System.out.println("--- myMethod of MyComtroller....");
		return "Test";
	}

	@RequestMapping("/two.htm")
	void myMethod1() {
		System.out.println("--- myMethod1 of MyComtroller....");
	}

	@RequestMapping("/thr.htm")
	public ModelAndView saveData() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "Praveen Reddy S");
		mav.setViewName("Disp");

		return mav;
	}

}
