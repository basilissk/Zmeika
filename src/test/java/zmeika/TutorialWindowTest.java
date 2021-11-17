package zmeika;

import org.junit.Assert;
import org.junit.Test;

public class TutorialWindowTest {
    @Test
    public void Window(){
        Assert.assertFalse(TutorialWindow.isDefaultLookAndFeelDecorated());
    }

}