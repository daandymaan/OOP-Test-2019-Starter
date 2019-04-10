package ie.tudublin;
import processing.data.Table;
import processing.data.TableRow;

public class Colours
{
    private String colour;
    private int r;
    private int g;
    private int b;
    private float value;

    public Colours(String colour, int r,int g, int b, float value)
    {
        this.colour = colour;
        this.r = r;
        this.g = g;
        this.b =b;
        this.value = value;
    }
    public Colours(TableRow tr)
    {
        this(tr.getString("colour"),tr.getInt("r"),tr.getInt("g"),tr.getInt("b"), tr.getFloat("value"));
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return the rgb
     */
    public int getRgb() {
        return rgb;
    }

    /**
     * @param rgb the rgb to set
     */
    public void setRgb(int rgb) {
        this.rgb = rgb;
    }

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }
}
