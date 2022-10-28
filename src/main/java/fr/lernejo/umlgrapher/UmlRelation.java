package fr.lernejo.umlgrapher;


import java.util.List;
import java.util.Set;



public class UmlRelation {

    private final Set<UmlType> listClass;

    public UmlRelation(Set<UmlType> pListClass){
        this.listClass = pListClass;
    }

    public Set<Links> relation(Set<Links>links){

        String link = "";

        for (UmlType umlType : listClass){
            Class relationClass[] = umlType.getaClass().getInterfaces();

            for (Class classe : relationClass){
                if (umlType.getaClass().getSuperclass() == null){
                    link =  classe.getSimpleName() + "<|-- " + umlType.getaClass().getSimpleName() + " : extends" + "\n";

                }
                else{
                    link = classe.getSimpleName() + "<|-- " + umlType.getaClass().getSimpleName() + " : implements" + "\n";

                }
                links.add(new Links(classe, umlType.getaClass(),link));
            }
        }
        return links;
    }

    public String relationCollection(Set<Links> plink, Set<UmlType> pType){
        String vCollection="";
        plink = new UmlRelation(pType).relation(plink);
        for (Links link: plink){
            vCollection = vCollection + link.getaLink();
        }
        return vCollection;
    }
}
