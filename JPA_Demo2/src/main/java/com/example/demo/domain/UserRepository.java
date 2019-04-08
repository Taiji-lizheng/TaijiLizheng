package com.example.demo.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, String>,JpaSpecificationExecutor<User>,PagingAndSortingRepository<User,String>{
	
	/*@Query("select u from User u where u.id=4")
	List<User> findAllUsers();
	*/
	/*@Modifying
	@Query("update User u set u.name=0 where u.id=:id")
	void updateFlag(@Param("id")String id);*/
	
	//List<Dept> findByFlagAndParentIsNullOrderByDeptIndexAsc(@Param("flag") int i);

	List<User> findByIdAndUsernameIsNullOrderByIdAsc(@Param("id") int i);
}
