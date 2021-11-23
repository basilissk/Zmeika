package zmeika;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainWindowTest {
    MainWindow MW = new MainWindow();

    @Test
    public void mainWindow() {
        Assert.assertEquals(631,MW.MainWindow(1));

    }
}