package LR_5;

import java.util.Scanner;

public class Program 
{
	public static void main (String[] args)
	{
		Samolet N = new Samolet("airbus 138", "S7");
		N.Price(25000);
		N.drawObject();
		
		System.out.println("\n");
		
		Tank S = new Tank("Katusha", "SSSR");
        S.Price(97000);
        S.drawObject() ;

        System.out.println("\n");

        Strelkovoe P = new Strelkovoe("¿ -47", "SSSR");
        P.Price(250000);
        P.drawObject();
	}
}
