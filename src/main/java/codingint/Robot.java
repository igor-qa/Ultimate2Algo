package codingint;

/**
 * Created by borisgurtovyy on 11/12/17.
 */
public class Robot {

    public boolean judgeCircle(String moves) {

        int x = 0;
        int y = 0;
        for(int i = 0; i< moves.length();i++){
            char ch = moves.charAt(i);
            switch (ch){
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }
        return x==0&&y==0;
    }


}
