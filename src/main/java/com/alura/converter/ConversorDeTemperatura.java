/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.converter;

/**
 *
 * @author Usuario
 */
public class ConversorDeTemperatura {
       //LOGICA DE CONVERSION DE LAS TEMPERATURAS
       
       public static double ConvertirCelsiusAFarenheit(double valorInicial){
              double farenheit=valorInicial*1.8+32;
              farenheit=(double)Math.round(farenheit*100d)/100;
              return farenheit;
       }
       
       
       public static double ConvertirCelsiusAKelvin(double valorInicial){
              double kelvin=valorInicial+273.15;
              kelvin=(double)Math.round(kelvin*100d)/100;
              return kelvin;
       }
       
       public static double ConvertirFarenheitACelcius(double valorInicial) {
	double celcius = (valorInicial - 32) / 1.8;
              celcius = (double) Math.round(celcius *100d)/100;
              return celcius;
       }
       
       public static double ConvertirKelvinACelcius(double valorInicial) {
              double kelvincelcius = (valorInicial - 32) / 1.8;
              kelvincelcius = (double) Math.round(kelvincelcius *100d)/100;
              return kelvincelcius;
       }
       
       public static double ConvertirKelvinAFarenheit(double valor) {
	double kelvinFarenheit = ConvertirKelvinACelcius(valor);
	kelvinFarenheit =ConvertirCelsiusAFarenheit(kelvinFarenheit);
	kelvinFarenheit= (double) Math.round(kelvinFarenheit *100d)/100;
              return kelvinFarenheit;
	}

}

