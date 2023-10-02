package kr.ch07.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.ch07.dto.User6DTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class User6MapperTest {
	
	@Autowired
	private User6Mapper mapper;
	
	@Test
	public void insertUser6() {
		User6DTO user1 = User6DTO.builder()
				.uid("a108")
				.name("홍길동")
				.birth("2023-09-06")
				.gender("M")
				.age(33)
				.addr("부산")
				.hp("010-1234-1111")
				.build();
		mapper.insertUser6(user1);
		log.info("user1: "+user1);
				
	}
	
	public void selectUser6s() {
		
		List<User6DTO> users = mapper.selectUser6s();
		
		for(User6DTO user : users) {
			log.info(user.toString());
		}
		
	}
	
	
	
	

}
