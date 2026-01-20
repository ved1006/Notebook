import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {
                if(grid[i][j] == 2)
                    q.add(new int[]{i,j});

                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        int[][] direction = {{-1,0},{1,0},{0,1},{0,-1}};
        int time = 0;

        while(!q.isEmpty() && fresh!=0){
            int size = q.size();

            for(int i=0;i<size;i++){
                int[] curr = q.poll();

                for(int[] nums : direction) {
                    int r = curr[0] + nums[0];
                    int c = curr[1] + nums[1];

                    if(r>=0 && c>=0 && r<grid.length && c<grid[0].length && grid[r][c] ==1){
                        grid[r][c] = 2;
                        fresh--;
                        q.add(new int[]{r,c});
                    }
                }
            }
            time++;
        }
        return fresh ==0 ? time : -1;
    }
}