package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(MAX_BALL_NUMBER); // Generate Random Number for ball
        Ball ball = new Ball(ballNumber, colorSupplier.getRandomColor());
        return ball;
    }
}
