public class Level2Fireball extends FireballsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        return new ExplosiveFireballs();
    }

}