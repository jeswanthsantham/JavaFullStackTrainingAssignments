package com.basics.quest5;

public class MobileMain {

	public static void main(String[] args) {
		Mobile mobile1 = new Mobile("15", "Iphone", "Blue");
		Mobile mobile2 = new Mobile("V20", "Vivo", "White");
		Mobile mobile3 = new Mobile("S23", "Samsung", "Black");
		Mobile mobile4 = new Mobile("Mi7", "Remi", "Pink");
		Mobile mobile5 = new Mobile("17", "Iphonepro", "Orange");

		Mobile[] mobileArray = new Mobile[5];
		mobileArray[0] = mobile1;
		mobileArray[1] = mobile2;
		mobileArray[2] = mobile3;
		mobileArray[3] = mobile4;
		mobileArray[4] = mobile5;

		for (Mobile mobile : mobileArray) {
			mobile.getDetails();
		}
		System.out.println();
        
		System.out.println("Samsung Brand Mobiles are: ");
		for (Mobile m : mobileArray) {
			if (m.brand.equals("Samsung")) {
				m.getDetails();
			}
		}

		}

	}


