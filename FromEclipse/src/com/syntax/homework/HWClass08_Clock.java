package com.syntax.homework;

public class HWClass08_Clock {

	public static void main(String[] args) {
		
		String time=null;
		for (int hour = 0; hour < 24; hour++) {
			
			for (int min = 0; min <60; min++) {
				for (int sec = 0; sec < 60; sec++) {
					if(hour<10&&min<10&&sec<10) {
						time="0"+hour+":";
					}
					System.out.println(time);
				}
			}

		}
	
		for (int h = 0; h <= 23; h++) {

			for (int m1 = 0; m1 <= 5; m1++) {
			for (int m2 = 0; m2 <= 9; m2++) 
			if (h < 10) {
			System.out.println("0" + h + ":" + m1 + " " + m2);
			} else {
			System.out.println(h + ":" + m1 + " " + m2);
	
	
	}
			}
		}
	}
}

	
