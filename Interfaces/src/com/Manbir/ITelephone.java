package com.Manbir;

public interface ITelephone {  //an interface
     void powerOn();
     void dial(int phoneNumber);
     void answer();
     boolean callPhone(int phoneNumber) ;
     boolean isRinging();

}
