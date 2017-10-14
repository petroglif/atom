package ru.atom;

import ru.atom.model.*;

/**
 * Create sample game session with all kinds of objects that will present in bomber-man game
 */
public final class TestGameSessionCreator {
    private TestGameSessionCreator() {
    }

    static GameSession createGameSession() {
        GameSession gameSession = new GameSession();
        //TODO populate your game session with sample objects and log their creation
        Wall wall1 = new Wall(1,1,1);
        Wall wall2 = new Wall(2,2,2);
        Bomb bomb1 = new Bomb(3,3,3);
        Bomb bomb2 = new Bomb(4,4,4);
        UnbWall brick1 = new UnbWall(10,10,10);
        UnbWall brick2 = new UnbWall(20,20,20);
        BomberGirl girl = new BomberGirl (30,5000,5000);

        gameSession.addGameObject(wall1);
        gameSession.addGameObject(wall2);
        gameSession.addGameObject(bomb1);
        gameSession.addGameObject(bomb2);
        gameSession.addGameObject(brick1);
        gameSession.addGameObject(brick2);
        gameSession.addGameObject(girl);
        return gameSession;



    }
}
