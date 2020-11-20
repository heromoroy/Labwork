package LR_4;

public class Tank extends Voorujenie
{
	private String nameTank;
	private int kolTank;
	
	public Tank (String nameGroup, int Kol, int Price, String nameTank, int kolTank)
	{
		super(nameGroup, Kol, Price);
		this.nameTank = nameTank;
		this.kolTank = kolTank;
	}
	
	public String getNameTank() {return nameTank;}
	public int getKolTank() {return kolTank;}
	
	public void display()
	{
		System.out.printf("Название команды: %s \n"
				+ "Количество состава: %s \n"
				+ "Модель танка: %s \n"
				+ "Количество танков: %s \n"
				+ "Бюджет на состав: %s", super.getNameGroup(), super.getKol(),
				nameTank, kolTank, super.getPrice());
	}
}
