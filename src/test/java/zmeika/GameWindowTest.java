package zmeika;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameWindowTest {
    GameWindow GW = new GameWindow();

    @Test
    public void gameWindow() {
        Assert.assertEquals(4,GW.GameWindow(1));
    }
}