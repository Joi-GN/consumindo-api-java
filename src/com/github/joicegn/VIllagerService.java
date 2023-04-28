package com.github.joicegn;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

public class VIllagerService {

	final String URL = "https://acnhapi.com/v1/villagers/"; 

	public Villager getVillager(int id) {
		var client = HttpClient.newHttpClient();
		var request = HttpRequest.newBuilder(URI.create(URL + id)).GET().build();

		String responseBody = client.sendAsync(request, BodyHandlers.ofString()).thenApply(HttpResponse::body).join();

		return new Gson().fromJson(responseBody, Villager.class);
	}
}
