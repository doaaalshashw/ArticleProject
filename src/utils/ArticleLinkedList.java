/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import models.Article;

public class ArticleLinkedList {
    private Node head;  // أول عنصر في القائمة

    public ArticleLinkedList() {
        this.head = null;
    }

    //  إضافة عنصر في نهاية القائمة
    public void add(Article a) {
        Node newNode = new Node(a);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // ️ حذف مقالة بالعنوان
    public void delete(String title) {
        if (head == null) {
            System.out.println("Erorr");
            return;
        }

        if (head.article.getTitle().equals(title)) {
            head = head.next;  // حذف أول عنصر
            System.out.println("dodo");
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.article.getTitle().equals(title)) {
                current.next = current.next.next;
                System.out.println(" scsecc'" + title + "'.");
                return;
            }
            current = current.next;
        }

       System.out.println("Erorr'" + title + "'.");
    }

    //  طباعة جميع المقالات
    public void printAll() {
        if (head == null) {
            System.out.println("Erorr");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.article);
            current = current.next;
        }
    }
}


    
    
    
    
    
    
    
//        public Node head;
//        
//public void add(Article article) {
//        Node newNode = new Node(article);
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        Node current = head;
//        while (current.next != null) {
//            current = current.next;
//        }
//
//        current.next = newNode;
//    }
//   public void printAll() {
//        Node current = head;
//        while (current != null) {
//            System.out.println(current.article);
//            current = current.next;
//        }
//
//}




