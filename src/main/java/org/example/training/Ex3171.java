package org.example.training;

import java.util.*;

public class Ex3171 {

    public static void bfs(Map<Integer, List<Integer>> graph, int initial){
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(initial);
        visited.add(initial);

        while(!queue.isEmpty()){

            int curr = queue.poll();

            for(int visit : graph.get(curr)){

                if(!visited.contains(visit)){
                    queue.add(visit);
                    visited.add(visit);
                }
            }
        }


        System.out.println(visited);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, List<Integer>> grafo = new HashMap<>();

//        int n = Integer.parseInt(input.nextLine());
//        for (int i = 0; i < n; i++) {
//            int x = Integer.parseInt(input.nextLine());
//            int y = Integer.parseInt(input.nextLine());
//
//            leds.putIfAbsent(i, new ArrayList<>());
//            leds.get(i).add(x);
//            leds.get(i).add(y);
//
//        }

        grafo.put(1, List.of(6,3));
        grafo.put(2, List.of(1,2));
        grafo.put(3, List.of(2,3));
        grafo.put(4, List.of(4,5));


        bfs(grafo, 1);

    }
}
