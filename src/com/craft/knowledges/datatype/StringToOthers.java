package com.craft.knowledges.datatype;

public class StringToOthers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i = 42; 
   String stri = Integer.toString(i); 
   double d = 23.44;
   String strd = Double.toString(d); 
   long l = 12233L;
   String strl = Long.toString(l);
   float f = 12.33f;
   String strf = Float.toString(f);
   
   d = Double.parseDouble(strd);
   f = Float.parseFloat(strf);
   i = Integer.parseInt(stri);
   l = Long.parseLong(strl);
		
		
	}
}