package com.exercise.prim_algorithm.model;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.With;

@With
@Value
@Builder
public class Vertex {
    @NonNull String id;
//    @Nullable String description;

    @Override
    public String toString() {
        return id;
    }
}
