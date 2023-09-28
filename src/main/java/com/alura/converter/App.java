package com.alura.converter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.application.HostServices;
import javafx.fxml.FXMLLoader;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;


    @Override
    public void start(Stage stage) throws IOException {
      
        scene = new Scene(loadFXML("primary"), 400, 450);
         
        stage.setMinWidth(400);
        stage.setMinHeight(450);
        stage.setMaxWidth(400);
        stage.setMaxHeight(450);

        stage.setScene(scene);
        stage.setResizable(false); // Evita que la ventana sea redimensionable
        stage.setTitle("Conversor Alura");
        stage.show();
       
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
    

}