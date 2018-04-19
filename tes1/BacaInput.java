package tes1;

import java.util.Objects;
import java.util.Scanner;
 

public class BacaInput {
	
	/*
	 * 
	 * 1. hitung upah pekerja berdasarkan aturan sebagai berikut :

Base Pay tidak boleh dibawah Rp 8000,- / jam, jika kurang maka akan mengeluarkan hasil 0.0


Jika jam kerja lebih dari 40 jam dalam seminggu maka kelebihan jam akan dihitung sebagai berikut = base pay X 1,5

Jika jam kerja lebih dari 60 jam akan mengeluarkan pesan kesalahan
	 * 
	 * 
	 */
	
	public static void main(String[] abc ){
		 BacaInput baca = new BacaInput( );
        Scanner input = new Scanner( System.in );
        System.out.print( "Nama: " );
        String nama = input.next();
        System.out.print( "Umur: " );
        int umur = input.nextInt();
        System.out.println("Hello "+nama);
        System.out.println("Umur kamu : "+umur+"  =  "+baca.getNama(nama));
          
       
     System.out.println(" luas = "+   baca.luas(10, 12));
           
    }
	
	public String getNama(String pesan) {
		String pesanHasil;
		if(Objects.equals(pesan, "ABCD") ) {
			pesanHasil = "benar";
		}else {
			pesanHasil = "salah";
		}
		
		return pesanHasil;
	}
	
	public int luas(int panjang,int lebar) {
		if(panjang == 10 || lebar == 9) {
			return panjang*lebar*5;
		}else {
			return panjang*lebar;
		}
		
	}
	
	public int volume(int panjang,int lebar,int tinggi) {
		return panjang*lebar*tinggi;
	}
}
