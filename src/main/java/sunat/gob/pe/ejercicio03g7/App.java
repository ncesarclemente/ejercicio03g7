package sunat.gob.pe.ejercicio03g7;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
       
    	Label lblUsuario = new Label("Usuario");
    	lblUsuario.setPrefWidth(80);
    	TextField txtUsuario = new TextField();
    	Label lblPassword = new Label("Password");
    	lblPassword.setPrefWidth(80);
    	PasswordField txtPassword = new PasswordField();
    	Button btnLogin = new Button("Login");
    	btnLogin.setPrefSize(70, 25);
    	Button btnCancelar = new Button("Cancelar");
    	btnCancelar.setPrefSize(70, 25);
    	
    	HBox filaUsuario = new HBox(lblUsuario, txtUsuario);
    	HBox filaPassword = new HBox(lblPassword, txtPassword);
    	HBox filaBotones = new HBox(btnLogin, btnCancelar);
    	filaBotones.setAlignment(Pos.BASELINE_CENTER);
    	filaBotones.setSpacing(10);

    	VBox tabla =new VBox(filaUsuario, filaPassword, filaBotones);
    	tabla.setSpacing(10);
    	var scene = new Scene(tabla, 250, 150);
        stage.setScene(scene);
        stage.setTitle("Login de usuario");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}