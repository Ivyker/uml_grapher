package fr.lernejo.umlgrapher;

public class UmlType {

    private final Class aClass;
    private final String aClassName;
    private final String aClassPackage;

    public UmlType(Class pClass){
        this.aClass = pClass;
        this.aClassName = pClass.getSimpleName();
        this.aClassPackage = pClass.getPackageName();
    }

    public Class getaClass() {
        return this.aClass;
    }

    public String getaClassName(){
        return this.aClassName;
    }

    public String getaClassPackage(){
        return this.aClassPackage;
    }


}
