/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author hp
 */
class Date {
       private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
       @Override
    public String toString() {
        // تنسيق منسق برقمين لكل من اليوم والشهر، وأربعة أرقام للسنة
        return String.format("%02d/%02d/%04d", day, month, year);
    }
} 
    
    
    
    
    

