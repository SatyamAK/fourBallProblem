import processing.core.PApplet;

public class MainClass extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    private int positionOfBallOne = 0;
    private int positionOfBallTwo = 0;
    private int positionOfBallThree = 0;
    private int positionOfBallFour = 0;

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

        ellipse(positionOfBallOne, HEIGHT/5, 10, 10);
        ellipse(positionOfBallTwo, 2*HEIGHT/5, 10, 10);
        ellipse(positionOfBallThree, 3*HEIGHT/5, 10, 10);
        ellipse(positionOfBallFour, 4*HEIGHT/5, 10, 10);

        positionOfBallOne = (++positionOfBallOne)%WIDTH;
        positionOfBallTwo = (2+positionOfBallTwo)%WIDTH;
        positionOfBallThree = (3+positionOfBallThree)%WIDTH;
        positionOfBallFour = (4+positionOfBallFour)%WIDTH;
    }

    private void createWhiteBackground() {
        background(225);
    }
}
