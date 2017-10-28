package com.atech.newdimension;

public class TaskOkKo {

	public static void main(String[] args) {
		String str = "Hi I'm okay to read this book. Ok Ok";
		String str2="";
		String str3="";
		if(str.contains("Ok") || str.contains("ok")){
			str2 = str.replace("ok", "ko");
			str3 = str2.replace("Ok", "kO");
		}
		System.out.println(str3);

	}

}
