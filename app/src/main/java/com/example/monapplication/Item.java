package com.example.monapplication;

public class Item {
    private String title;
    private double price;
    private String category;
    private String description;
    private String publicationDate;
    private String image;

    // Constructor, getters, and setters
    public Item(String title, double price, String category, String description, String publicationDate, String image) {
        this.title = title;
        this.price = price;
        this.category = category;
        this.description = description;
        this.publicationDate = publicationDate;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public String getImage() {
        return image;
    }
}
