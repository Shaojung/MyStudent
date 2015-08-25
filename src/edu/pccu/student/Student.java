/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.pccu.student;

/**
 *
 * @author Administrator
 */
public class Student {
    public int student_id;
    public String student_name;
    public String student_tel;
    
    public Student(int id, String n, String t)
    {
        this.student_id = id;
        this.student_name = n;
        this.student_tel = t;
    }
    
}
