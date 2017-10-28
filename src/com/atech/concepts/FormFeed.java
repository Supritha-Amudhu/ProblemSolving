package com.atech.concepts;
import java.io.*;
import java.text.DecimalFormat;
public class FormFeed {

	public static void main(String[] args) {
		System.out.println("Hello" + "\f");
		double n = 890.123956;
		DecimalFormat myFormat = new DecimalFormat("00,00,000.###");
		String output = myFormat.format(n);
		System.out.println(output);
	}

}
