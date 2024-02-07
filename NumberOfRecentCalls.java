//https://leetcode.com/problems/number-of-recent-calls/?envType=study-plan-v2&envId=leetcode-75
class RecentCounter {
    Queue<Integer> counter;
    public RecentCounter() {
        counter = new LinkedList<Integer>();
    }

    public int ping(int t) {
        counter.add(t);
        while(counter.peek()<t-3000)counter.remove();
        return counter.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
