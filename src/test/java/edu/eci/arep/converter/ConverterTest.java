package edu.eci.arep.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
	
	// Celsius To Fahrenheit
	@Test
	public void shouldConvertFromCelsiusToFahrenheitWithoutDecimals() {
		//Positive Values
		Assert.assertTrue(Converter.celsiusToFahrenheit(0, 0) == 32);
		Assert.assertTrue(Converter.celsiusToFahrenheit(1, 0) == 34);
		Assert.assertTrue(Converter.celsiusToFahrenheit(10, 0) == 50);
		Assert.assertTrue(Converter.celsiusToFahrenheit(25, 0) == 77);
		Assert.assertTrue(Converter.celsiusToFahrenheit(100, 0) == 212);
		
		//Negative Values
		Assert.assertTrue(Converter.celsiusToFahrenheit(-1, 0) == 30);
		Assert.assertTrue(Converter.celsiusToFahrenheit(-10, 0) == 14);
		Assert.assertTrue(Converter.celsiusToFahrenheit(-32, 0) == -26);
		Assert.assertTrue(Converter.celsiusToFahrenheit(-77, 0) == -107);
		Assert.assertTrue(Converter.celsiusToFahrenheit(-101, 0) == -150);
	}
	
	// Celsius To Fahrenheit
	@Test
	public void shouldConvertFromCelsiusToFahrenheitWithDecimals() {
		Assert.assertTrue(Converter.celsiusToFahrenheit(0.7352f, 2) == 33.32f);
		Assert.assertTrue(Converter.celsiusToFahrenheit(1.6253555f, 4) == 34.9256f);
		Assert.assertTrue(Converter.celsiusToFahrenheit(10.4555f, 1) == 50.8f);
		Assert.assertTrue(Converter.celsiusToFahrenheit(25.17f, 1) == 77.3f);
		Assert.assertTrue(Converter.celsiusToFahrenheit(163.64444f, 0) == 327);
		Assert.assertTrue(Converter.celsiusToFahrenheit(-1.6527676f, 5) == 29.02502f);
	}
	
	
	// Fahrenheit To Celsius
	@Test
	public void shouldConvertFromFahrenheitToCelsiusWithoutDecimals() {
		//Positive Values
		Assert.assertTrue(Converter.fahrenheitToCelsius(101, 0) == 38);
		Assert.assertTrue(Converter.fahrenheitToCelsius(25, 0) == -4);
		Assert.assertTrue(Converter.fahrenheitToCelsius(10, 0) == -12);
		Assert.assertTrue(Converter.fahrenheitToCelsius(1, 0) == -17);
		Assert.assertTrue(Converter.fahrenheitToCelsius(0, 0) == -18);

		//Negative Values
		Assert.assertTrue(Converter.fahrenheitToCelsius(-1, 0) == -18);
		Assert.assertTrue(Converter.fahrenheitToCelsius(-10, 0) == -23);
		Assert.assertTrue(Converter.fahrenheitToCelsius(-32, 0) == -36);
		Assert.assertTrue(Converter.fahrenheitToCelsius(-77, 0) == -61);
		Assert.assertTrue(Converter.fahrenheitToCelsius(-101, 0) == -74);
	}
	
	// Fahrenheit To Celsius
	@Test
	public void shouldConvertFromFahrenheitToCelsiusWithDecimals() {
		Assert.assertTrue(Converter.fahrenheitToCelsius(101, 4) == 38.3333f);
		Assert.assertTrue(Converter.fahrenheitToCelsius(-10, 3) == -23.333f);
		Assert.assertTrue(Converter.fahrenheitToCelsius(0.98999534f, 2) == -17.23f);
		Assert.assertTrue(Converter.fahrenheitToCelsius(4315.09999999f, 0) == 2380);
		Assert.assertTrue(Converter.fahrenheitToCelsius(-4315.09999999f, 1) == -2415.1f);
		Assert.assertTrue(Converter.fahrenheitToCelsius(25.17f, 4) == -3.7944f);
	}
}