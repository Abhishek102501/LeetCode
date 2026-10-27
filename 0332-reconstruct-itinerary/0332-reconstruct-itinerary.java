
class Solution {
    Map<String, PriorityQueue<String>> graph = new HashMap<>();
    List<String> itinerary = new ArrayList<>();

    public List<String> findItinerary(List<List<String>> tickets) {

        // Build the graph
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);

            graph.putIfAbsent(from, new PriorityQueue<>());
            graph.get(from).offer(to);
        }

        // Start DFS from JFK
        dfs("JFK");

        // Reverse the route
        Collections.reverse(itinerary);

        return itinerary;
    }

    private void dfs(String airport) {

        PriorityQueue<String> destinations = graph.get(airport);

        while (destinations != null && !destinations.isEmpty()) {
            String next = destinations.poll();
            dfs(next);
        }

        itinerary.add(airport);
    }
}
