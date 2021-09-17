package record_202109;

import java.util.ArrayList;
import java.util.List;

public class _0917_isValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        List<String> x=new ArrayList<>(81);
        List<String> y=new ArrayList<>(81);
        for(int i=0;i<9;i++){
            List<Character> matrix=new ArrayList<>(9);
            for(int m=0;m<3;m++){
                for(int n=0;n<3;n++){
                    int row=m+i/3*3;
                    int col=n+i%3*3;
                    char ch=board[row][col];
                    if(Character.isDigit(ch)){
                        if(matrix.contains(ch)||x.contains(ch+""+row)||y.contains(ch+""+col)){
                            return false;
                        }else{
                            matrix.add(board[row][col]);
                            x.add(ch+""+row);
                            y.add(ch+""+col);
                        }
                    }
                }
            }
            matrix.clear();
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));

    }
}
