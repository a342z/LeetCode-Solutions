class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++)
        {   
            HashSet<Character> set=new HashSet();  
            int dots = 0;
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='.') dots++;
                else set.add(board[i][j]);
            }
            if (set.size() < (9-dots)) return false;
        }
        for(int i=0;i<board.length;i++)
        {   
            HashSet<Character> set=new HashSet();  
            int dots = 0;
            for(int j=0;j<board[0].length;j++)
            {
                if(board[j][i]=='.') dots++;
                else set.add(board[j][i]);
            }
            if (set.size() < (9-dots)) return false;
        }
        for(int i=0;i<board.length;i++)
        {   
            HashSet<Character> set=new HashSet();  
            int dots = 0;
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    if(board[j+(i/3)*3][k+(i%3)*3]=='.') dots++;
                    else set.add(board[j+(i/3)*3][k+(i%3)*3]);
                }
            }
            if (set.size() < (9-dots)) return false;
        }

        return true;
    }
}