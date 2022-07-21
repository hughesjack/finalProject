package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SceneController {
	private Stage stage;
	private Node node;
	private Scene scene;
	private Parent root;
	
	//For every FXML File, need method to create scene with or without new stage circumstantially
	@FXML
	public void startSignIn(ActionEvent event) throws IOException{
		this.node = (Node) event.getSource();
		this.stage = (Stage) node.getScene().getWindow();
		stage.close();
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/FXMLFiles/SignIn.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	//Errors
	@FXML
	public void startError1() throws IOException {
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/FXMLFiles/Error1.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.showAndWait();
	}
	
	@FXML
	public void startError2() throws IOException {
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/FXMLFiles/Error2.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.showAndWait();
	}
	
	@FXML
	public void startError3() throws IOException {
		this.stage = new Stage();
		this.root = FXMLLoader.load(getClass().getResource("/FXMLFiles/Error3.fxml"));
		this.scene = new Scene(root);
		stage.setScene(scene);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.showAndWait();
	}
}
