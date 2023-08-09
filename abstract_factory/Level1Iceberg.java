public class Level1Iceberg extends IcebergsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        return new B68Iceberg();
    }

}