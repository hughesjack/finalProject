package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public abstract class Controller {

	private String username;
	private String password;
	
	@FXML
	private TextField userId;
	@FXML
	private PasswordField passwordId;
	
}
