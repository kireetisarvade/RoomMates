package com;
import java.util.Scanner;
public class Vending 
{
	public void coke(Scanner sc)
	{
		System.out.println("enter the amount");
		int coke=sc.nextInt();
		float a=1.25f;
		float totalvalue = (coke-a);
		System.out.println(totalvalue);
	}
	public void soda(Scanner sc)
	{
		System.out.println("enter the amount");
		int coke=sc.nextInt();
		float a=1.75f;
		float totalvalue = (coke-a);
		System.out.println(totalvalue);
	}
	public void pepsi(Scanner sc)
	{
		System.out.println("enter the amount");
		int coke=sc.nextInt();
		float a=2.55f;
		float totalvalue = (coke-a);
		System.out.println(totalvalue);
	}
	public static void main(String[] args)
	{
		Vending vn = new Vending();
		Scanner sc = new Scanner(System.in);
		//Scanner scr = new Scanner(System.in);
		int ch=sc.nextInt();
		do
		{
		System.out.println("1)coke \n 2)soda \n 3)pepsi \n enter the options:");
		switch(ch)
		{
		case 1:vn.coke(sc);
		break;
		case 2:vn.pepsi(sc);
		break;
		case 3:vn.soda(sc);
		break;
		//default:
		//System.out.println("default executed");
		}
		}
		while(ch!=4);
		sc.close();
	}
			
}