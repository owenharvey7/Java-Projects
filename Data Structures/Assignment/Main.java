public class Main {
    public static void main(String[] args) {
        String[] vertices = {"Seattle", "San Francisco", "Los Angeles",
                "Denver", "Kansas City", "Chicago", "Boston", "New York",
                "Atlanta", "Miami", "Dallas", "Houston"};

        int[][] edges = {
                {0, 1, 807}, {0, 3, 1331}, {0, 5, 2097},
                {1, 0, 807}, {1, 2, 381}, {1, 3, 1267},
                {2, 1, 381}, {2, 3, 1015}, {2, 4, 1663}, {2, 10, 1435},
                {3, 0, 1331}, {3, 1, 1267}, {3, 2, 1015}, {3, 4, 599}, {3, 5, 1003},
                {4, 2, 1663}, {4, 3, 599}, {4, 5, 533}, {4, 7, 1260},
                {4, 8, 864}, {4, 10, 496},
                {5, 0, 2097}, {5, 3, 1003}, {5, 4, 533},
                {5, 6, 983}, {5, 7, 787},
                {6, 5, 983}, {6, 7, 214},
                {7, 4, 1260}, {7, 5, 787}, {7, 6, 214}, {7, 8, 888},
                {8, 4, 864}, {8, 7, 888}, {8, 9, 661},
                {8, 10, 781}, {8, 11, 810},
                {9, 8, 661}, {9, 11, 1187},
                {10, 2, 1435}, {10, 4, 496}, {10, 8, 781}, {10, 11, 239},
                {11, 8, 810}, {11, 9, 1187}, {11, 10, 239}
        };

        //Task1: Create a graph based on the two array.
        WeightedGraph<String> graph1 = new WeightedGraph<>(vertices, edges);

        //Task2: Display the number of vertices in this graph.
        System.out.println("\nThe number of vertices in graph1 is " + graph1.getSize());

        //Task3: Display the index of Chicago.
        System.out.println("\nThe index of Chicago is " + graph1.getIndex("Chicago"));

        //Task4: Display the city with index 7.
        System.out.println("\nThe city with index 7 is " + graph1.getVertex(7));

        //Task5: Print all edges.
        System.out.println("\nAll edges in graph1:");
        graph1.printWeightedEdges();

        //Task6: Find the MST for this graph.
        System.out.println("\nThe MST for graph1:");
        WeightedGraph<String>.MST tree = graph1.getMinimumSpanningTree();
        tree.printTree();


        //Task7: Display the total weight of the MST, and print the tree.
        System.out.println("\nThe total weight of the MST: " + tree.getTotalWeight());


        //Task8: Print all paths from Chicago in the shortest path tree.
        System.out.println("\nAll paths from Chicago in the shortest path tree:");
        WeightedGraph<String>.ShortestPathTree tree1 = graph1.getShortestPath(5);
        tree1.printAllPaths();



    }
}