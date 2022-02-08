package edu.eci.arep.converter;

import java.text.DecimalFormat;

public class Converter {
	
	public static float celsiusToFahrenheit(float celsiusDegrees, int precision) {
		float inFahrenheit = (celsiusDegrees * (9f/5f)) + 32;
		DecimalFormat df = new DecimalFormat(formatPrecision(precision));
		String[] parts =  (df.format(inFahrenheit)).split(",");
		if (parts.length == 2) {
			return Float.parseFloat(parts[0]+"."+parts[1]);
		}
		else {
			return Float.parseFloat(parts[0]);
		}
	}
	
	public static float fahrenheitToCelsius(float fahrenheitDegrees, int precision) {
		Float inSelsius = (5f/9f)*(fahrenheitDegrees - 32);
		DecimalFormat df = new DecimalFormat(formatPrecision(precision));
		String[] parts =  (df.format(inSelsius)).split(",");
		if (parts.length == 2) {
			return Float.parseFloat(parts[0]+"."+parts[1]);
		}
		else {
			return Float.parseFloat(parts[0]);
		}
	}
	
	private static String formatPrecision(int precision) {
		String format = "0";
		if (precision > 0) {
			format += ".";
			for (int i = 0; i < precision; i++) {
				format += "0";
			}
		}
		return format;
	}
	
}