package MyTetris2;



//方块类
public class Block {

    public final int shapes[][][] = new int[][][]{
            //J
            {
                    {0,1,0,0,0,1,0,0,1,1,0,0,0,0,0,0},
                    {1,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
                    {1,1,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
                    {1,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0}
                    },

            //L
            {
                    {1,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0},
                    {1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0},
                    {1,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0},
                    {0,0,1,0,1,1,1,0,0,0,0,0,0,0,0,0}
                    },

            //S
            {
                    {0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,},
                    {1,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0,},
                    {0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,},
                    {1,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0,}
                    },

            //Z
            {
                    {1,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0},
                    {0,1,0,0,1,1,0,0,1,0,0,0,0,0,0,0},
                    {1,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0},
                    {0,1,0,0,1,1,0,0,1,0,0,0,0,0,0,0}
                    },

            //T
            {
                    {0,1,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
                    {1,0,0,0,1,1,0,0,1,0,0,0,0,0,0,0},
                    {1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0},
                    {0,1,0,0,1,1,0,0,0,1,0,0,0,0,0,0}
                    },

            //O
            {
                    {1,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0},
                    {1,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0},
                    {1,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0},
                    {1,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0}
                    },

            //I
            {
                    {0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0},
                    {0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0},
                    {0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0},
                    {0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0}
                    },

    };


    public int x;
    public int y;
    public int blockType=0;	//方块类型
    public int blockState=0;  	//方块状态
    public int initX = 4;				//初始位置的X,Y值
    public int initY = 0;

    GamePanel game;


    Block(GamePanel game){		//引用游戏画板
        this.game = game;
    }

    /**
     * 新建方块
     */
    public void newblock(){
        blockType = (int)(Math.random()*1000)%7;   //范围0-6
        blockState = (int)(Math.random()*1000)%4;  //范围0-3
        x=initX;
        y=initY;


    }

    /**
     * 把需要固定的方块固定
     * 存放在map数组中
     */
    public void add(){
        int i=0;
        for(int a=0;a<4;a++){
            for(int b=0;b<4;b++){
                if(game.map[x+1+b][y+a]==0){     // map[列][行]
                    game.map[x+1+b][y+a]=shapes[blockType][blockState][i];
                }
                i++;
            }
        }
    }

    //右移

    public void right() {
        if(!game.isCollied(x+1,y)){
            x++;
        }
        game.repaint();
    }

    //下移

    public void down() {
        if(!game.isCollied(x,y+1)){
            y++;
        }else{
            add();		//碰撞到底部后，把方块添加到画布上去
            game.deleteLine();
            newblock();
        }
        game.repaint();
    }

    //左移
    public void left() {
        if(!game.isCollied(x-1,y)){
            x--;
        }
        game.repaint();
    }

    //转换状态

    public void turnState() {

        int temp = blockState;		//首先记录本状态
        blockState = (blockState+1)%4;
        if(game.isCollied(x,y)){
            blockState = temp;
        }
        game.repaint();
    }
}
