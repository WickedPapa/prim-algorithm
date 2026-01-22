package com.exercise.prim_algorithm.helper;

import com.exercise.prim_algorithm.model.Graph;
import com.exercise.prim_algorithm.model.Vertex;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class PrimHelper {

    public static Graph generateGraph() {
        Vertex a = Vertex.builder().id("A").build();
        Vertex b = Vertex.builder().id("B").build();
        Vertex c = Vertex.builder().id("C").build();
        Vertex d = Vertex.builder().id("D").build();
        Vertex e = Vertex.builder().id("E").build();
        Vertex f = Vertex.builder().id("F").build();

        Graph graph = new Graph();
        graph.addEdge(a, b, 2);
        graph.addEdge(a, c, 8);
        graph.addEdge(a, e, 8);
        graph.addEdge(b, c, 5);
        graph.addEdge(b, d, 7);
        graph.addEdge(c, e, 8);
        graph.addEdge(c, d, 9);
        graph.addEdge(d, f, 4);
        graph.addEdge(e, f, 3);

        return graph;
    }
}
