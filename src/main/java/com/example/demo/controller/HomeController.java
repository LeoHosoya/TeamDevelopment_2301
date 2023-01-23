package com.example.demo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class HomeController {

	//トップページから勤怠一覧画面表示
	//勤怠一覧のボタンから
	@GetMapping("/top")
	public String top(Model model) {
		return "create";
	}
	
	   //戻るボタンを押してマイページに遷移
	@GetMapping("/back")
	  public String back(Model model) {
		return "Mypage";
	}
	
	
}


