public class Assignment {
    public static void main(String[] args) {
        //Create a file from the array
        int[][] edges = { { 0, 1 }, { 0, 3 }, { 0, 5 }, { 1, 0 }, { 1, 2 }, { 1, 3 }, { 2, 1 }, { 2, 3 }, { 2, 4 }, { 2, 10 }, { 3,
                0 }, { 3, 1 }, { 3, 2 }, { 3, 4 }, { 3, 5 }, { 4, 2 }, { 4, 3 }, { 4, 5 }, { 4, 7 }, { 4, 8 }, { 4, 10 }, { 5, 0 }, { 5, 3 }, {
                5, 4 }, { 5, 6 }, { 5, 7 }, { 6, 5 }, { 6, 7 }, { 7, 4 },{ 7, 5 }, { 7, 6 }, { 7, 8 }, { 8, 4 }, { 8, 7 }, { 8, 9 }, { 8, 10 },
                { 8, 11 }, { 9, 8 }, { 9, 11 },{ 10, 2 }, { 10, 4 }, { 10, 8 }, { 10, 11 }, { 11, 8 }, { 11, 9 }, { 11, 10 } };
        java.io.File file = new java.io.File("edges.txt");
        //print number of verticies in file
        System.out.println("The number of vertices in the graph is " + getNumberOfVertices(edges));
        //print number of edges in file
        System.out.println("The number of edges in the graph is " + getNumberOfEdges(edges));



    }
}