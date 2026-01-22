package com.exercise.prim_algorithm.model;

import lombok.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class Graph {

    private final Map<Vertex, Set<Edge>> adjacencyList = new HashMap<>();

    public void addVertex(@NonNull Vertex vertex){
        adjacencyList.putIfAbsent(vertex, new HashSet<>());
    }

    public void addEdge(@NonNull Vertex u, @NonNull Vertex v, int weight){
        addEdge(Edge.builder().from(u).to(v).weight(weight).build());
        addEdge(Edge.builder().from(v).to(u).weight(weight).build());
    }

    private void addEdge(Edge edge){
        adjacencyList.computeIfAbsent(edge.getFrom(), k -> new HashSet<>()).add(edge);
    }

    public Set<Edge> getEdgeForVertex(Vertex vertex){
        return adjacencyList.getOrDefault(vertex, Set.of());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Graph {\n");
        adjacencyList.forEach((vertex, edges) -> {
            sb.append("  ")
                    .append(vertex)
                    .append(" -> ");
            sb.append(
                    edges.stream()
                            .map(Edge::toString)
                            .collect(Collectors.joining(", "))
            );
            sb.append("\n");
        });
        sb.append("}");
        return sb.toString();
    }

}
