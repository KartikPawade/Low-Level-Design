package org.lld.design_patterns.behavioural.template;

interface Builder {

    void buildFoundation();

    void buildWalls();

    void buildWindows();

    void buildRoof();
}

public class HouseBuilder implements Builder {
    @Override
    public void buildFoundation() {
        System.out.println("Building Foundation");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building Walls");
    }

    @Override
    public void buildWindows() {
        System.out.println("Building Windows");
    }

    @Override
    public void buildRoof() {
        System.out.println("Building Roof");
    }
}


interface ConstructionTemplate {
    void construct();
}

class ConstructionDirector implements ConstructionTemplate {
    Builder builder;

    public ConstructionDirector(){
        this.builder = new HouseBuilder();
    }

    @Override
    public void construct() {
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildWindows();
        builder.buildRoof();
    }
}
class Main{
    public static void main(String[] args) {
        ConstructionDirector constructionDirector = new ConstructionDirector();
        constructionDirector.construct();
    }
}


