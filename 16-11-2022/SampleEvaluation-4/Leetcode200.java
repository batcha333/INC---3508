/*Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
*/
class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    count+=1;
                    run(grid,i,j);
                }
            }
        }
        return count;
    }
    void run(char[][] grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0'){
            return;
        }
        grid[i][j] = '0';
        run(grid,i+1,j);
        run(grid,i-1,j);
        run(grid,i,j+1);
        run(grid,i,j-1);
    }
}