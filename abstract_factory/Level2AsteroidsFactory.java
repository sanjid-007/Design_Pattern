public class Level2AsteroidsFactory extends AsteriodsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if (score > 1000)
            return new Rocky_Asteroids();
        else
            return new Silicon_Asteroids();
    }
}