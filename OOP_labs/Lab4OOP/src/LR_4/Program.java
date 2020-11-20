package LR_4;

import java.util.Scanner;

public class Program 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - Класс 'Стрелковое'\n"
				+ "2 - Класс 'Танк'\n"
				+ "3 - Класс 'Самолет'\n"
				+ "N - выход");
		System.out.print("Введите число: ");
		int a = sc.nextInt();
		System.out.print("\n");
				
		
		
		switch (a)
		{
			case 1: 
				{
					Voorujenie HP = new Strelkovoe("ВДВ", 19952, 1236548, "AK-47", 56);
					HP.display();
				}
				break;
			case 2:
			{
				Voorujenie HPE_ProLiant = new Tank("ВДВ", 5546132, 370680, "1G 4P", 56);
				HPE_ProLiant.display();
			}
			break;
			case 3:
			{
				Voorujenie HPE_ProLiant = new Samolet("ВДВ", 36589, 9856624, "Аэрофлот", 1235);
				HPE_ProLiant.display();
			}
			break;
			default: break;
		}

	}
}
