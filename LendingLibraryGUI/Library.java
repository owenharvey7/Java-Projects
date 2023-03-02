package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Library {
	private Label result;
	private boolean start = true;
	
	@FXML
	public void delete(ActionEvent event) {
		
		}

	@FXML
	public void save(ActionEvent event) {
		if(start) {
			result.setText("Enter an item to loan");
			start = false;
		}
	}
	@FXML
	public void open(ActionEvent event) {
		
	}
	@FXML
	public void add(ActionEvent event) {
		
	}
}
