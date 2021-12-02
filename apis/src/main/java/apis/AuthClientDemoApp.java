package apis;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AuthClientDemoApp {

	public static void main(String[] args) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest
				.newBuilder()
				.uri(URI.create("https://hte-one-api.dev/v2/character/5cd99d4bde30eff6ebccfe9e"))
				.GET()
				// agregar autenticacion TENGO QUE CREARME UN TOKEN VALIDO
				.setHeader("Authorization", "Bearer ipqdyPZJnaVTTsUCXIJV")
				.build();
		
		HttpResponse<String> response = client
				.send(request, HttpResponse.BodyHandlers.ofString());
		
		String json = response.body();
	
		System.out.println(json);
	}
}
