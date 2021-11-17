package zmeika;

import org.junit.Assert;
import org.junit.Test;

public class TutorialWindowTest {
    MainWindow MW = new MainWindow();

    @Test
    public void Window(){
        Assert.assertNotNull(MW);
    }

}