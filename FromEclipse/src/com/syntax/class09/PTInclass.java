package com.syntax.class09;

public class PTInclass {

	public static void main(String[] args) {

	//char for grade
	// how many elements inside array ?  use length
		
		char[] gradev1= {'A','B','D','E','F'};
		
		for(int i=0;i<gradev1.length;i++) {
		System.out.print(gradev1[i]+" ");
		}
		System.out.println();
		System.out.println("-------------");
		
		char[]gradev2 = new char[6];
		gradev2[0]='A';
		gradev2[1]='B';
		gradev2[2]='C';
		gradev2[3]='D';
		gradev2[4]='E';
		gradev2[5]='F';
		}
	}

