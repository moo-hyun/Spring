package kr.ch10.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ch10.dto.User3DTO;
import kr.ch10.entity.User3Entity;
import kr.ch10.repository.User3Repository;

@Service
public class User3Service {
	
	@Autowired
	private User3Repository repo;
	
	
	public void insertUser3(User3DTO dto) {
		// DTO 를 Entity로 변환
		User3Entity entity = dto.toEntity();
		repo.save(entity);
	}
	
	public User3DTO selectUser3(String id) {
		
		Optional<User3Entity> result = repo.findById(id);
		
		//Entity를 DTO로 변환
		User3DTO dto = result.get().toDTO();
		
		return dto;
	}
	
	public List<User3DTO> selectUser3s() {
		
		//List<Entity>를 List<DTO>로 변환해서 리턴
		return repo.findAll()
				.stream()
				.map(entity -> User3DTO.builder()
								.id(entity.getId())
								.name(entity.getName())
								.hp(entity.getHp())
								.age(entity.getAge())
								.build())
				.collect(Collectors.toList());
	}
	public void updateUser3(User3DTO dto) {
		
		//DTO를 Entity로 변환
		User3Entity entity = dto.toEntity();
		repo.save(entity);
		
	}
	public void deleteUser3(String id) {
		repo.deleteById(id);
	}
	
	
}
