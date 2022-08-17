package com.graph;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Vertex {
    private String label;
    private boolean wasVisited;

    public Vertex(String label) {
        this.label = label;
        this.wasVisited = false;
    }
}
