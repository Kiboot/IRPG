package mcm.edu.ph.inheritancerpg;

public class Characters {


    private int id;
   private double hpoints;
   private double mpoints,Patk,Matk,Pdef,Mdef;



   public Characters (  int is, double hpoints, double mpoints, double Patk,double Matk, double Pdef,double Mdef){

       this.hpoints=hpoints;
       this.id=is;
       this.mpoints=mpoints;
       this.Patk=Patk;
       this.Matk=Matk;
       this.Pdef=Pdef;
       this.Mdef=Mdef;

   }


    public int getId() {
        return id;
    }

    public double getHpoints() {
        return hpoints;
    }

    public double getMatk() {
        return Matk;
    }

    public double getMdef() {
        return Mdef;
    }

    public double getMpoints() {
        return mpoints;
    }

    public double getPatk() {
        return Patk;
    }

    public double getPdef() {
        return Pdef;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHpoints(double hpoints) {
        this.hpoints = hpoints;
    }

    public void setMatk(double matk) {
        Matk = matk;
    }

    public void setMdef(double mdef) {
        Mdef = mdef;
    }

    public void setMpoints(double mpoints) {
        this.mpoints = mpoints;
    }

    public void setPatk(double patk) {
        Patk = patk;
    }

    public void setPdef(double pdef) {
        Pdef = pdef;
    }

    public Characters(){}

}
