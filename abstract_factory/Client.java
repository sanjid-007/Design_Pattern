public class Client {
    public static void main(String[] args) {
        int level = (int) (Math.random() * 2) + 1;

        ObstacleFactory factory;

        if (level == 1)
            factory = new Level1AsteroidsFactory();
        else
            factory = new Level2AsteroidsFactory();

        int score = (int) (Math.random() * 2000);

        Obstacle obstacle = factory.createObstacle(score);
        obstacle.show();

        if (level == 1)
            factory = new Level1DebrisFieldFactory();
        else
            factory = new Level2DebrisFieldFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        if (level == 1)
            factory = new Level1Iceberg();
        else
            factory = new Level2Iceberg();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        if (level == 1)
            factory = new Level1Fireball();
        else
            factory = new Level2Fireball();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        if (level == 1)
            factory = new Level1Blackhole();
        else
            factory = new Level2Blackhole();

        obstacle = factory.createObstacle(score);
        obstacle.show();

    }
}