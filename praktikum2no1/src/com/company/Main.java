package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Buku> Buku = new ArrayList<Buku>();

        Buku.add(new Buku("0001","buku 1","budi","2001",250000,9));
        Buku.add(new Buku("0002","buku 2","amar","2002",500000,8));
        Buku.add(new Buku("0003","buku 3","agus","2003",750000,7));
        Buku.add(new Buku("0004","buku 4","asep","2003",500000,8));
        Buku.add(new Buku("0005","buku 5","umar","2003",250000,7));

        Buku.get(1).setjudul("ganti judul");
        Buku.get(1).setpengarang("ganti pengarang");
        Buku.get(1).setthnterbit("2022");
        Buku.get(1).setharga(999999);
        Buku.get(1).setrating(9);

        for (Buku buku:Buku){
            buku.searchisbn("0003");
        }

        Buku.remove(2);

        for (Buku buku:Buku){
            System.out.println(buku);
        }
    }
}
