package code2019.code19_3_1_289;

/**
 * @author zjg
 * <p> 2019/3/1 21:38 </p>
 */
public class GameofLife_289 {

    public void gameOfLife(int[][] board) {
        /**
         利用一个 two bits 的状态机来记录细胞状态, 第一位表示
         下一状态, 第二位表示当前状态:
         00: dead (next state) <- dead (current state)
         01: dead (next state) <- live (current state)
         10: live (next state) <- dead (current state)
         11: live (next state) <- live (current state)
         初始情况对应就是 00 和 01 (默认下一状态是 dead state)
         统计每个位置周围的 live 细胞数决定高位置 1 (live)还是
         0 (dead), 最后右移一位即为最终状态, 注意不需要考虑 01
         以及 00 的情况, 因为已经默认下一状态为 dead.
         **/
        if(board.length < 1) return;
        // 更新矩阵
        for(int i = 0; i < board.length; ++i) {
            for(int j = 0; j < board[0].length; ++j) {
                int lives = countLives(board, i, j);
                // live -> live
                if((board[i][j] & 1) == 1) {
                    if(lives >= 2 && lives <= 3)
                        board[i][j] = 3;
                }
                // dead -> live
                else {
                    if(lives == 3)
                        board[i][j] = 2;
                }
            }
        }
        // 重置矩阵
        for(int i = 0; i < board.length; ++i) {
            for(int j = 0; j < board[0].length; ++j)
                board[i][j] >>= 1;
        }
    }

    private int countLives(int[][] b, int i, int j) {
        int count = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        for(int[] dir : dirs) {
            int x = i + dir[0];
            int y = j + dir[1];
            if(x < 0 || x > b.length-1 || y < 0 || y > b[0].length-1)
                continue;
            count += (b[x][y] & 1);
        }
        return count;
    }



}
