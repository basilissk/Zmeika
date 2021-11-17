package zmeika;

import org.junit.Assert;
import org.junit.Test;

public class TutorialWindowTest {
    private boolean flag;
    zmeika.TutorialWindow TW = new zmeika.TutorialWindow();

    @Test
    public void Window(){
        if (TW != null ){
            flag = true;
        }
        Assert.assertTrue(flag);
    }

}