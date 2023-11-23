package com.tahsina.utilities;

import java.io.FileReader;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;



public class JsonData {
	private JsonObject data;

	public JsonData() {
		try {
			String filePath = "C:\\Users\\tahsina priya\\Documents\\workspace-spring-tool-suite-4-4.20.0.RELEASE\\WafilifeWebAutoProject1\\testData\\TestData.json";
			FileReader reader = new FileReader(filePath);
			this.data = JsonParser.parseReader(reader).getAsJsonObject();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getString(String key) {
		return data.get(key).getAsString();
	}

	public int getInt(String key) {
		return data.get(key).getAsInt();
	}

}
