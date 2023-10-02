package kr.ch07.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import kr.ch07.service.User6Service;

@WebMvcTest(controllers = User6Controller.class)
public class User6ControllerTest {
	
	//MVC 테스트
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private User6Service service;
	
	@Test
	public void index() throws Exception {
		mvc
		.perform(get("/user6/index"))
		.andExpect(status().isOk())
		.andExpect(view().name("/user6/index"))
		.andDo(print());
	}
	
}
