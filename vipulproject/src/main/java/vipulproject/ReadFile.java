package vipulproject;
import java.io.*;
import java.util.*;

public class ReadFile {

	private Scanner x;
	private Scanner y;
	public void Openfile(){
		try{
			x=new Scanner(new File("C:\\Users\\Punit Baliyan\\Desktop\\exam\\fileA.txt"));
			y=new Scanner(new File("C:\\Users\\Punit Baliyan\\Desktop\\exam\\fileB.txt"));
			}
		catch(Exception e){
			System.out.println("not able to find file");
		}
	}
	
	public void Readfile(){
		while(x.hasNext()){
			String a=x.next();
			System.out.printf("%s", a);
			
		}
		
	while(y.hasNext()){
		String b=y.next();
		System.out.printf("%s", b);
		
	}
	}
	 public void Closefile(){
		 x.close();
		 y.close();
	 }
	
}
