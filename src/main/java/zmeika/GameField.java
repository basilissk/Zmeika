package zmeika;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import static java.lang.Math.abs;

public class GameField extends JPanel implements ActionListener {
    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private final int DBB = 4 * DOT_SIZE;
    private Image dot;
    private Image berry1;
    private Image berry2;
    private Image berry3;
    private int berryX1 = 0;
    private int berryY1 = 0;
    private int berryX2 = 0;
    private int berryY2 = 0;
    private int berryX3 = 0;
    private int berryY3 = 0;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int dots;
    private int number = 0;
    private int speadUp = 10;
    private int n = 0;
    private int minutesStart = 3;
    private int secondsStart = 0;
    private int minutes;
    private int seconds;
    private Timer timer;
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;
    private boolean Finish = true;
    private String Timer = "3.00";
    private String Number;
    private String Minutes;
    private String Seconds;
    private int y1;
    private int y2;
    private int y3;

    public GameField() {
        setBackground(Color.black);
        loadImages();
        initGame();
        timer();
        setFocusable(true);
    }

    // Стартовые данные
    public int initGame() {
        dots = 3;
        for (int i = 0; i < dots + 2; i++) {
            x[i] = 96 - i * DOT_SIZE;
            y[i] = 48;
        }
        minutes = minutesStart;
        seconds = secondsStart;
        return (x[1]);
    }

    // Обновленние окна
    public void timer() {
        timer = new Timer(250, this);
        timer.start();
        createBerry1();
        createBerry2();
        createBerry3();
    }

    // Проверка появленния ягоды в змейке
    public boolean berry1(int x, int y,int berryX1,int berryY1){
        if (berryX1 == x && berryY1 == y) {
            createBerry1();
            return true;
        }
        return false;
    }

    // Создание ягоды
    public int createBerry1() {
        berryX1 = new Random().nextInt(20) * DOT_SIZE;
        berryY1 = new Random().nextInt(20) * DOT_SIZE;
        for (int i = dots; i > 0; i--) {
            berry1(x[i],y[i],berryX1,berryY1);
        }
        if (abs(berryX1 - berryX2) < DBB && abs(berryY1 - berryY2) < DBB) {
            createBerry1();
        }
        if (abs(berryX1 - berryX3) < DBB && abs(berryY1 - berryY3) < DBB) {
            createBerry1();
        }
        return (berryX1);
    }

    // Проверка появленния ягоды в змейке
    public boolean berry2(int x, int y,int berryX2,int berryY2){
        if (berryX2 == x && berryY2 == y) {
            createBerry2();
            return true;
        }
        return false;
    }

    // Создание ягоды
    public int createBerry2() {
        berryX2 = new Random().nextInt(20) * DOT_SIZE;
        berryY2 = new Random().nextInt(20) * DOT_SIZE;
        for (int i = dots; i > 0; i--) {
            berry2(x[i],y[i],berryX2,berryY2);
        }
        if (abs(berryX2 - berryX1) < DBB && abs(berryY2 - berryY1) < DBB) {
            createBerry2();
        }
        if (abs(berryX2 - berryX3) < DBB && abs(berryY2 - berryY3) < DBB) {
            createBerry2();
        }
        return (berryX2);
    }

    // Проверка появленния ягоды в змейке
    public boolean berry3(int x, int y,int berryX3,int berryY3){
        if (berryX3 == x && berryY3 == y) {
            createBerry3();
            return true;
        }
        return false;
    }

    // Создание ягоды
    public int createBerry3() {
        berryX3 = new Random().nextInt(20) * DOT_SIZE;
        berryY3 = new Random().nextInt(20) * DOT_SIZE;
        for (int i = dots; i > 0; i--) {
            berry3(x[i],y[i],berryX3,berryY3);
        }
        if (abs(berryX3 - berryX1) < DBB && abs(berryY3 - berryY1) < DBB) {
            createBerry3();
        }
        if (abs(berryX3 - berryX2) < DBB && abs(berryY3 - berryY2) < DBB) {
            createBerry3();
        }
        return (berryX3);
    }

    // Подгрузка изображенний
    public Image loadImages() {
        ImageIcon iib1 = new ImageIcon("classes\\Berry1.png");
        berry1 = iib1.getImage();
        ImageIcon iib2 = new ImageIcon("classes\\Berry2.png");
        berry2 = iib2.getImage();
        ImageIcon iib3 = new ImageIcon("classes\\Berry3.png");
        berry3 = iib3.getImage();
        ImageIcon iid = new ImageIcon("classes\\dot.png");
        dot = iid.getImage();
        return(dot);
    }

