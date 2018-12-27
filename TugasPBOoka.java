/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbooka;

import java.util.Scanner;

/**
 *
 * @author OkaAryanata
 */
public class TugasPBOoka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    menu();
    }
    public static void menu(){
        int x,y;
        String z;
        Scanner pil = new Scanner(System.in);
        Scanner judul = new Scanner(System.in);
        Scanner jum = new Scanner(System.in);
        
        Library library = new Library();
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setJudul("oka");
        book1.setJum(3);
        book2.setJudul("aryanata");
        book2.setJum(4); 
        System.out.println("Menu");
        System.out.println("=====================");
        System.out.println("1. Pinjam Buku");
        System.out.println("2. pengembalian Buku");
        System.out.println("3. Exit");
        System.out.print("input : ");
        x = pil.nextInt();
        while(x!=3) {
            switch (x) {
                case 1:
                    System.out.println("====DAFTAR BUKU====");
                    System.out.println("Judul Buku1 = "+book1.getJudul());
                    System.out.println("Jumlah Buku1 = "+book1.getJum());
                    System.out.println("Judul Buku1 = "+book2.getJudul());
                    System.out.println("Jumlah Buku1 = "+book2.getJum());
                    System.out.println("==============");
                    System.out.print("Masukan Judul = ");
                    z = judul.next();
                    System.out.print("Masukan Jumlah = ");
                    y = jum.nextInt();
                    
                    //System.out.println(z + y+ book1.getJudul()+ book1.judul);
                    if (z==book1.judul){ //TIDAK MAU dibandingkan
                        if (y > book1.getJum()){
                        System.out.println("Jumlah melebihi stok");
                        } if(y < 0){
                        System.out.println("Jumlah tidak boleh minus");
                        }    
                        else {
                        System.out.println("Buku Berhasil Dipinjam");
                        library.operasiBorrow(y,book1);
                        }
                    }
                    if (z==book2.getJudul()){
                        if (y > book2.getJum()){
                        System.out.println("Jumlah melebihi stok");
                        } if(y < 0){
                        System.out.println("Jumlah tidak boleh minus");
                        }    
                        else {
                        System.out.println("Buku Berhasil Dipinjam");
                        }
                    }
                    else {
                        System.out.println("Judul buku tidak tersedia");
                    }
                    
                    System.out.println("");
                    menu();
                    break;
                    
                case 2:
                    System.out.print("Masukan Judul = ");
                    z = judul.next();
                    System.out.print("Masukan Jumlah = ");
                    y = jum.nextInt();
                    if (z == book1.getJudul()){ //TIDAK MAU dibandingkan
                        if (y+book1.getJum()>3){
                        System.out.println("Jumlah salah");
                        } if(y < 0){
                        System.out.println("Jumlah tidak boleh minus");
                        }    
                        else {
                        System.out.println("Buku Berhasil Dikembalikan");
                        library.operasiReturn(y,book1);
                        }
                    }
                    else if (z==book2.getJudul()){
                        if (y+book2.getJum()>4){
                        System.out.println("Jumlah melebihi stok");
                        } if(y < 0){
                        System.out.println("Jumlah tidak boleh minus");
                        }    
                        else {
                        System.out.println("Buku Berhasil Dipinjam");
                        library.operasiReturn(y,book2);
                        }
                    }
                    else {
                        System.out.println("Judul buku tidak tersedia");
                    }
                    System.out.println("");
                    menu();
                    break;
                
                default:
                    System.out.println("Inputan Salah");
                    System.out.println("");
                    menu();
                    break;
            }
        }
    }   
}