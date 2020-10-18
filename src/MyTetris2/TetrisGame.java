package MyTetris2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class TetrisGame extends JFrame {


    private static final long serialVersionUID = 1L;
    private GamePanel t;
    private static int flag = 0;

    /**
     * 构造方法
     */
    TetrisGame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800, 100);
        setTitle("俄罗斯方块1.0");
        setSize(600, 750);
        setResizable(true);      //不可缩放

    }

    /**
     * 添加画板
     */
    public void startGame() {
        t = new GamePanel();
        add(t);
        addKeyListener(t);
        t.timer.start();
    }

    public static void main(String[] args) {
        TetrisGame tetris = new TetrisGame();

        tetris.setVisible(true);
        flag = JOptionPane.showConfirmDialog(tetris,                //开始选择对话框
                "按【是】开始新游戏\n按【否】退出游戏", "new Game", JOptionPane.YES_NO_OPTION);
        if (flag == JOptionPane.YES_OPTION) {
            tetris.startGame();
            tetris.setVisible(true);
        } else {
            tetris.dispose();
            System.exit(0);
        }

    }


}