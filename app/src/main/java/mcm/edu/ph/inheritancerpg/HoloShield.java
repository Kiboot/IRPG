package mcm.edu.ph.inheritancerpg;

public class HoloShield extends Hero {

    public HoloShield(int is, double hpoints, double mpoints, double Patk, double Matk, double Pdef, double Mdef,
                    String cleys, int xp, double basetre, double baseagi, double baseintel, double strGrowth,
                    double agiGrowth, double intgrowth){

        super( is,  hpoints,  mpoints,  Patk,  Matk,  Pdef,  Mdef,
                cleys,  xp,  basetre,  baseagi,  baseintel, strGrowth,
                agiGrowth,  intgrowth);



    }

    @Override
    public void setPdef(double pdef) {
        super.setPdef(pdef);
    }

    @Override
    public void setPatk(double patk) {
        super.setPatk(patk);
    }

    @Override
    public void setMpoints(double mpoints) {
        super.setMpoints(mpoints);
    }

    @Override
    public void setMdef(double mdef) {
        super.setMdef(mdef);
    }

    @Override
    public void setMatk(double matk) {
        super.setMatk(matk);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setHpoints(double hpoints) {
        super.setHpoints(hpoints);
    }

    @Override
    public void setAgiGrowth(double agiGrowth) {
        super.setAgiGrowth(agiGrowth);
    }

    @Override
    public void setBaseagi(double baseagi) {
        super.setBaseagi(baseagi);
    }

    @Override
    public void setBasedex(double basedex) {
        super.setBasedex(basedex);
    }

    @Override
    public void setBaseintel(double baseintel) {
        super.setBaseintel(baseintel);
    }

    @Override
    public void setBasetre(double basetre) {
        super.setBasetre(basetre);
    }

    @Override
    public void setCles(String cles) {
        super.setCles(cles);
    }

    @Override
    public void setEvasion(double evasion) {
        super.setEvasion(evasion);
    }

    @Override
    public void setExp(double exp) {
        super.setExp(exp);
    }

    @Override
    public void setHeroid(int heroid) {
        super.setHeroid(heroid);
    }

    @Override
    public void setIntgrowth(double intgrowth) {
        super.setIntgrowth(intgrowth);
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
    }

    @Override
    public void setStrGrowth(double strGrowth) {
        super.setStrGrowth(strGrowth);
    }

    @Override
    public double getBasetre() {
        return super.getBasetre();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public double getPdef() {
        return super.getPdef() + (.1*intelligence());
    }

    @Override
    public double getPatk() {
        return super.getPatk();
    }

    @Override
    public double getMpoints() {
        return super.getMpoints();
    }

    @Override
    public double getMdef() {
        return super.getMdef();
    }

    @Override
    public double getMatk() {
        return super.getMatk();
    }

    @Override
    public double getHpoints() {
        return super.getHpoints()+5-(super.getPatk());
    }

    {





    }


}


