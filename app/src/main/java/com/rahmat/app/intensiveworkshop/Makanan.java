package com.rahmat.app.intensiveworkshop;

/**
 * Created by muhrahmatullah on 3/31/18.
 */

public class Makanan {

    String price, title;
    int image;

    public Makanan(int image, String price, String title) {
        this.price = price;
        this.title = title;
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }
}
