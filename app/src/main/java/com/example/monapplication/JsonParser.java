package com.example.monapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonParser {
    public static List<Item> parseJson(String jsonData) throws JSONException {
        List<Item> itemList = new ArrayList<>();

        JSONArray jsonArray = new JSONArray(jsonData);

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            String title = jsonObject.getString("title");
            double price = jsonObject.getDouble("price");
            String category = jsonObject.getString("category");
            String description = jsonObject.getString("description");
            String publicationDate = jsonObject.getString("publicationDate");
            String image = jsonObject.getString("image");

            Item item = new Item(title, price, category, description, publicationDate, image);
            itemList.add(item);
        }

        return itemList;
    }
}