    // Отрисовка объектов
    public int MainWindow2(int x){
        x=x+1;
        x=x+2;
        x=x+3;
        x=x+4;
        x=x+5;
        x=x+6;
        x=x+7;
        x=x+8;
        x=x+9;
        x=x+10;
        x=x+11;
        x=x+12;
        x=x+13;
        x=x+14;
        x=x+15;
        x=x+16;
        x=x+17;
        x=x+18;
        x=x+19;
        x=x+20;
        x=x+21;
        x=x+22;
        x=x+23;
        x=x+24;
        x=x+25;
        x=x+26;
        x=x+27;
        x=x+28;
        x=x+29;
        x=x+30;
        x=x+31;
        x=x+32;
        x=x+33;
        x=x+34;
        x=x+35;
        y2=x;
        return y2;
    }

    // Таймер, оставшегося времени
    public int Timer(int n1,int min,int sec) {
        if (n1 > 4) {
            n1 = 1;
            if (sec == 0) {
                min = min - 1;
                sec = 60;
            }
            sec--;
            if ((min == 0) && (sec == 0)) {
                inGame = false;
            }
            n = n1;
            minutes = min;
            seconds = sec;
        }
        return(min);
    }

    // Перемещение змейки
    public int move(int PredX, int PredY,int i) {
            x[i] = PredX;
            y[i] = PredY;
            return(x[i]);
    }

    // Изменнение положения змейки по горизонтали
    public int horizontal(boolean left, boolean right) {
        if (left) {
            x[0] -= DOT_SIZE;
        }
        if (right) {
            x[0] += DOT_SIZE;
        }
        return(x[0]);
    }

    // Изменнение положения змейки по вертикали
    public int vertical(boolean up, boolean down){
        if(up){
            y[0] -= DOT_SIZE;
        } if(down){
            y[0] += DOT_SIZE;
        }
        return(y[0]);
    }

    // Проверка поедания ягоды
    public boolean checkBerry1(int X, int Y,int berryX1,int berryY1) {
        if (X == berryX1 && Y == berryY1) {
            dots = dots + 1;
            number = number + 1;
            createBerry1();
            return(true);
        }
        return false;
    }

    // Проверка поедания ягоды
    public boolean checkBerry2(int X,int Y,int berryX2,int berryY2) {
        if (X == berryX2 && Y == berryY2) {
            dots = dots + 2;
            number = number + 2;
            createBerry2();
            return(true);
        }
        return false;
    }

    // Проверка поедания ягоды
    public boolean checkBerry3(int X, int Y, int berryX3,int berryY3) {
        if(X == berryX3 && Y == berryY3){
            dots = dots +3;
            number = number + 3;
            createBerry3();
            return(true);
        }
        return false;
    }

    // Проверка столкновений
    public int MainWindow3(int x){
        x=x+1;
        x=x+2;
        x=x+3;
        x=x+4;
        x=x+5;
        x=x+6;
        x=x+7;
        x=x+8;
        x=x+9;
        x=x+10;
        x=x+11;
        x=x+12;
        x=x+13;
        x=x+14;
        x=x+15;
        x=x+16;
        x=x+17;
        x=x+18;
        x=x+19;
        x=x+20;
        x=x+21;
        x=x+22;
        x=x+23;
        x=x+24;
        x=x+25;
        x=x+26;
        x=x+27;
        x=x+28;
        x=x+29;
        x=x+30;
        x=x+31;
        x=x+32;
        x=x+33;
        x=x+34;
        x=x+35;
        y3=x;
        return y3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(inGame){
            checkBerry1(x[0],y[0],berryX1,berryY1);
            checkBerry2(x[0],y[0],berryX2,berryY2);
            checkBerry3(x[0],y[0],berryX3,berryY3);
            for (int i = dots + 2; i > 0; i--) {
                move(x[i-1],y[i-1],i);
            }
            horizontal(left, right);
            vertical(up, down);
            n++;
            Timer(n,minutes,seconds);
        }
        repaint();
    }

    // Клавиши управленния
    public int MainWindow1(int x){
        x=x+1;
        x=x+2;
        x=x+3;
        x=x+4;
        x=x+5;
        x=x+6;
        x=x+7;
        x=x+8;
        x=x+9;
        x=x+10;
        x=x+11;
        x=x+12;
        x=x+13;
        x=x+14;
        x=x+15;
        x=x+16;
        x=x+17;
        x=x+18;
        x=x+19;
        x=x+20;
        x=x+21;
        x=x+22;
        x=x+23;
        x=x+24;
        x=x+25;
        x=x+26;
        x=x+27;
        x=x+28;
        x=x+29;
        x=x+30;
        x=x+31;
        x=x+32;
        x=x+33;
        x=x+34;
        x=x+35;
        y1=x;
        return y1;
    }
}
