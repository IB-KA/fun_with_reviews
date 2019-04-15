package application;

import java.net.URL;
import java.util.ResourceBundle;
import application.dice.D10;
import application.dice.D100;
import application.dice.D12;
import application.dice.D20;
import application.dice.D4;
import application.dice.D6;
import application.dice.D8;
import application.dice.Dice;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

//Look! A lot of comments!

public class Controller implements Initializable {
	@FXML
	RadioButton d4, d6, d8, d10, d12, d20, d100;
	@FXML
	Label roller;
	//More!
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		final ToggleGroup group = new ToggleGroup();
		d4.setToggleGroup(group);
		d4.setSelected(true);
		d6.setToggleGroup(group);
		d8.setToggleGroup(group);
		d10.setToggleGroup(group);
		d12.setToggleGroup(group);
		d20.setToggleGroup(group);
		d100.setToggleGroup(group);	
	}
//Even More!
	public void roll(ActionEvent clicked) {
		Dice die;
		if (d4.isSelected()) die = new D4();
		else if (d6.isSelected()) die = new D6();
		else if (d8.isSelected()) die = new D8();
		else if (d10.isSelected()) die = new D10();
		else if (d12.isSelected()) die = new D12();
		else if (d20.isSelected()) die = new D20();
		else die = new D100();
		int result = die.roll();
		roller.setText("You rolled a "+result);
	}
}
