package new2;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;
import java.util.Random;

public class MineClearance {
    // 变量
    int matrix = 9;
    int mineNum = 10; // 雷的数量
    int[][] counts = new int[matrix][matrix]; // 雷数
    Color clickedColor = Color.LIGHT_GRAY;
    Color bombColor = Color.red;
    Color mineColor = Color.white;

    // 控件
    private JFrame jf = new JFrame("扫雷1.0");    //创建一个JFrame对象，存放窗体
    private JPanel jp = new JPanel(); // 创建JPanel对象，中间容器，先存放其中，再存放到窗体中
    private TestTimer testTimer = new TestTimer();
    private Timer tme = new Timer(1000, testTimer);
    private int tmeCount = 0;
    private JLabel gameTime = new JLabel("00"); // 游戏时间
    private JButton[][] buttons = new JButton[matrix][matrix]; // 页面上的按钮组

    public MineClearance() {
        // 页面布局
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new BorderLayout()); //设置边框布局
        jp.setLayout(new GridLayout(matrix, matrix, 0, 0)); // 采用网格布局
        jf.setBounds(300, 100, 600, 650);
        //----头部菜单-----
        addTopMenu();
        //----绘制雷区-----
        init();
    }

    private void addTopMenu() {
        JLabel levelLabel = new JLabel("游戏等级"); // 游戏等级
        gameTime.setBackground(Color.yellow);
        gameTime.setOpaque(true);          //正常显示
        JButton resetButton = new JButton("新对局"); // 重置按钮
        resetButton.addActionListener(new ResetGame());
        String[] listData = new String[]{"9x9,10", "16x16,30", "30x30,99"};
        JComboBox<String> gameLevel = new JComboBox<String>(listData);    //创建JComboBox
        gameLevel.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // 下拉框选项
                    if (e.getItem() == "9x9,10") {
                        matrix = 9;
                        mineNum = 10;
                    } else if (e.getItem() == "16x16,30") {
                        matrix = 16;
                        mineNum = 30;
                    } else if (e.getItem() == "30x30,99") {
                        matrix = 30;
                        mineNum = 99;
                    }
                }
            }
        });
        JPanel topMenu = new JPanel();
        topMenu.add(levelLabel);
        topMenu.add(gameLevel);
        topMenu.add(gameTime);
        topMenu.add(resetButton);
        jf.add(topMenu, BorderLayout.NORTH);
    }

    private void addButtons() {
        // 先清空雷区
        jp.removeAll();
        jp.setLayout(new GridLayout(matrix, matrix, 0, 0)); // 采用网格布局
        buttons = new JButton[matrix][matrix];
        // 添加按钮组
        for (int i = 0; i < matrix; i++) {
            for (int j = 0; j < matrix; j++) {
                JButton button = new JButton();
                button.setBackground(mineColor);
                button.setOpaque(true); //设置颜色的必选项
                button.setMargin(new Insets(0, 0, 0, 0)); //设置按钮边距
                button.addMouseListener(new MouseListener() {
                    // 监听拖动鼠标和鼠标的移动动作
                    public void mouseReleased(MouseEvent e) {
                        //System.out.println("mouseReleased---鼠标放开事件");
                    }

                    public void mousePressed(MouseEvent e) {
                        //System.out.println("mousePressed---鼠标按下事件");
                    }

                    public void mouseExited(MouseEvent e) {
                        //System.out.println("mouseExited---鼠标移出按钮区域");
                    }

                    public void mouseEntered(MouseEvent e) {
                        //System.out.println("mouseEntered---鼠标移入按钮区域");
                    }

                    public void mouseClicked(MouseEvent e) {
                        if (e.getButton() == e.BUTTON1 && ((JButton) e.getSource()).isEnabled() == true && ((JButton) e.getSource()).getText() != "?") {
                            //System.out.println("鼠标左点击事件");
                            // 游戏主体按钮的事件触发
                            tme.start();
                            boolean flag = true; // 标记是否需要判断游戏成功
                            JButton button = (JButton) e.getSource();
                            for (int i = 0; i < matrix; i++) {
                                for (int j = 0; j < matrix; j++) {
                                    if (buttons[i][j] == button) {
                                        if (counts[i][j] == 99) {
                                            // 踩雷了，游戏结束
                                            gameOver();
                                            flag = false;
                                            break;
                                        }
                                        if (counts[i][j] == 0) {
                                            isZero(i, j);
                                            break;
                                        }
                                        // 显示具体的数字
                                        buttons[i][j].setBackground(clickedColor);
                                        buttons[i][j].setText(String.valueOf(counts[i][j]));
                                    }
                                }
                            }
                            // 检查是否找出了所有的非雷区域
                            if (flag) {
                                isEnd();
                            }
                        }
                        if (e.getButton() == e.BUTTON3) {
                            //System.out.println("鼠标右点击事件");
                            if (((JButton) e.getSource()).getText() == "" && ((JButton) e.getSource()).getBackground() == mineColor) {
                                ((JButton) e.getSource()).setText("?");
                            } else {
                                if (((JButton) e.getSource()).getText() == "?") {
                                    ((JButton) e.getSource()).setText("");
                                }
                            }
                        }
                        if (e.getButton() == e.BUTTON2) {
                            // 预加载周围八个的内容
                            JButton button = (JButton) e.getSource();
                            for (int i = 0; i < matrix; i++) {
                                for (int j = 0; j < matrix; j++) {
                                    if (buttons[i][j] == button) {
                                        // 找到当前被点击的按钮
                                        if (buttons[i][j].getBackground() == clickedColor) {
                                            // 只能是已经显示了的按钮
                                            // 查看周围八个格子的内容，如果有“？”，就显示剩余格子的内容
                                            int count = 0; // 周围“？”的数量,判断是否需要显示周围内容
                                            if (i > 0 && j > 0 && buttons[i - 1][j - 1].getText() == "?") {
                                                count++;
                                            }
                                            if (i > 0 && buttons[i - 1][j].getText() == "?") {
                                                count++;
                                            }
                                            if (i > 0 && j < matrix - 1 && buttons[i - 1][j + 1].getText() == "?") {
                                                count++;
                                            }

                                            if (j > 0 && buttons[i][j - 1].getText() == "?") {
                                                count++;
                                            }
                                            if (j < matrix - 1 && buttons[i][j + 1].getText() == "?") {
                                                count++;
                                            }
                                            if (i < matrix - 1 && j > 0 && buttons[i + 1][j - 1].getText() == "?") {
                                                count++;
                                            }

                                            if (i < matrix - 1 && buttons[i + 1][j].getText() == "?") {
                                                count++;
                                            }
                                            if (j < matrix - 1 && i < matrix - 1 && buttons[i + 1][j + 1].getText() == "?") {
                                                count++;
                                            }

                                            //
                                            // 当周围标记了雷的数量与当前按钮上的值一样，就展开周围内容
                                            if (count == Integer.valueOf(buttons[i][j].getText())) {
                                                //    			(i-1,j-1)  (i-1,j)  (i-1,j+1)
                                                //    			(i,j-1)    (i,j)    (i, j+1)
                                                //    			(i+1,j-1)  (i+1,j)	(i+1,j+1)

                                                if (i > 0 && j > 0 && buttons[i - 1][j - 1].getBackground() == mineColor && buttons[i - 1][j - 1].getText() != "?") {
                                                    if (counts[i - 1][j - 1] == 99) {
                                                        /*如果是雷，游戏结束*/
                                                        gameOver();
                                                    } else {/*递归展开内容*/
                                                        isZero(i - 1, j - 1);
                                                    }
                                                }
                                                if (i > 0 && buttons[i - 1][j].getBackground() == mineColor && buttons[i - 1][j].getText() != "?") {
                                                    if (counts[i - 1][j] == 99) {
                                                        /*如果是雷，游戏结束*/
                                                        gameOver();
                                                    } else {/*递归展开内容*/
                                                        isZero(i - 1, j);
                                                    }
                                                }
                                                if (i > 0 && j < matrix - 1 && buttons[i - 1][j + 1].getBackground() == mineColor && buttons[i - 1][j + 1].getText() != "?") {
                                                    if (counts[i - 1][j + 1] == 99) {
                                                        /*如果是雷，游戏结束*/
                                                        gameOver();
                                                    } else {/*递归展开内容*/
                                                        isZero(i - 1, j + 1);
                                                    }
                                                }
                                                if (j > 0 && buttons[i][j - 1].getBackground() == mineColor && buttons[i][j - 1].getText() != "?") {
                                                    if (counts[i][j - 1] == 99) {

                                                        gameOver();
                                                    } else {/*递归展开内容*/
                                                        isZero(i, j - 1);
                                                    }
                                                }
                                                if (j < matrix - 1 && buttons[i][j + 1].getBackground() == mineColor && buttons[i][j + 1].getText() != "?") {
                                                    if (counts[i][j + 1] == 99) {


                                                        gameOver();
                                                    } else {/*递归展开内容*/
                                                        isZero(i, j + 1);
                                                    }
                                                }
                                                if (i < matrix - 1 && j > 0 && buttons[i + 1][j - 1].getBackground() == mineColor && buttons[i + 1][j - 1].getText() != "?") {
                                                    if (counts[i + 1][j - 1] == 99) {


                                                        gameOver();
                                                    } else {/*递归展开内容*/
                                                        isZero(i + 1, j - 1);
                                                    }
                                                }
                                                if (i < matrix - 1 && buttons[i + 1][j].getBackground() == mineColor && buttons[i + 1][j].getText() != "?") {
                                                    if (counts[i + 1][j] == 99) {

                                                        gameOver();
                                                    } else {/*递归展开内容*/
                                                        isZero(i + 1, j);
                                                    }
                                                }
                                                if (j < matrix - 1 && i < matrix - 1 && buttons[i + 1][j + 1].getBackground() == mineColor && buttons[i + 1][j + 1].getText() != "?") {
                                                    if (counts[i + 1][j + 1] == 99) {/*如果是雷，游戏结束*/
                                                        gameOver();
                                                    } else {/*递归展开内容*/
                                                        isZero(i + 1, j + 1);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                });
                buttons[i][j] = button;
                jp.add(button);
            }
        }
        jf.add(jp, BorderLayout.CENTER); // 将JPanel中间容器添加到JFrame窗体中
    }

    private void burieMine() {
        // 先清空所有的雷
        counts = new int[matrix][matrix];
        // 埋雷
        for (int i = 0; i < mineNum; i++) {
            Random r = new Random(); // 随机获取一个位置
            int x = r.nextInt(matrix);
            int y = r.nextInt(matrix);
            if (counts[x][y] == 99) {
                // 如果已经设置为雷，就跳过
                i--;
                continue;
            }
            counts[x][y] = 99;
        }
    }

    private void mineCount() {
        // 统计雷的数量，显示数字
        int num; // 用来统计目标周围雷的数量
        for (int i = 0; i < matrix; i++) {
            for (int j = 0; j < matrix; j++) {
                if (counts[i][j] == 99) continue; // 如果是雷就跳过
                num = 0;
//    			(i-1,j-1)  (i-1,j)  (i-1,j+1)
//    			(i,j-1)    (i,j)    (i, j+1)
//    			(i+1,j-1)  (i+1,j)	(i+1,j+1)
                // 防止数组下标越界
                if (i > 0 && j > 0 && counts[i - 1][j - 1] == 99) {
                    num++;
                }
                ;
                if (i > 0 && counts[i - 1][j] == 99) {
                    num++;
                }
                if (i > 0 && j < matrix - 1 && counts[i - 1][j + 1] == 99) {
                    num++;
                }
                ;
                if (j > 0 && counts[i][j - 1] == 99) {
                    num++;
                }
                if (j < matrix - 1 && counts[i][j + 1] == 99) {
                    num++;
                }
                if (i < matrix - 1 && j > 0 && counts[i + 1][j - 1] == 99) {
                    num++;
                }
                if (i < matrix - 1 && counts[i + 1][j] == 99) {
                    num++;
                }
                if (j < matrix - 1 && i < matrix - 1 && counts[i + 1][j + 1] == 99) {
                    num++;
                }
                counts[i][j] = num; // 赋值到目标位置
            }
        }
    }

    private void gameOver() {
        tme.stop();
        for (int i = 0; i < matrix; i++) {
            for (int j = 0; j < matrix; j++) {
                if (counts[i][j] == 99) { // 显示雷
                    buttons[i][j].setText("雷");
                    buttons[i][j].setBackground(bombColor);
                } else {
                    if (counts[i][j] == 0) { // 如果不是就显示为空
                        buttons[i][j].setText("");
                    } else {
                        buttons[i][j].setText(String.valueOf(counts[i][j]));
                    }
                    buttons[i][j].setBackground(clickedColor);
                }
                buttons[i][j].setEnabled(false);
            }
        }
        String msg = "您坚持了" + String.valueOf(tmeCount) + "秒";
        JOptionPane.showMessageDialog(jf, msg, "游戏结束", JOptionPane.ERROR_MESSAGE);
    }

    private void init() {
        // 重绘窗体
        jf.repaint();
        // 绘制雷区
        addButtons();
        burieMine();
        mineCount();
        jf.setVisible(true); // 设置窗体可见，不写看不见
        tmeCount = 0;
        gameTime.setText("00");
        tme.stop();
    }

    private void isZero(int i, int j) {
        // 递归实现寻找周围的0，
        if (buttons[i][j].getBackground() == clickedColor) return;
        if (counts[i][j] == 0) {
            buttons[i][j].setText("");
            buttons[i][j].setBackground(clickedColor);
            isEnd();
        } else {
            if (counts[i][j] == 99) {
                return;
            } else {
                buttons[i][j].setText(String.valueOf(counts[i][j]));
                buttons[i][j].setBackground(clickedColor);
                isEnd();
                return;
            }
        }
        // 查看目标周围八格
        if (i > 0 && j > 0) {
            isZero(i - 1, j - 1);
        }

        if (i > 0) {
            isZero(i - 1, j);
        }
        if (i > 0 && j < matrix - 1) {
            isZero(i - 1, j + 1);
        }
        if (j > 0) {
            isZero(i, j - 1);
        }
        if (j < matrix - 1) {
            isZero(i, j + 1);
        }
        if (i < matrix - 1 && j > 0) {
            isZero(i + 1, j - 1);
        }
        if (i < matrix - 1) {
            isZero(i + 1, j);
        }
        if (j < matrix - 1 && i < matrix - 1) {
            isZero(i + 1, j + 1);
        }
    }

    private void isEnd() {
        // 游戏完成，找出了所有的非雷单位
        int count = 0;// 计数器，记录共有多少个被选出的单位
        for (int i = 0; i < matrix; i++) {
            for (int j = 0; j < matrix; j++) {
                if (buttons[i][j].getBackground() == clickedColor) {
                    count++;
                }
            }
        }
        if (count == matrix * matrix - mineNum) {
            // 成功找出所有的非雷
            tme.stop();
            for (int i = 0; i < matrix; i++) {
                for (int j = 0; j < matrix; j++) {
                    buttons[i][j].setEnabled(false);
                }
            }
            String msg = "共用时" + String.valueOf(tmeCount) + "秒";
            JOptionPane.showMessageDialog(jf, msg, "你赢了", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new MineClearance();
    }

    class ResetGame implements ActionListener {
        // 重置游戏
        public void actionPerformed(ActionEvent event) {
            init();
        }
    }

    class TestTimer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tmeCount++;
            String s;
            if (tmeCount < 10) {
                s = "0" + String.valueOf(tmeCount);
            } else {
                s = String.valueOf(tmeCount);
            }
            gameTime.setText(s);
        }
    }
}



