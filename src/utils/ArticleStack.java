/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import models.Article;

public class ArticleStack {
    private Node top;  // يمثل قمة الستاك

    public ArticleStack() {
        this.top = null;
    }

    //  push: إدخال عنصر إلى الستاك
    public void push(Article a) {
        Node newN = new Node(a);
        newN.next = top;  // العقدة الجديدة تشير للعقدة التي كانت في الأعلى
        top = newN;       // تصبح العقدة الجديدة هي الأعلى
    }
    
    

    public Article pop() {
        if (isEmpty()) {
            System.out.println("Erorrُ");
            return null;
        }
        Article article = top.article;
        top = top.next;  // نزّل المستوى إلى العقدة التالية
        return article;
    }

    // 👀 peek: عرض العنصر الأعلى بدون حذفه
    public Article peek() {
        if (isEmpty()) {
            System.out.println("Empty steck");
            return null;
        }
        return top.article;
    }

    // هل الستاك فارغ؟
    public boolean isEmpty() {
        return top == null;
    }

    // طباعة كل العناصر من الأعلى للأسفل
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Empty steck");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.article);
            temp = temp.next;
        }
    }
}
