package LR_4;

import java.util.Scanner;

public class Program 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - ����� '����������'\n"
				+ "2 - ����� '����'\n"
				+ "3 - ����� '�������'\n"
				+ "N - �����");
		System.out.print("������� �����: ");
		int a = sc.nextInt();
		System.out.print("\n");
				
		
		
		switch (a)
		{
			case 1: 
				{
					Voorujenie HP = new Strelkovoe("���", 19952, 1236548, "AK-47", 56);
					HP.display();
				}
				break;
			case 2:
			{
				Voorujenie HPE_ProLiant = new Tank("���", 5546132, 370680, "1G 4P", 56);
				HPE_ProLiant.display();
			}
			break;
			case 3:
			{
				Voorujenie HPE_ProLiant = new Samolet("���", 36589, 9856624, "��������", 1235);
				HPE_ProLiant.display();
			}
			break;
			default: break;
		}

	}
}
