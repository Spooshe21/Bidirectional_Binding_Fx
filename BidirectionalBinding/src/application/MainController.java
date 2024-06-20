/********************************************************************************************
 *   COPYRIGHT (C) 2022 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  MainController.java
 *   Project:  Bidirectional Binding
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package application;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 * MainController class is the entry point for the JavaFX application. It
 * handles the bidirectional binding between a Slider and a TextField.
 */
public class MainController implements Initializable {

	/**
	 * Slider component to select a value.
	 */
	@FXML
	private Slider slider;

	/**
	 * TextField component to display the selected value.
	 */
	@FXML
	private TextField field;

	/**
	 * Initial value for the Slider and TextField.
	 */
	private static final double INIT_VALUE = 50.0;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Set the initial value for the Slider and TextField.
		slider.setValue(INIT_VALUE);
		field.setText(String.valueOf(INIT_VALUE));

		// Bind the Slider value property to the TextField text property using
		// NumberFormat.
		field.textProperty().bindBidirectional(slider.valueProperty(), NumberFormat.getNumberInstance());
	}
}