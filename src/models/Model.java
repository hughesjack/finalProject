package models;

import java.io.IOException;
import java.util.*;

import main.FileHandler;

public abstract class Model {
	
	Map <String, String> userProfileInfo = new HashMap<String, String>();
	
	private FileHandler fh = new FileHandler();
	
	public abstract Map<String, String> getMap();
	
	public abstract void getUserProfileInfo() throws IOException;
	
	public abstract void setUserProfileInfo() throws IOException;
	
	public abstract boolean findUser(String username);
	
}
