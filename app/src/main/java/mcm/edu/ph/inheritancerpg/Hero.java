package mcm.edu.ph.inheritancerpg;

public class Hero extends Characters {


    private int heroid;
    private String cles;
    private int level;
    private double basetre, baseagi, baseintel, basedex, exp;
    private double strGrowth, agiGrowth, intgrowth;
    private double evasion;


    public Hero(int is, double hpoints, double mpoints, double Patk, double Matk, double Pdef, double Mdef,
                String cleys, int xp, double basetre, double baseagi, double baseintel, double strGrowth, double agiGrowth, double intgrowth) {
        super(is, hpoints, mpoints, Patk, Matk, Pdef, Mdef);


        this.cles = cleys;
        this.level = xp;
        this.basetre = basetre;
        this.baseagi = baseagi;
        this.baseintel = baseintel;
        this.strGrowth = strGrowth;
        this.agiGrowth = agiGrowth;
        this.intgrowth = intgrowth;



    }

    public Hero(int is, double hpoints, double mpoints, double patk, double matk, double pdef, double mdef) {
    }

    //parent local getters and setters

    public void setLevel(int level) {
        this.level = level;
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

    @Override
    public void setPdef(double pdef) {
        super.setPdef(pdef);
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

    //local getters and setters

    public double getBaseagi() {
        return baseagi;
    }

    public double getBaseintel() {
        return baseintel;
    }

    public double getBasetre() {
        return basetre;
    }

    public double getExp() {
        return exp;
    }

    public double getLevel() {
        return level;
    }

    public int getHeroid() {
        return heroid;
    }

    public String getCles() {
        return cles;
    }

    public void setBaseagi(double baseagi) {
        this.baseagi = baseagi;
    }

    public void setBaseintel(double baseintel) {
        this.baseintel = baseintel;
    }

    public void setBasetre(double basetre) {
        this.basetre = basetre;
    }

    public void setCles(String cles) {
        this.cles = cles;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public void setHeroid(int heroid) {
        this.heroid = heroid;
    }

    public double getBasedex() {
        return basedex;
    }

    public void setAgiGrowth(double agiGrowth) {
        this.agiGrowth = agiGrowth;
    }

    public void setIntgrowth(double intgrowth) {
        this.intgrowth = intgrowth;
    }

    public void setStrGrowth(double strGrowth) {
        this.strGrowth = strGrowth;
    }

    public double getAgiGrowth() {
        return agiGrowth;
    }

    public double getIntgrowth() {
        return intgrowth;
    }

    public double getStrGrowth() {
        return strGrowth;
    }

    public void setEvasion(double evasion) {
        this.evasion = evasion;
    }

    public double getEvasion() {
        return evasion;
    }

    public void setBasedex(double basedex) {
        this.basedex = basedex;
    }
    //methods

    public double baseHPwSTR(double baseHP, double baseStr) {

        return baseHP + (20 * streitgrut());


    }

    public double baseMPwbaseIntel(double empey, double eyntel) {

        return super.getHpoints() + (12 * eyntel);


    }

    public double streitgrut() {

        return basetre + (strGrowth * level);

    }

    public double agiwitgrut() {

        return baseagi + (agiGrowth * level);

    }

    public double inteeyl() {

        return baseintel + (intgrowth * level);


    }

//functions

    public double aygi() {
        return super.getPdef() + (.1 * agiGrowth);

    }

    public double aygipayb() {

        return super.getPatk() + (.1 * agiGrowth);

    }

    public double aygipaypay() {

        return super.getPatk() + (.1 * strGrowth);


    }

    public double intelligence() {

        return super.getMdef() + (.1 * intgrowth);

    }

    public double evass() {

        return getEvasion()+getAgiGrowth()*(.0004);

    }

    public double intelliiii() {

        return getMatk()+(0.1*intgrowth);

    }

    public Hero(){}

    public void getHpoints(double v) {
    }
}
