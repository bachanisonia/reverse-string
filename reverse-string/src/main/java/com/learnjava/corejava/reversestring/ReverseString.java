package com.learnjava.corejava.reversestring;

public class ReverseString {

	@SuppressWarnings("null")
	public String reverseString(char[] inputString) {
		
		//String outputString = "";
		//int letterCnt=0;
		//char[] outputStrArr;
		if (inputString == null) {
			
			return "";
		}
		
		StringBuilder sb = new StringBuilder();
		int strLength = inputString.length;
		
		try {
			
			for (int i=strLength-1; i>=0 ; i-- )
			{
				//outputStrArr[letterCnt]=inputString[i];
				sb.append(inputString[i]);
				//letterCnt+=1;
			}
			
		}
		catch(NullPointerException e) {
			System.out.println("The Input string is null, hence returning blank");
			e.printStackTrace();
			return "";
		}
	
		//return outputStrArr.toString();
		return sb.toString();
		
	}
	
}
