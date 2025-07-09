/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;



/**
 *
 * @author hp
 */


public class Article {
    private String title;
    private String content;
    public String category;
    private Date date;
    public Article(String title, String content, String category, Date date) {
        this.title = title;
        this.content = content;
        this.category = category;
        this.date = date;
    }

   
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }

    public Date getDate() {
        return date;
    }

   public void setTitle(String title) {
    if (title != null && title.trim().length() > 2) {
        this.title = title;
    } else {
        System.out.println("ERORR .....");
    }
}
 public void setContent(String content) {
    if (content == null || content.trim().isEmpty()) {
        System.out.println("Erorr!");
        return;
    }
    if (content.length() < 10) {
        System.out.println("Erorr.");
        return;
    }
    if (content.length() > 10000) {
        System.out.println("ERorr.");
        return;
    }

    this.content = content;
}

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(Date date) {
    if (date != null ) {
        this.date = date;
    } else {
        System.out.println("ERORR....");
    }
}

    @Override
    public String toString() {
        return " Title : " + title + "\n" +
               "Category: " + category + "\n" +
               "Date : " + date + "\n" +
               "Content :" + content;
    }
}
