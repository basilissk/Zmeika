package zmeika;

import org.junit.Assert;
import org.junit.Test;

public class TutorialWindowTest {
    private boolean flag;
    TutorialWindow TW = new TutorialWindow();

    @Test
    public void Window(){
        if (TW == null ){
            flag = true;
        }
        Assert.assertTrue(flag);
    }

}