class Run {
    public static void main(String[] args) {
        // returns the index - 1 in the fibSequence
        System.out.println(Utility.fibSequence(3));
        System.out.println(Utility.factorize(1000));

        // Each item contains the neighbnors to the vertex
        // Totally Real Adjacency Matrix ™️
        // this array is converted from https://www.youtube.com/watch?v=PMMc4VsIacU
        int[][] graph = {
            // V0
            {1, 2, 3},
            // V1
            {0, 3},
            // V2
            {0, 3},
            // V3
            {0, 1, 2, 4},
            // V4
            {3}
        };
        GraphTheory g = new GraphTheory(graph);
    }
}