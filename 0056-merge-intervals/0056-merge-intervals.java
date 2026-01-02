class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        List<int[]> ansList = new ArrayList<int[]>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
              int currStart = intervals[i][0];
              int currEnd = intervals[i][1];

              if(end>=currStart){
                end = Math.max(end, currEnd);
              }
              else{
                ansList.add(new int[]{start,end});
                start = currStart;
                end = currEnd;
              }   

        }
        ansList.add(new int[]{start,end}); 
        int arr[][] = new int[ansList.size()][2];
        for(int i =0;i<ansList.size();i++){
            arr[i]= ansList.get(i);
        }
        return arr;




    }
}