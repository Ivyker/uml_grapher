package fr.lernejo.umlgrapher;

import java.lang.reflect.Modifier;
import java.util.Set;

public class MermaidFormatter {

    private final Set<UmlType> aUmlTypes;

    public MermaidFormatter(Set<UmlType> pUmlType){
        this.aUmlTypes = pUmlType;
    }


    public String formatter(){
        String format = "classDiagram\n";
        for(UmlType ptype: aUmlTypes){
            format = format + "class " + ptype.getaClassName();
            if(Modifier.isInterface(ptype.getaClass().getModifiers())){
                format = format + " {\n    <<interface>>\n}";
            }
            format = format + "\n";
        }
        return format;
    }
}
