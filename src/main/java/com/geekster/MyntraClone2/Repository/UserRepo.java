package com.geekster.MyntraClone2.Repository;

import com.geekster.MyntraClone2.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

}
