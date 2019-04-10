package ie.tudublin;



public class Colours
{
    private String colour;
    private int rgb;
    private float value;

    public Colours(String colour, int rgb, float value)
    {
        this.colour = colour;
        this.rgb = rgb;
        this.value = value;
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
