package com.anket.Anketoryum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anket.Anketoryum.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
	
	@Modifying
	@Query(value="INSERT INTO Users(username,email,registerdate,password,gender,place,age)"
			+ " VALUES (?1,?2,?3,?4,?5,?6,?7);",nativeQuery = true)
	void createUser(String username, String email,String registerDate,String password,int gender,int place,int age);


}
