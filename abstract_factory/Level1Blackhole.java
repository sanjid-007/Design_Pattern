public class Level1Blackhole extends BlackholesFactory {

    @Override
    public Obstacle createObstacle(int score) {
        return new StallerMassBlackhole();
    }

}