package zmeika;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TutorialWindowTest {
    TutorialWindow TW = new TutorialWindow();

    @Test
    public void tutorialWindow() {
        Assert.assertEquals(11,TW.TutorialWindow(1));
    }
}