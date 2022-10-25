package fr.lernejo.umlgrapher;


public class UmlGraph {

    public UmlGraph(Class<?>... class1){

    }

    public String as(GraphType graphType){
        if (graphType == GraphType.Mermaid){
            return """
            classDiagram
            class Machin {
                <<interface>>
            }
            """;
        }
        return  "";
    }
    
}
