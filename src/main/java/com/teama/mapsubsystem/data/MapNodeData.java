package com.teama.mapsubsystem.data;

import com.teama.mapdrawingsubsystem.MapDisplay;

import java.util.ArrayList;

public class MapNodeData implements MapNode {
    private Location coordinate;
    private String id, shortDescription, longDescription, teamAssignment;
    private NodeType nodeType;
    private ArrayList<MapEdge> edges;

    public MapNodeData(String id, Location coordinate, NodeType nodeType, String longDescription,
                   String shortDescription, String teamAssignment) {
        this(id, coordinate, nodeType, longDescription, shortDescription, teamAssignment, new ArrayList<>());
    }

    public MapNodeData(String id, Location coordinate, NodeType nodeType, String longDescription,
                   String shortDescription, String teamAssignment, ArrayList<MapEdge> edges) {
        this.coordinate = coordinate;
        this.id = id;
        this.nodeType = nodeType;
        this.edges = edges;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.teamAssignment = teamAssignment;
    }
    public void setID(String id) {
        this.id = id;
    }
    public void setType(NodeType n) {
        nodeType = n;
    }
    public Location getCoordinate() {
        return coordinate;
    }

    public String getId() {
        return id;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    public ArrayList<MapEdge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<MapEdge> edges) {
        this.edges = edges;
    }

    public void addEdge(MapEdge edge) {
        this.edges.add(edge);
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getTeamAssignment() {
        return teamAssignment;
    }

    public String toCSV() {
        return "\""+id+"\","+coordinate.getxCoord()+","+coordinate.getyCoord()+",\""+coordinate.getLevel()+"\",\""+
                coordinate.getBuilding()+"\",\""+nodeType.name()+"\",\""+longDescription+"\",\""+shortDescription+"\",\""+teamAssignment+"\"";
    }

    public String toSQLVals() {
        return "'"+id+"',"+coordinate.getxCoord()+","+coordinate.getyCoord()+",'"+coordinate.getLevel()+"','"+
                coordinate.getBuilding()+"','"+nodeType.name()+"','"+longDescription+"','"+shortDescription+"','"+teamAssignment+"'";
    }

    public String toString() {
        return getShortDescription();
    }

    @Override
    public void displayOnScreen(MapDisplay display) {
        System.out.println("NOT IMPLEMENTED");
    }
}