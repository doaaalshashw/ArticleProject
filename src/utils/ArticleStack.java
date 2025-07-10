/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import models.Article;

public class ArticleStack {

    // العقدة التي تمثل العنصر الأعلى في المكدس
    private Node top;
    private int size;

    // البناء
    public ArticleStack() {
        this.top = null;
        this.size = 0;
    }

    // ➕ push: إضافة عنصر إلى الأعلى
    public void push(Article article) {
        Node newNode = new Node(article);
        newNode.next = top;  // العقدة الجديدة تشير للعقدة الحالية في الأعلى
        top = newNode;       // تصبح العقدة الجديدة هي الأعلى
        size++;
    }

    //  pop: حذف وإرجاع العنصر الأعلى
    public Article pop() {
        if (isEmpty()) {
            System.out.println("Empty steck");
            return null;
        }

        Article removed = top.article;
        top = top.next;  // العنصر التالي يصبح الأعلى
        size--;
        return removed;
    }

    //  peek: إرجاع العنصر الأعلى بدون حذفه
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

    // إرجاع حجم الستاك
    public int size() {
        return size;
    }

    // طباعة كل العناصر
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Empty steck");
            return;
        }

        Node current = top;
        while (current != null) {
            System.out.println(current.article);
            current = current.next;
        }
    }
}


