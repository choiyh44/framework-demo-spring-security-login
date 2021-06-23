package kr.co.ensmart.frameworkdemo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.ensmart.frameworkdemo.app.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUserName(String username);
}
