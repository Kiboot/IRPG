package mcm.edu.ph.inheritancerpg;

public class Monsters extends Characters {


    public Monsters(int id, double baseHp, double baseMp, double basePtk, double baseMtk, double basepDef, double basemDef) {

        super(id, baseHp, baseMp, basePtk,baseMtk,basepDef,basemDef);

    }


    @Override
    public double getHpoints() {
        return super.getHpoints();
    }

    @Override
    public double getMatk() {
        return super.getMatk();
    }

    @Override
    public double getMdef() {
        return super.getMdef();
    }

    @Override
    public double getMpoints() {
        return super.getMpoints();
    }

    @Override
    public double getPatk() {
        return super.getPatk();
    }

    @Override
    public double getPdef() {
        return super.getPdef();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setPdef(double pdef) {
        super.setPdef(pdef);
    }

    @Override
    public void setHpoints(double hpoints) {
        super.setHpoints(hpoints);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setMatk(double matk) {
        super.setMatk(matk);
    }

    @Override
    public void setMdef(double mdef) {
        super.setMdef(mdef);
    }

    @Override
    public void setMpoints(double mpoints) {
        super.setMpoints(mpoints);
    }

    @Override
    public void setPatk(double patk) {
        super.setPatk(patk);
    }



}

