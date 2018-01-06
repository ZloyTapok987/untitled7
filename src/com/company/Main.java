package com.company;

        import java.util.*;
        import java.lang.*;
        import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student(2,3);
        Scientific c1=new Scientific();
        Scientific c2=new Scientific(3);
        System.out.println(s1.GetHeight());
        System.out.println(s2.GetHeight());
        System.out.println(c1.GetHeight());
        System.out.println(c2.GetHeight());
        Scientific c3=new Scientific(c2);
    }
}
