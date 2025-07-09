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
    private String category;
    private Date date;

    // Constructor
    public Article(String title, String content, String category, Date date) {
        this.title = title;
        this.content = content;
        this.category = category;
        this.date = date;
    }

    // Getters
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

    // Setters (اختياري إذا أردت التعديل لاحقًا)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // تمثيل المقالة على شكل نص
    @Override
    public String toString() {
        return "📄 العنوان: " + title + "\n" +
               "📂 التصنيف: " + category + "\n" +
               "📅 التاريخ: " + date + "\n" +
               "📝 المحتوى:\n" + content;
    }
}
