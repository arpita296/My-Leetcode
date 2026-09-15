class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list=new ArrayList<>();
        list.add(intervals[0]);
        //[1,3]-list
        for(int i=1;i<intervals.length;i++){
            int[] last=list.get(list.size()-1);//[1-3]
            int[] interval=intervals[i];//[2-6]
            if(interval[0]<=last[1]){
                last[0]=Math.min(interval[0],last[0]);
                last[1]=Math.max(interval[1],last[1]);

            }
            else{
                list.add(intervals[i]);
            }
        }
        int[][] result=new int[list.size()][2];
        for(int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }
        return result;

    }
}