package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{
	ArrayList<Colours> colours = new ArrayList<Colours>();
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();
	

	public void loadResistors()
	{
		Table table = loadTable("resistors.csv","header");
		System.out.println(table.getRowCount());
		int value1 = table.getInt(1, 0);
		Resistor r = new Resistor(value1);
		resistors.add(r);
		int value2 = table.getInt(1, 0);
		Resistor r2 = new Resistor(value2);
		resistors.add(r2);
		int value3 = table.getInt(1, 0);
		Resistor r3 = new Resistor(value3);
		resistors.add(r3);
		

		
	}
	public void loadColours()
	{
		Table table = loadTable("colours.csv","header");
		for(TableRow tr:table.rows())
		{
			
			Colours c = new Colours(tr);
			colours.add(c);
		}
	}
	public void printColours()
	{
		System.out.println("Colour |     RGB    | Value");
		for(int i=0; i<colours.size();i++)
		{
			Colours c = colours.get(i);
			
			System.out.println(c.toString());
		}
	}
	public Colours findColor(int value)
	{
		for(int i = 0; i<colours.size();i++)
		{
			Colours v = colours.get(i);

			if(v.getValue()==value)
			{ 
				System.out.println(v.toString());
				return v;
			}
		}

		return null;
	}


	public void settings()
	{
		size(500, 800);
		loadColours();
		loadResistors();
		printColours();
		
	}

	public void setup() 
	{
		
	}
	
	public void draw()
	{	
		int x;
		int y;
		int size = 50;
		background(255);		
		
		rect(150, 100, 150, 150);
		
	}
}
