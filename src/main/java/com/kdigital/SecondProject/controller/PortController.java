package com.kdigital.SecondProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * 목적지 정보 화면으로 이동
 * */
@Controller
@Slf4j
public class PortController {
	/**
	 * 상단 메뉴바를 통한 목적지 정보 화면 요청
	 * */
	
	@GetMapping("port/portdetail")
	public String hearderPortD() {
		return "pages/destination";
	}
}
