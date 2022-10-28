package fr.lernejo.umlgrapher;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
public class UmlGraph {

    private final Class<?>[] graph;


    private final Set<UmlType> types = new TreeSet<>(Comparator
        .<UmlType, String>comparing(t->t.getaClassName())
        .thenComparing(t->t.getaClassPackage()));


    private final Set<Links> types1 = new TreeSet<>(Comparator
        .<Links, String>comparing(t->t.getaChild())
        .thenComparing(t->t.getaParent()));


    public UmlGraph(Class<?>... class1){
        this.graph = class1;
    }

    public String as(GraphType graphType){
        List<Class> tab = null;
        for(Class classeDiagram : graph){
            if (graphType == GraphType.Mermaid){
                tab = new InternalGraphRepresentation(classeDiagram).classesRelation();
                for(Class classe : tab){
                    types.add(new UmlType(classe));
                }
            }
        }
        String mF = new MermaidFormatter(types).formatter();
        String uR = new UmlRelation(types).relationCollection(types1, types);
        return mF + uR;
    }
}
