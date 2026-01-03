class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[1],b[1]));
        int count = 0;
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];
            if(end>currStart){
                count++;
                continue;
            }
            else{
                start = currStart;
                end = currEnd;
            }
        }
        return count;
    }
}