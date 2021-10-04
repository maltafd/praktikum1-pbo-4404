package com.company;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Barang b1 = new Barang("BRG-001","Tas Gucci");
        b1.setHarga(1200);

        Barang b2 = new Barang("BRG-002","Printer Epson L355");
        b2.setHarga(200);

        b1.print();

        Barang b3 = new Barang("BRG-003","Koper",150);
        Barang b4 = new Barang("BRG-004","Helm",20);

        b3.print();
        b4.print();

        System.out.println(b1.getHarga()+b3.getHarga()+b4.getHarga());
    }
}
