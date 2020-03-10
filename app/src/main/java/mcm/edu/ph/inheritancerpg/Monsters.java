package mcm.edu.ph.inheritancerpg;

public class Monsters extends Characters {

    private String disc;
    public Monsters(int id, double baseHp, double baseMp, double basePtk, double baseMtk, double basepDef, double basemDef, String desc ) {

        super(id, baseHp, baseMp, basePtk,baseMtk,basepDef,basemDef);
        this.disc=desc;
    }


}
