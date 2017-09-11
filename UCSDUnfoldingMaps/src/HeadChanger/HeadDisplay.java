package HeadChanger;

import processing.core.PApplet;
import processing.core.PImage;

public class HeadDisplay extends PApplet {
    PImage bgHeadImg;
    PImage bgEyesImg;
    PImage bgMouthImg;
    PImage dkHeadImg;
    PImage dkEyesImg;
    PImage dkMouthImg;
    PImage samusHeadImg;
    PImage samusEyesImg;
    PImage samusMouthImg;
    
    
    public void setup() {
        size(400,300);
//        bgHeadImg = loadImage("C:/Users/mbudnick/Documents/Online courses/object-oriented-java-coursera/UCSDUnfoldingMaps/src/HeadChanger/resources/Sprites/Head/Biggoron_Head.jpg");
//        bgHeadImg.resize(467, height/3);
//        image(bgHeadImg, -40, 0);
        
//        bgEyesImg = loadImage("C:/Users/mbudnick/Documents/Online courses/object-oriented-java-coursera/UCSDUnfoldingMaps/src/HeadChanger/resources/Sprites/Eyes/Biggoron_eyes.jpg");
//        bgEyesImg.resize(width, height/3);
//        image(bgEyesImg, 0, height/3);
//        
//        bgMouthImg = loadImage("C:/Users/mbudnick/Documents/Online courses/object-oriented-java-coursera/UCSDUnfoldingMaps/src/HeadChanger/resources/Sprites/Mouth/Biggoron_Mouth.jpg");
//        bgMouthImg.resize(width, height/3);
//        image(bgMouthImg, 0, 2*(height/3));
        
//        dkHeadImg = loadImage("C:/Users/mbudnick/Documents/Online courses/object-oriented-java-coursera/UCSDUnfoldingMaps/src/HeadChanger/resources/Sprites/Head/dk_head.jpg");
//        dkHeadImg.resize(453, height/3);
//        image(dkHeadImg, -34, 0); 
//        
        dkEyesImg = loadImage("C:/Users/mbudnick/Documents/Online courses/object-oriented-java-coursera/UCSDUnfoldingMaps/src/HeadChanger/resources/Sprites/Eyes/dk_eyes.jpg");
        dkEyesImg.resize(width+15, height/3);
        image(dkEyesImg, -12, height/3);
        
        dkMouthImg = loadImage("C:/Users/mbudnick/Documents/Online courses/object-oriented-java-coursera/UCSDUnfoldingMaps/src/HeadChanger/resources/Sprites/Mouth/dk_mouth.jpg");
        dkMouthImg.resize(width+37, height/3);
        image(dkMouthImg, -27, 2*(height/3));
        
        samusHeadImg = loadImage("C:/Users/mbudnick/Documents/Online courses/object-oriented-java-coursera/UCSDUnfoldingMaps/src/HeadChanger/resources/Sprites/Head/samus_head.jpg");
        samusHeadImg.resize(width, height/3);
        image(samusHeadImg, 0, 0);

//        samusEyesImg = loadImage("C:/Users/mbudnick/Documents/Online courses/object-oriented-java-coursera/UCSDUnfoldingMaps/src/HeadChanger/resources/Sprites/Eyes/samus_eyes.jpg");
//        samusEyesImg.resize(width, height/3);
//        image(samusEyesImg, -10, height/3);

//        samusMouthImg = loadImage("C:/Users/mbudnick/Documents/Online courses/object-oriented-java-coursera/UCSDUnfoldingMaps/src/HeadChanger/resources/Sprites/Mouth/samus_mouth.jpg");
//        samusMouthImg.resize(width, height/3);
//        image(samusMouthImg, -10, 2*(height/3));
        
    }
}
