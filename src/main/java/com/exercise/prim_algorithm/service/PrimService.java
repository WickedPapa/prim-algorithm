package com.exercise.prim_algorithm.service;

import com.exercise.prim_algorithm.model.Graph;
import com.exercise.prim_algorithm.model.Vertex;


public interface PrimService {
    Graph calculateMST(Graph graph, Vertex first);
    String implementationName();
    default Graph printInfoCalculateMST(Graph graph, Vertex first) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("WELCOME TO PRIM'S ALGORITHM IMPLEMENTATION");
        System.out.println("Using implementation: " + implementationName());
        System.out.println("You can change the implementation in configuration/BeanConfig.java");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("GRAPH:");
        System.out.println(graph);
        Graph minimumSpanningTree = calculateMST(graph, first);
        System.out.println("MINIMUM SPANNING TREE:");
        System.out.println(minimumSpanningTree);
        return minimumSpanningTree;
    }
}
