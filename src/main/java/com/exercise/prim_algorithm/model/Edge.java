package com.exercise.prim_algorithm.model;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.With;

@With
@Value
@Builder
public class Edge {
    @NonNull Vertex from;
    @NonNull Vertex to;
    int weight;

    @Override
    public String toString() {
        return from + "--(" + weight + ")-->" + to;
    }
}
