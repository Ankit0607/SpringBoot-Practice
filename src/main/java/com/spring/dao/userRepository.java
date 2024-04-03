package com.spring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.spring.entities.user;

public interface userRepository extends CrudRepository<user, Integer>{

	public List<user> findByName(String name);
	
	@Query("select u from user u")
	public List<user> findAllUser();
	
	@Query("select u from user u where u.name =:n") // donot give space between =:n keep it as it is
	public List<user> findUserByOurName(@Param("n") String name);
	
	@Query("select u from user u where u.name =:n and u.city =:c")
	public List<user>findUserByNameAndCity(@Param("n") String name, @Param("c") String city);
}
