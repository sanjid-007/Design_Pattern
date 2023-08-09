public class Level2Blackhole extends BlackholesFactory {

    @Override
    public Obstacle createObstacle(int score) {
        return new SuperMassiveBlackhole();
    }

}