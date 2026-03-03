package KontestTink;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] graph = new int[m][2];

        Map<Integer, Integer> vertexToRibs = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            vertexToRibs.put(u, vertexToRibs.getOrDefault(u, 0) + 1);
            vertexToRibs.put(v, vertexToRibs.getOrDefault(v, 0) + 1);

            graph[i][0] = u;
            graph[i][1] = v;
        }

        boolean isValid = true;
        int problemRib = 0;
        for (int i = 1; i <= n; i++) {
            int degree = vertexToRibs.getOrDefault(i, 0);
            if (degree % 2 != 0) {
                problemRib = i;
                isValid = false;
                break;
            }
        }

        if (isValid) {
            for (int i = 0; i < m; i++) {
                System.out.println(graph[i][0] + " " + graph[i][1]);
            }
        } else {
            for (int i = 0; i < m; i++) {
                if (graph[i][0] == problemRib || graph[i][1] == problemRib) {
                    int temp = graph[i][0];
                    graph[i][0] = graph[i][1];
                    graph[i][1] = temp;
                    isValid = true;
                    break;
                }
            }
            if (isValid) {
                for (int i = 0; i < m; i++) {
                    System.out.println(graph[i][0] + " " + graph[i][1]);
                }
            } else {
                System.out.println(-1);
            }
        }

    }
}
