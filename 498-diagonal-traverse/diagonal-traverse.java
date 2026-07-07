class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                int key = i + j;
                int val = mat[i][j];

                List<Integer> list = map.getOrDefault(key, new ArrayList<>());
                list.add(val);

                map.put(key, list);
            }    
        }

        int[] res = new int[row*col];
        int k = 0;

        int totalKeys = row + col - 1;
        for(int key = 0; key < totalKeys ; key++){
            List<Integer> list = map.get(key);
            int listSize = list.size();
            if(key % 2 == 0){
                for(int j = listSize - 1; j >= 0; j--){
                    res[k++] = list.get(j);
                }
            } else{
                for(int j = 0; j < listSize; j++){
                    res[k++] = list.get(j);
                }
            }
        }
        return res;
    }
}