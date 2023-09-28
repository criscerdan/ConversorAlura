
package com.alura.converter;


public class ConversorMonedas {
	private static final double tasaDeCambioDolar=0.0037;
	private static final double tasaDeCambioEuro=0.0033;
	private static final double tasaDeCambioLibras=0.0028;
	private static final double tasaDeCambioYenJapones=0.52;
	private static final double tasaDeCambioWonKorean=4.66;
	
        private static double obtenerTasaDeCambio(String moneda) {
	switch(moneda) {
	case "Dólar":
                     return tasaDeCambioDolar;
              case "Euro":
                     return tasaDeCambioEuro;
              case "Libras":
                     return tasaDeCambioLibras;
              case "Yen Japonés":
                     return tasaDeCambioYenJapones;
              case "Won Coreano":
                     return tasaDeCambioWonKorean;
              default:
              return 1.0;
		}
	}
	
	
	
	public static double convertirPesosA(double valor,String monedaDestino) {
		double tasaDeCambio=obtenerTasaDeCambio(monedaDestino);
		return valor*tasaDeCambio;
	}
	
	public static double convertirMonedasAPesos(double valorMonedaExt,String monedaOrigen) {
		double tasaDeCambio=obtenerTasaDeCambio(monedaOrigen);
                             double resultado = valorMonedaExt / tasaDeCambio;
		return Math.round(resultado * 100.0) / 100.0;
	}
	

}