package com.alura.converter;



import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Hyperlink;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.HostServices;

public class PrimaryController {
    @FXML
    private Button ButtonConvertir;

    @FXML
    private ComboBox<String> ComboBoxUnidadDestino;

    @FXML
    private ComboBox<String> ComboBoxUnidadOrigen;

    @FXML
    private ComboBox<String> ComboBoxTipoConversor;

    @FXML
    private ImageView Ig;

    @FXML
    private ImageView Linkedin;

    @FXML
    private TextField TextFieldMonedaDestino;

    @FXML
    private TextField TextFieldMonedaOrigen;

    @FXML
    private ImageView Twitter;

    @FXML
    private ImageView git;
    
    @FXML
    private Button ButtonLinkedin;
    @FXML
    private Button ButtonIg;
    @FXML
    private Button ButtonGit;
    @FXML
    private Button ButtonTwitter;
       
    

   
     
    
    @FXML
    public void initialize(){
        
        ComboBoxTipoConversor.getItems().addAll("Conversion de Divisas", "Conversion de Temperaturas");
         ComboBoxTipoConversor.setOnAction(e->SelectionConversor());
        ButtonConvertir.setOnAction(e-> convertir());
        
    }
   
    
    
       

    private void convertir() {
    try{
    String unidadOrigen = ComboBoxUnidadOrigen.getValue();
    String unidadDestino = ComboBoxUnidadDestino.getValue();
    double montoDeOrigen = Double.parseDouble(TextFieldMonedaOrigen.getText());
    double resultado = 0.0;

    String tipoDeConversor = ComboBoxTipoConversor.getValue();

    if (tipoDeConversor.equals("Conversion de Divisas")) {
        if (unidadOrigen.equals("Pesos")) {
            resultado = ConversorMonedas.convertirPesosA(montoDeOrigen, unidadDestino);
        } else {
            resultado = ConversorMonedas.convertirMonedasAPesos(montoDeOrigen, unidadOrigen);
        }
    }

    if (tipoDeConversor.equals("Conversion de Temperaturas")) {
        if (unidadOrigen.equals("Celsius") && unidadDestino.equals("Fahrenheit")) {
            resultado = ConversorDeTemperatura.ConvertirCelsiusAFarenheit(montoDeOrigen);
        }
        if (unidadOrigen.equals("Celsius") && unidadDestino.equals("Kelvin")) {
            resultado = ConversorDeTemperatura.ConvertirCelsiusAKelvin(montoDeOrigen);
        }
        if (unidadOrigen.equals("Farenheit") && unidadDestino.equals("Celcius")) {
            resultado = ConversorDeTemperatura.ConvertirFarenheitACelcius(montoDeOrigen);
        }
        if (unidadOrigen.equals("Farenheit") && unidadDestino.equals("Kelvin")) {
            resultado = ConversorDeTemperatura.ConvertirFarenheitACelcius(montoDeOrigen);
            resultado = ConversorDeTemperatura.ConvertirCelsiusAKelvin(resultado);
        }

        if (unidadOrigen.equals("Kelvin") && unidadDestino.equals("Celcius")) {
            resultado = ConversorDeTemperatura.ConvertirKelvinACelcius(montoDeOrigen);
        }

        if (unidadOrigen.equals("Kelvin") && unidadDestino.equals("Farenheit")) {
            resultado = ConversorDeTemperatura.ConvertirKelvinAFarenheit(montoDeOrigen);
        }
    }

    // Configura el TextFieldMonedaDestino con el resultado de la conversión
    TextFieldMonedaDestino.setText(String.valueOf(resultado));
    }catch(NumberFormatException e){
           System.out.println("Error: Ingresa un número válido en el campo de origen.");

    }catch(Exception e){
           System.out.println("Error inesperado: " + e.getMessage());  
    }
}

       private void SelectionConversor() {
              String tipoDeConversor = ComboBoxTipoConversor.getValue();
               ComboBoxUnidadOrigen.getItems().clear();
               ComboBoxUnidadDestino.getItems().clear();
               
               TextFieldMonedaOrigen.clear();
               TextFieldMonedaDestino.clear();
               if (tipoDeConversor.equals("Conversion de Divisas")) {
                  ComboBoxUnidadOrigen.getItems().addAll("Pesos", "Dólar", "Euro", "Libras", "Yen Japonés", "Won Coreano");
                  ComboBoxUnidadDestino.getItems().addAll("Pesos", "Dólar", "Euro", "Libras", "Yen Japonés", "Won Coreano");
               } else if (tipoDeConversor.equals("Conversion de Temperaturas")) {
                  ComboBoxUnidadOrigen.getItems().addAll("Celsius", "Kelvin", "Fahrenheit");
                  ComboBoxUnidadDestino.getItems().addAll("Celsius", "Kelvin", "Fahrenheit");
               }
       }
      
      
}     
 
       


