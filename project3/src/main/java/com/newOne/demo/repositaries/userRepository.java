package com.newOne.demo.repositaries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newOne.demo.domain.UserDTO;

public interface userRepository extends JpaRepository<UserDTO, Integer> {

}
