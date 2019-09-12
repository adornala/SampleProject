package com.bank.crditapp;

public @interface Student {

    String school() default  "UHCL";

    int rollNo() default  12345;

    int gpa() default  4;

    String name() default  "Aneela";
}
