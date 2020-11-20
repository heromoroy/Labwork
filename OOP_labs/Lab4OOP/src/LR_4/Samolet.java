package LR_4;

public class Samolet extends Voorujenie
{
	private String nameSamolet;
	private int kolSamolet;
	
	public Samolet (String nameGroup, int Kol, int Price, String nameSamolet, int kolSamolet)
	{
		super(nameGroup, Kol, Price);
		this.nameSamolet = nameSamolet;
		this.kolSamolet = kolSamolet;
	}
	
	public String getNameSamolet() {return nameSamolet;}
	public int getKolSamolet() {return kolSamolet;}
	
	public void display()
	{
		System.out.printf("Название команды: %s \n"
				+ "Количество состава: %s \n"
				+ "Модель самолета: %s \n"
				+ "Количество самолетов: %s \n"
				+ "Бюджет на состав: %s", super.getNameGroup(), super.getKol(),
				nameSamolet, kolSamolet, super.getPrice());
	}
}
