package com.trylabs;

public class Main {

    public static void main(String[] args) {
Fraction f1=new Fraction(1,2);
Fraction f2=new Fraction(3,5);
Fraction f3=new Fraction(6,8);
f1.addingFraction(f2.getNumerator(),f2.getDenominator());
f1.Print();
System.out.println(f1.getReverseFraction());
    }
}
