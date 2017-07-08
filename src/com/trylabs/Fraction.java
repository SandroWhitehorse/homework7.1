package com.trylabs;

public class Fraction {
    private int numerator;
    private int denominator;
    int getNumerator(){
        return numerator;}
    int getDenominator(){
        return denominator;}
    String getReverseFraction (){
        return denominator+"/"+numerator ;
    }
    void Print(){
        System.out.println(numerator+"/"+denominator);}
    void setNumerator(int i){
        numerator=i;}
        void setDenominator(int j){
        denominator=j;}
    void addingFraction(int _numerator2, int _denominator2)
    {
        numerator=numerator*_denominator2+_numerator2*denominator;
        denominator=denominator*_denominator2;
    }
    void myltiplayingFraction(int _numerator2, int _denominator2)
    {
        numerator=numerator*_numerator2;
        denominator=denominator*_denominator2;
    }
    void dividingFraction(int _numerator2, int _denominator2)
    {
        numerator=numerator/_numerator2;
        denominator=denominator/_denominator2;
    }
        Fraction(){
            this.numerator=0;
            this.denominator=0;
        }
        Fraction(int _numerator,int _denominator){
        this.numerator=_numerator;
        this.denominator=_denominator;
        }


    }



