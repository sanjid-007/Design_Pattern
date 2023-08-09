public class Level2DebrisFieldFactory extends DebrisFieldFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if (score > 1500)
            return new PersistentDebrisField();
        else
            return new StaticDebrisField();
    }
}