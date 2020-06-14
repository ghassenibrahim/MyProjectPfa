package com.pfa.dao;

import java.util.List;


import com.pfa.model.User;

public interface IUserDao {
	public User getUserById(int id);
	public List<User> getAllUser();
	public void  addUser(User c);
	public void  deleteUser(int id);
	public User update(User c);
	

}
