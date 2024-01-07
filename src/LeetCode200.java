public class LeetCode200 {
    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        int result = numIslands(grid);
        System.out.println(result);
    }
    public static int numIslands(char[][] grid){
        int count = 0;
        for (int i=0; i< grid.length; i++){
            for (int j=0; j<grid[i].length; j++){
                if (grid[i][j]=='1'){
                    count++;
                    callBFS(grid,i,j);
                }
            }
        }
        return count;
    }
    public static void callBFS(char[][] grid, int i, int j){
        if (i<0 || i> grid.length || j<0 || j>grid[i].length || grid[i][j]=='0')
            return;
        grid[i][j]='0';
        callBFS(grid,i+1,j);
        callBFS(grid,i-1,j);
        callBFS(grid,i,j+1);
        callBFS(grid,i,j-1);
    }
}
