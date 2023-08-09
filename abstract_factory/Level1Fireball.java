public class Level1Fireball extends FireballsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        return new MeteroicFireballs();
    }

}