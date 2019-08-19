package com.newOne.demo.services.impl;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.newOne.demo.repositaries.userRepository;
import com.newOne.demo.services.userServices;
import com.newOne.demo.domain.*;


@Service
public class userServiceImpl implements userServices {

	@Autowired
	private userRepository userRepository;
	
	@Override
	public List<UserDTO> findAllUsers() {
		//database connection
		List<UserDTO> allusers = userRepository.findAll();
		return allusers;
	}

	@Override
	public String saveUser(UserDTO userData) {
		userRepository.save(userData);
		return "Data Saved";
	}

	@Override
	public String updateUserData(UserDTO newUserData) {
		String msg=null;
		if(newUserData.getNic() != null) {
			userRepository.save(newUserData);
			msg="Data Updated";
		}else {
			msg="Error";
		}
		return msg;
	}

	@Override
	public UserDTO findById(Integer nic) {
		return userRepository.findOne(nic);
		
	}
	
	
}
