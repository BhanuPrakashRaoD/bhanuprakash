package com.virtusa.converter.input;

import java.util.Scanner;

import com.virtusa.converter.impl.BritishWordConverter;
import com.virtusa.converter.itf.WordConverter;

public class App {
public static void main(String[] args) throws Exception {
	Scanner scn=new Scanner(System.in);
	  System.out.println("Enter the number to Convert");
	  try {
			Long num=scn.nextLong();
			getConvertedText(num);
	  }catch(Exception ex) {
			throw new Exception("Invalid number");
			
		}
}


   public static void getConvertedText(long num){
			BritishWordConverter bwc= new BritishWordConverter();
			if(num >= WordConverter.minValue && num <= WordConverter.maxValue) {
			System.out.println(bwc.convert(num));
			}else {
				System.out.println("Please enter a value in the range 1 to 999999999");
			}
	}
	

}
