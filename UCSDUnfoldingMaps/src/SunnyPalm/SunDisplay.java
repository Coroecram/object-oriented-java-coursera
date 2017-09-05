package SunnyPalm;

import processing.core.PApplet;
import processing.core.PImage;

public class SunDisplay extends PApplet {
    PImage img;
    
    public void setup() {
        img = loadImage("http://cseweb.ucsd.edu/~minnes/palmTrees.jpg", "jpg");
    }
}
