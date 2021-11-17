package zmeika;

import org.junit.Assert;
import org.junit.Test;

public class TutorialWindowTest {
    private boolean flag = false;
    MainWindow MW = new MainWindow();

    @Test
    public void Window(){
        if (MW != null){
            flag = true;
        }
        Assert.assertFalse(flag);
    }

}