package com.Manbir;

public class Main {  //to standardize the way a particular set of classes are used

    public static void main(String[] args) {
	    ITelephone manbirsPhone;
	    manbirsPhone = new DeskPhone(123456);
	    manbirsPhone.powerOn();
	    manbirsPhone.callPhone(123456);
	    boolean isRinging;

	    manbirsPhone.powerOn();
	    manbirsPhone = new MobilePhone(1234567);
	    manbirsPhone.callPhone(1234567);
	    manbirsPhone.answer();
    }
}
