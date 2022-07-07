import processing.core.PApplet;

public class MainClass extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    public static void main(String[] args){
        PApplet.main("MainClass", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        createWhiteBackground();
    }

    @Override
    public void draw() {
        super.draw();
        ellipse(WIDTH/2, HEIGHT/2, 10, 10);
    }

    private void createWhiteBackground() {
        background(225);
    }
}
