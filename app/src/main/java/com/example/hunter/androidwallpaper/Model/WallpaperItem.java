package com.example.hunter.androidwallpaper.Model;

public class WallpaperItem {
    public String imageUrl;
    public String categoryId;

    public String getImageLink() {
        return imageUrl;
    }

    public void setImageLink(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public WallpaperItem() {

    }

    public WallpaperItem(String imageUrl, String categoryId) {

        this.imageUrl = imageUrl;
        this.categoryId = categoryId;
    }
}
