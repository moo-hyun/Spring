package kr.ch07.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.ch07.dto.User6DTO;
import kr.ch07.service.User6Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class User6Controller {
	
	
	@Autowired //User6Service 주입받음
	private User6Service service;
	
	@GetMapping("/user6/index") //index 페이지 
	public String index() {
		
		log.info("index");
		return "/user6/index";
	}
	
	@GetMapping("/user6/register") //register 페이지
	public String register() {
		return "/user6/register";
	}
	
	@PostMapping("/user6/register") //register페이지에서 insert 구현
	public String register(User6DTO dto) {
		service.insertUser6(dto);
		log.info(dto.toString());
		return "redirect:/user6/list";
	}
	
	
	@GetMapping("/user6/list")	//list 페이지에서 db의 users 출력
	public String list(Model model) {
		List<User6DTO> users = service.selectUser6s();
		model.addAttribute("users",users);
		log.info(users.toString());
		return "/user6/list";
	}
	
	@GetMapping("/user6/modify")	//list에서 modify 로 보낼때 uid 를 보내서 modify 에서 db에 같은 uid를 대조해서 데이터 출력
	public String modify (String uid, Model model) {
		User6DTO user = service.selectUser6(uid);
		model.addAttribute("user",user);
		log.info("uid : "+ uid);
		log.info(user.toString());
		return "/user6/modify";
	}
	@PostMapping("/user6/modify") //modify 에서 수정된 값 db에 입력
	public String modify(@ModelAttribute User6DTO dto) {
		service.updateUser6(dto);
		log.info(dto.toString());
		return "redirect:/user6/list";
	}
	
	@GetMapping("/user6/delete") //list 에서 삭제 구현 
	public String delete(String uid) {
		service.deleteUser6(uid);
		log.info("uid : "+uid);
		return "redirect:/user6/list";
	}
	
	
	
}
