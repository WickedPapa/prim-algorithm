package com.exercise.prim_algorithm.service;

import com.exercise.prim_algorithm.model.Edge;
import com.exercise.prim_algorithm.model.Graph;
import com.exercise.prim_algorithm.model.Vertex;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.Comparator;

@Service
public class PrimServiceImpl implements PrimService {
    @Override
    public Graph calculateMST(@NonNull Graph graph, @NonNull Vertex first) {
        Graph minimumSpanningTree = new Graph();
        minimumSpanningTree.addVertex(first);
        while (minimumSpanningTree.getAdjacencyList().size() < graph.getAdjacencyList().size()) {
            Edge edgeToAdd = minimumSpanningTree.getAdjacencyList().keySet().stream()
                    .flatMap(v -> graph.getEdgeForVertex(v).stream())
                    .filter(edge -> !minimumSpanningTree.getAdjacencyList().containsKey(edge.getTo()))
                    .min(Comparator.comparingInt(Edge::getWeight))
                    .orElseThrow(() -> new IllegalArgumentException("Graph is not connected"));
            minimumSpanningTree.addEdge(edgeToAdd.getFrom(), edgeToAdd.getTo(), edgeToAdd.getWeight());
        }
        return minimumSpanningTree;
    }

    @Override
    public String implementationName() {
        return "Simple Implementation";
    }

}
