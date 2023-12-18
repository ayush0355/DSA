https://leetcode.com/problems/find-median-from-data-stream/description/



class MedianFinder {
    PriorityQueue<Integer> min=new PriorityQueue<>();
    PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(min.size()==max.size()){
            min.add(num);
            max.add(min.remove());
        }
        if(min.size() != max.size()){
            max.add(num);
            min.add(max.remove());
        }
    }
    
    public double findMedian() {
        if(min.size() == max.size()){
            double ans=(min.peek()+max.peek())/2.0;
            return ans;
        }
        else{
            return max.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */