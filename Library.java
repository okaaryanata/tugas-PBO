/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbooka;

/**
 *
 * @author OkaAryanata
 */
public class Library {
    public void operasiBorrow(int x, Book book ){
        book.jum = book.jum - x;
    }
    public void operasiReturn(int x, Book book){
        //Book buku = new Buku();
        book.jum = book.jum + x;
    }
    
}
