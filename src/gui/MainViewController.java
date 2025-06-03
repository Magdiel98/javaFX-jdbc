package gui;

import javafx.scene.control.MenuItem;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemDepartamento;

	@FXML
	private MenuItem menuItemVendedor;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemDepartamentoAction() {
		System.out.println("onMenuItemDepartamento");
	}
	
	@FXML
	public void onMenuItemVendedorAction() {
		System.out.println("onMenuItemVendedor");
	}
	
	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("onMenuItemAbout");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	
}	
