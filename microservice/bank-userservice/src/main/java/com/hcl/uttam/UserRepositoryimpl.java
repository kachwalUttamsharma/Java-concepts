package com.hcl.uttam;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class UserRepositoryimpl  {

  @Autowired
  UserRepository userRepository;
  
  public User userAuthentication(String user) {
	  System.out.println("Service : "+ user);
	  return userRepository.getUserByUsername(user);
  }

}
