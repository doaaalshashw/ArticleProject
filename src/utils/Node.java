/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import models.Article;

public class Node {
    public Article article;
    public Node next;
        //int count;

    public Node(Article article) {
        this.article = article;
        this.next = null;
    }
}


