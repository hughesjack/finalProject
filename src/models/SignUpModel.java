package models;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import main.FileHandler;

public class SignUpModel extends Model{
	
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
	
	//check if user exists within map(contiansKey)
	public boolean findUser(String username) {
		return true;
	}
	
	//adds user to the map, updates file with new user information
	public void addUser() throws IOException{
		setUserProfileInfo();
	}

}
