/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs_and_dfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ashfaK
 */
public class BFS_Implementation {

    private int N;
    private LinkedList<Integer> adj[];
    private Queue<Integer> queue;

    BFS_Implementation(int v) {

        N = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {

            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }

    void addEdge(int v, int w) {

        adj[v].add(w);
    }

    void BFS(int n) {

        boolean nodes[] = new boolean[N];
        int a = 0;

        nodes[n] = true;
        queue.add(n);

        while (queue.size() != 0) {

            n = queue.poll();
            System.out.print(n + " ");

            for (int i = 0; i < adj[n].size(); i++) {

                a = adj[n].get(i);
                if (!nodes[a]) {

                    nodes[a] = true;
                    queue.add(a);
                }
            }
        }
    }

    public static void main(String args[]) {

        BFS_Implementation b = new BFS_Implementation(6);

        b.addEdge(0, 1);
        b.addEdge(0, 3);
        b.addEdge(0, 4);
        b.addEdge(4, 5);
        b.addEdge(3, 5);
        b.addEdge(1, 2);
        b.addEdge(1, 0);
        b.addEdge(2, 1);
        b.addEdge(4, 1);
        b.addEdge(3, 1);
        b.addEdge(5, 4);
        b.addEdge(5, 3);

        System.out.println("BFS output :");

        b.BFS(0);
    }

}
