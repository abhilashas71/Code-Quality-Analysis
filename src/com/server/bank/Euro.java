package com.server.bank;

public class Euro extends Currency {
	
 int currencyValue;
 static double rupeesConvresionRate = 25 ;
 
 public Euro(int currentValue)
 {
	 this.currencyValue = currentValue;
 }

@Override
public double getRupeesConvresionRate() {
	System.out.println("Hello");
	 
	return rupeesConvresionRate;
}

@Override
public int getCurrencyValue() {
	 
	return currencyValue;
}
}
