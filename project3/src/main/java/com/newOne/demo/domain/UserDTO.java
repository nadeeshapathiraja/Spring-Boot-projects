package com.newOne.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;   

@Entity
@Table(name= "user")
public class UserDTO {
	
	@Column (name= "userId")
	private Integer Id;
	
	@Column (name= "fname")
	private String fname;
	
	@Column (name= "lname")
	private String lname;
	
	@Column (name= "email")
	private String email;
	
	@Column (name= "dob")
	private String dob;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getNic() {
		return Id;
	}
	public void setNic(Integer nic) {
		this.Id = nic;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	

}
