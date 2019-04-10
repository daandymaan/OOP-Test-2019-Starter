package ie.tudublin;

import processing.data.TableRow;

public class Resistor 
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public Resistor(int value)
    {
        int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
        int ones = value - ((hundreds * 100)  + (tens * 10)); 
        
    }
    public Resistor(TableRow tr)
    {
        
        //tr.getrow would not work with no heading 
        //could not find a processing guide either 
        
    }
    public String toString()
    {
        return "value" + value;
    }

    



}