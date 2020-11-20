package LR_4;

public class Voorujenie 
{
	private String nameGroup;
    private int Price;
    private int Kol;
    
    public String getNameGroup() {return nameGroup; }
    public int getKol() {return Kol; }
    public int getPrice() {return Price; }
    
    public Voorujenie (String nameGroup, int Kol, int Price)
    {
    	this.nameGroup = nameGroup;
    	this.Kol = Kol;
    	this.Price = Price;
    }
    
    public void display(){
        
        System.out.printf("Название состава: %s/n"
        		+ "Количество состава: %s\n"
        		+ "Цена: %s");
    }
}
