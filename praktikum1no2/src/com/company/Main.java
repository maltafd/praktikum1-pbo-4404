package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Buku b1 = new Buku("Harry Potter","J.K. Rowling",300000);
        Buku b2 = new Buku("UML","Ivar Jacobson",400000);
        b1.print();
        b2.print();
    }
}
