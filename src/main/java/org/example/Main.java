package org.example;

public class Main {

    public  String toBinary(int n){
        String res="";
        while(n>0){
           int r=n%2;
           res+=r;
           n/=2;
        }
        return new StringBuilder(res).reverse().toString();
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Main m=new Main();
        System.out.println(m.toBinary(2));
    }
}