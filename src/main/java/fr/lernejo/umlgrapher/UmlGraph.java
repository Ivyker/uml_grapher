package fr.lernejo.umlgrapher;


public class UmlGraph {

    private final Class<?>[] gr;

    public UmlGraph(Class<?>... class1){
        this.gr = class1;
    }

    public String as(GraphType graphType){
        
        for(Class classeDiagram : gr){
            if (graphType == GraphType.Mermaid){
                return """
                classDiagram
                class"+ classeDiagram.getSimpleName() +" {
                    <<interface>>
                }
                """;
            }

        } 
        return  "";

        
    }
    
}
