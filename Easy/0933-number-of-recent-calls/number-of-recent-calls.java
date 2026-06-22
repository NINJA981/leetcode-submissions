class RecentCounter {

    Queue<Integer> calls;

    public RecentCounter() {
        calls = new LinkedList<>();
    }

    public int ping(int t) {

        calls.offer(t);

        while (!calls.isEmpty() && calls.peek() < t - 3000) {
            calls.poll();
        }

        return calls.size();
    }
}