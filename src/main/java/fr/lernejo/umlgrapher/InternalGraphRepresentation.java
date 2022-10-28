package fr.lernejo.umlgrapher;

import java.util.ArrayList;
import java.util.List;

public class InternalGraphRepresentation {

    private final Class aClassGraph;

    public InternalGraphRepresentation(Class pClassGraph) {
        this.aClassGraph = pClassGraph;
    }
    public List<Class> containsClass(List<Class> pListClass, Class... tabClass){
        for(Class classe : tabClass){
            if(!pListClass.contains(classe)){
                pListClass.add(classe);
                pListClass = containsClass(pListClass, classe.getInterfaces());
            }
        }
        return pListClass;
    }
    public List<Class> classesRelation(){
        List<Class> pList = new ArrayList<>();
        pList = containsClass(pList, this.aClassGraph);
        return pList;
    }
}
