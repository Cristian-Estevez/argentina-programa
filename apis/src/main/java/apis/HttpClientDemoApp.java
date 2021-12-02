package apis;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class HttpClientDemoApp {

	public static void main(String[] args) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest
				.newBuilder()
				.uri(URI.create("https://swapi.dev/api/planets/6/"))
				.GET()
				.build();
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		String json = response.body();
		
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		
		Planet p = gson.fromJson(json, Planet.class);
		
		System.out.println(p);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(p.getResident(i));
		}
	}
}

class Planet {
	
	String climate, name;
	int diameter;
	
	String[] residents;
	
	public Person getResident(int index) throws IOException, InterruptedException {
		HttpRequest request = HttpRequest
				.newBuilder()
				.uri(URI.create(residents[index]))
				.GET()
				.build();
		
		HttpClient client = HttpClient.newHttpClient();
		HttpResponse<String> response = client
				.send(request, HttpResponse.BodyHandlers.ofString());
		
		String json = response.body();
		
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		
		return gson.fromJson(json, Person.class);
	}
	
	public String[] getResidents() {
		return residents;
	}

	public void setResidents(String[] residents) {
		this.residents = residents;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Planet [name=" + name + ", climate=" + climate + ", diameter=" + diameter + "]";
	}
	
}

class Person {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}