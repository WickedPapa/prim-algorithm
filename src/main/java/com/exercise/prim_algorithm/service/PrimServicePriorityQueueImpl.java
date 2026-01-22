package com.exercise.prim_algorithm.service;

import com.exercise.prim_algorithm.model.Edge;
import com.exercise.prim_algorithm.model.Graph;
import com.exercise.prim_algorithm.model.Vertex;
import lombok.NonNull;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PrimServicePriorityQueueImpl implements PrimService {
    @Override
    public Graph calculateMST(@NonNull Graph graph, @NonNull Vertex first) {
        System.out.println("GRAPH:");
        System.out.println(graph);
        Graph minimumSpanningTree = new Graph();
        minimumSpanningTree.addVertex(first);
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(Edge::getWeight));
        pq.addAll(graph.getEdgeForVertex(first));
        while (!pq.isEmpty()) {
            Edge edge = pq.poll();
            if(!minimumSpanningTree.getAdjacencyList().containsKey(edge.getTo())) {
                minimumSpanningTree.addEdge(edge.getFrom(), edge.getTo(), edge.getWeight());
                pq.addAll(graph.getAdjacencyList().get(edge.getTo()));
            }
        }
        System.out.println("MINIMUM SPANNING TREE:");
        System.out.println(minimumSpanningTree);
        return minimumSpanningTree;
    }

    @Override
    public String implementationName() {
        return "Priority Queue";
    }
}
