class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> (a[0]-b[0]));
        ArrayList<int[]> ans = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(end>=intervals[i][0]){
                end = Math.max(end, intervals[i][1]);
            }
            else{
                int arr[] = new int[2];
                arr[0]= start;
                arr[1]= end;
                ans.add(arr);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        int arr[] = new int[2];
        arr[0]= start;
        arr[1]=end;
        ans.add(arr);
        int ansArr[][] = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            ansArr[i] = ans.get(i);
        }
        return ansArr;
    }
}