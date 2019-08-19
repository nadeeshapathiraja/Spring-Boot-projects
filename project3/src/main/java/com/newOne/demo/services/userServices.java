package com.newOne.demo.services;

import java.util.List;

import com.newOne.demo.domain.UserDTO;

public interface userServices {

	public List<UserDTO> findAllUsers();

	public String saveUser(UserDTO userData);

	public String updateUserData(UserDTO newUserData);

	public UserDTO findById(Integer nic);

}
