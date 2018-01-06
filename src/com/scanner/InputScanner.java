package com.scanner;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

class InputScanner {
	InputStream in;
	InputScanner(InputStream in){
		this.in=in;
	}
	public int nextInt() throws IOException{
		StringBuffer sb=new StringBuffer();
		int date,result;
		date=this.in.read();
		while(date!=13){
			sb.append((char)date);
			date=this.in.read();
		}
		result=Integer.parseInt(new String(sb));
		return result;
	}
	public long nextLong() throws IOException{
		StringBuffer sb=new StringBuffer();
		long date,result;
		date=this.in.read();
		while(date!=13){
			sb.append((char)date);
			date=this.in.read();
		}
		BigInteger x=new BigInteger(new String(sb));
		System.out.println(sb);
		result=x.longValue();
		return result;
	}
	public float nextFloat() throws IOException{
		StringBuffer sb=new StringBuffer();
		float date,result;
		date=this.in.read();
		while(date!=13){
			sb.append((char)date);
			date=this.in.read();
		}
		BigDecimal x=new BigDecimal(new String(sb));
		result=x.floatValue();

		return result;
	}
	public double nextDouble() throws IOException{
		StringBuffer sb=new StringBuffer();
		double date,result;
		date=this.in.read();
		while(date!=13){
			sb.append((char)date);
			date=this.in.read();
		}
		BigDecimal x=new BigDecimal(new String(sb));
		result=x.doubleValue();
		if(result>Double.MAX_VALUE){
			System.out.println("Infinity");
			System.exit(0);
		}
		if(result<Double.MIN_VALUE){
			System.out.println("-Infinity");
			System.exit(0);
		}
		return result;
	}
	

}
