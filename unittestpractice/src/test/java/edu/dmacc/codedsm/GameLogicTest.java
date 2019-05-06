package edu.dmacc.codedsm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameLogicTest {
    private GameLogic gameLogicTest;
    private GameRunnerImpl runner;

    @Before
    public void setUp() throws Exception {
        this.gameLogicTest = new GameLogic(runner);
    }

    @Test
    public void runGameTest() {
        GameResult TestResult = new GameResult();
        gameLogicTest = new GameLogic(new GameRunnerImpl());
        TestResult.setPlayer("karemera");
        assertEquals(TestResult.getPlayer(), gameLogicTest.runGame("karemera").getPlayer());
    }

    @Test
    public void buildResultTest() {
        GameResult TestResult = new GameResult();
        gameLogicTest = new GameLogic(new GameRunnerImpl());
        TestResult.setScore(1000);
        assertEquals(TestResult.getScore(),gameLogicTest.buildResult("karemera",1000).getScore());
    }
}