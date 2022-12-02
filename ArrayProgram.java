/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanku;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author moklet
 */
public class ArrayProgram {
      public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    boolean main = true;
    int x;

      System.out.print ("Masukkan jumlah bilangan yang kan di entri : ");
    int n = input.nextInt ();
    int[] number = new int[n];

    Random r = new Random ();
    int Low = 1;
    int High = 20;

    for (int i = 0; i < number.length; i++)
    {
	number[i] = r.nextInt (High) + Low;
    }

    while (main)
    {
	String menu = ("Pilih menu yang tersedia dibawah ini \n"
		       + "1. Lihat Angka \n"
		       + "2. Acak Angka \n"
		       + "3. Sorting angka ascending \n"
		       + "4. Sorting angka descending \n"
		       + "5. Keluar \n" 
		       + "Masukkan Angka : ");

	System.out.print (menu);
	int pilihan = input.nextInt ();

	while (pilihan < 1 || pilihan > 5)
	{
	    System.out.println (menu);
	    pilihan = input.nextInt ();
	}

	switch (pilihan)
	{
	  case 1:
	      System.out.println ("Daftar angka : " + Arrays.toString (number));
	      System.out.println ();
	      break;

	  case 2:
	      int index, hold;
	      Random acak = new Random ();
	      for (int i = number.length - 1; i > 0; i--)
	      {
	          index = acak.nextInt (i + 1);
	          hold = number[index];
	          number[index] = number[i];
	          number[i] = hold;
	      }

	      System.out.println ("Hasil angka acak : "+ Arrays.toString (number));
	      System.out.println ();
	      break;
	    
	   case 3:
	      x = number.length;
	      for (int i = 0; i < x - 1 ; i++)
	      {
	          for (int j = 0; j < x - i - 1 ; j++)
	          {
	              if (number[j] > number[j+1])
	              {
	                  int temp = number[j];
	                  number[j] = number[j+1];
	                  number[j+1] = temp;
	              }
	          }
	      }
	      
	      System.out.println("Angka setelah sorting ascending : " + Arrays.toString(number));
	      System.out.println();
	      break;
	      
	   case 4:
	      x = number.length;
	      for (int i = 0; i < x - 1 ; i++)
	      {
	          for (int j = 0; j < x - i - 1 ; j++)
	          {
	              if (number[j] < number[j+1])
	              {
	                  int temp = number[j];
	                  number[j] = number[j+1];
	                  number[j+1] = temp;
	              }
	          }
	      }
	      
	      System.out.println("Angka setelah sorting descending : " + Arrays.toString(number));
	      System.out.println();
	      break;
	      
	    case 5:
	      main = false;
	  }
    }
  }
}



