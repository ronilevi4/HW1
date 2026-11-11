public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }
        int[] visited = new int[m.length];
        for (int k = 0; k < m.length; k++) {
            visited[k] = -1 ;
        }
        visited[i] = 0;
        int[] queue = new int[m.length];
        queue[0] = i;
        int front = 0;
        int rear = 1;
        while (front < rear) {
            int current = queue[front];
            front++;
            for (int k = 0; k < m.length; k++) {
                if (m[current][k] == 1 && visited[k] == -1){
                    visited[k] = visited[current] + 1;
                    if (k == j) {
                        return visited[k];
                    }
                    queue[rear] = k;
                    rear++;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}