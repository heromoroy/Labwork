package LR_4;

public class Strelkovoe extends Voorujenie
{
	private String nameStrelkovoe;
	private int kolStrelkovoe;
	
	public Strelkovoe (String nameGroup, int Kol, int Price, String nameStrelkovoe, int kolStrelkovoe)
	{
		super(nameGroup, Kol, Price);
		this.nameStrelkovoe = nameStrelkovoe;
		this.kolStrelkovoe = kolStrelkovoe;
	}
	
	public String getNameStrelkovoe() {return nameStrelkovoe;}
	public int getKolStrelkovoe() {return kolStrelkovoe;}
	
	public void display()
	{
		System.out.printf("�������� �������: %s \n"
				+ "���������� �������: %s \n"
				+ "������ ������: %s \n"
				+ "���������� ������: %s \n"
				+ "������ �� ������: %s", super.getNameGroup(), super.getKol(),
				nameStrelkovoe, kolStrelkovoe, super.getPrice());
	}
}

