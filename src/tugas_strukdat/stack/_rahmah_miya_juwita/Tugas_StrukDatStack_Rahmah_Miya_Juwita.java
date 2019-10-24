/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_strukdat.stack._rahmah_miya_juwita;

/**
 *
 * @author Rahmah Miya Juwita
 */
public class Tugas_StrukDatStack_Rahmah_Miya_Juwita {
    static String Buku[];
    static int ukuran;
    static int Top;

    static void Stack (int kotak){
        ukuran = kotak;
        Buku = new String [ukuran];
        Top = -1;
    }
    public static void main(String[] args) {
        Tugas_StrukDatStack_Rahmah_Miya_Juwita a = new Tugas_StrukDatStack_Rahmah_Miya_Juwita();
        a.Stack(4);
        a.isi("Matematika");
        a.isi("Fisika");
        a.isi("Kimia");
        a.isi("B. Indonesia");
        a.ambil();
        a.ambil();
        System.out.println();
        a.print();
    }
    
    static void isi (String input){
        if(Top >= ukuran){
            System.out.println("Maaf, Kotak Sudah Penuh");
            System.out.println("");
        } else {
            Buku[++Top]= input;
            System.out.println("(+)"+" Buku "+input+ "  Dimasukan Kedalam Kotak");
            System.out.println("");
        }

    }
    static void ambil () {
        if(Top<=0){
            System.out.println("Kotak Sudah Kosong");
            System.out.println("");
        } else {

            String temp = Buku[Top];
            Buku[Top]=null;
            Top--;
            System.out.println("(-)"+"Buku "+temp+ " Dikeluarkan Dari Kotak");
            System.out.println("");

        }
    }

    static void print(){
        System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][]");
        System.out.println("Buku yang Ada Di Dalam Kotak : ");
        for(int i =Buku.length-1; i>=0;i--){
            
            System.out.print("||           " );
            System.out.println("        ||" );
            System.out.println("      " +Buku[i]);
            System.out.print("||           " );
            System.out.println("        ||" );
            
        }
        System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][]");

    }
}
