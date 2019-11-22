package com.briup.bean;

import java.io.Serializable;
import java.util.Date;


public class SUser implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    private String username;

    private String password;

    private String zip;

    private String address;

    private String phone;

    private String email;

    private Date dob;

   

   

    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getZip() {
		return zip;
	}



	public void setZip(String zip) {
		this.zip = zip;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Date getDob() {
		return dob;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}



	public SUser(String username, String password, String zip, String address, String phone, String email, Date dob) {
		this.username = username;
		this.password = password;
		this.zip = zip;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.dob = dob;
	}
    
    

	public SUser(Long id, String username, String password, String zip, String address, String phone, String email,
			Date dob) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.zip = zip;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "SUser [id=" + id + ", username=" + username + ", password=" + password + ", zip=" + zip + ", address="
				+ address + ", phone=" + phone + ", email=" + email + ", dob=" + dob + "]";
	}

	
    
}