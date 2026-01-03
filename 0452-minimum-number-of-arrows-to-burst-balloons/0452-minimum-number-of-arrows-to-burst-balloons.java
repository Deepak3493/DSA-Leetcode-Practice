class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)-> Integer.compare(a[1], b[1]));
        int arrows = 1;
        int hitPoint = points[0][1];
        for(int i=1;i<points.length;i++){
            int start = points[i][0];
            if(hitPoint>=start){
                continue;
            }
            arrows++;
            hitPoint = points[i][1];
        }
        return arrows;
    }
}