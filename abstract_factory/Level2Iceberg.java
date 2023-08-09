public class Level2Iceberg extends IcebergsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        return new A15Iceberg();
    }

}