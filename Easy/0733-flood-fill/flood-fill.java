class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
        return image;
        }
        dfs(image , sr , sc , image[sr][sc] , color);
        
        return image;
        
    }
    void dfs(int[][] image , int r , int c , int orginal , int color){
        if(r<0 || c<0 || r>=image.length || c >= image[0].length || image[r][c] != orginal  ){
            return;
        }
        image[r][c] = color;
        
        dfs(image , r-1 , c ,  orginal , color);
        dfs(image , r , c+1 ,  orginal , color);
        dfs(image , r+1 , c ,  orginal , color);
        dfs(image , r , c-1 ,  orginal , color);
        
    }
}