package fr.lernejo.umlgrapher;

public class Links {

    private final String aChild;
    private final String aParent;
    private final String aLink;

    public Links(Class pChild, Class pParent, String pLink){
        this.aChild = pChild.getSimpleName();
        this.aParent = pParent.getSimpleName();
        this.aLink = pLink;
    }

    public String getaLink(){
        return this.aLink;
    }

    public String getaChild(){
        return this.aChild;
    }
    public String getaParent(){
        return this.aParent;
    }

}
