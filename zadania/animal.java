public class animal
{
    int sound;
    String color;
    int legs_count;

    public animal(int sound, String color, int legs_count)
    {
        this.sound = sound;
        this.color = color;
        this.legs_count = legs_count;
    }

    public int getSound()
    {
        return sound;
    }

    public String getColor()
    {
        return color;
    }

    public int getLegsCount()
    {
        return legs_count;
    }

    public String getInfo()
    {
        return "Sound: " + sound + "\n color: " + color + "\n legs_count: " + legs_count;
    }
}