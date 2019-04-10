package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{
	ArrayList<Colours> colours = new ArrayList<Colours>();
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();
	String help;
	String help2;
	String help3;
	
	int size = 150;

	public void loadResistors()
	{
		Table table = loadTable("resistors.csv","header");
		System.out.println(table.getString(0, 0));
		help = table.getString(0, 0);
		help2 = table.getString(1, 0);
		help3 = table.getString(2, 0);
		
		
		
		
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
	public void render()
	{
		
		rect(100,100,100,100);
		
		rect(100,250,100,100);
		
		rect(100,400,100,100);
		
		rect(100,550,100,100);

			
		
	}
	
	public void draw()
	{	
		
		background(255);	
		
		render();
		
		
	}
}
