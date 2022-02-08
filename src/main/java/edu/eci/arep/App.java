package edu.eci.arep;

import static spark.Spark.*;

import edu.eci.arep.converter.Converter;

public class App {

	public static void main(String[] args) {
		//port(getPort());
		//get("/hello", (req, res) -> "Hello Heroku");
		
		System.out.println("Converted C to F: "+Converter.fahrenheitToCelsius(-4315.09999999f, 1));
	}
	
	static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 4567;
	}
}