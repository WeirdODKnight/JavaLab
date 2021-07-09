package com.craft.knowledges.strings;

public abstract class StringHandling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String g ="hello";
		char f = g.charAt(2);
		String m = f + "";
		System.out.println(m.toUpperCase());
		g.replace('l', 'L');
		
		
	}
	public abstract void addi();
	
}
