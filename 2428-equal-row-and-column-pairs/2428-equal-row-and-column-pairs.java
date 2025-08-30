class Solution {
    public int equalPairs(int[][] grid) {
        
        int n=grid.length;
        Map<String,Integer> map = new HashMap<>();
         for(int i=0;i<n;i++)
         {
            String row=Arrays.toString(grid[i]);
            map.put(row, map.getOrDefault(row,0)+1);
         }
         int count=0;

         for(int j=0;j<n;j++)
         {
            int[] colArr = new int[n];
            for(int i=0;i<n;i++)
            {
                
                    colArr[i]=grid[i][j];
                }
                String col = Arrays.toString(colArr);
                count +=map.getOrDefault(col, 0);
            }
            return count;
         }
    }
