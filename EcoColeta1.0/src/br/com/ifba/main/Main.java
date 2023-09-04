package br.com.ifba.main;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author JoezioJr
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/com/ifba/view/RegisterView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        String css = this.getClass().getResource("/br/com/ifba/styleSheets/style.css").toExternalForm();
        scene.getStylesheets().add(css);
        
        stage.setScene(scene);
        stage.setTitle("Registro");
        stage.centerOnScreen();
        stage.show();

    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
