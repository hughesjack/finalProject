package models;

import java.io.IOException;
import java.util.*;

import main.FileHandler;

public class SignInModel extends Model{
	
	private FileHandler filehandler = new FileHandler();
	
	Map <String, String> userProfileInfo = new HashMap <String, String>();
	
	public Map<String, String> getMap() {
		return userProfileInfo;
	}
	
	//gets user profile info from file, stores it within map
	public void getUserProfileInfo() throws IOException{
		filehandler.readFromFile(userProfileInfo);
	}
	
	//updates user information within file
	public void setUserProfileInfo() throws IOException{
		filehandler.writeToFile(userProfileInfo);
	}
	
	//check if username already exists, if it does, make sure password matches username.
	public void processUser() {
		
	}
	
	//check if user exists within map(containsKey)
	public boolean findUser(String username) {
		return true;
	}
}
