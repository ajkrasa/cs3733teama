package com.teama.mapsubsystem.pathfinding.BreathFrist;

import com.teama.mapsubsystem.data.MapNode;
import com.teama.mapsubsystem.data.MapEdge;

import java.util.ArrayList;

public class KnownPoint  {


    private MapNode node;
    private int layer;

    public KnownPoint(MapNode node, int layer)
    {
        this.node=node;
        this.layer=layer;
    }

    public ArrayList<MapNode> getAdjacentNodes()
    {
        ArrayList<MapNode> result = new ArrayList<>();
        for (MapEdge edge : node.getEdges()) {
            if(edge.getStart().getId().equals((node.getId()))) result.add(edge.getEnd());
            else result.add(edge.getStart());
        }
        return result;
    }

    //getters and setters
    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public MapNode getNode() {
        return node;
    }

    public void setNode(MapNode node) {
        this.node = node;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.getNode().getId().equals(((KnownPoint) obj).getNode().getId()) );
    }
}
