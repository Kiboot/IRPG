package mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class HeroDisplay extends AppCompatActivity {

    TextView level;
    TextView cleys;
    TextView mainclass;
    TextView gerome;
    TextView manap;
    TextView pat;
    TextView mat;
    TextView pdef;
    TextView mdef;
    TextView bstr;
    TextView bagie;
    TextView baseintel;
    TextView strgr;
    TextView basedexx;
    Button pabalik;
    ImageView chardis;


    double health;
    double meynap;
    double pisatk;
    double magicalattack;
    double physicaldefense;
    double magicaldefense;
    double basestrength;
    double baseagility;
    double baseintelligence;
    double baseedex;
    double strgrowth;
    double agilitygrowth;
    double intelligencegrowth;

    double levelll;
    double etspoints;
    DecimalFormat form = new DecimalFormat("0.00");

    double lebelnasad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_display);
        int pangkuha = getIntent().getIntExtra("indic", 1);

        chardis = findViewById(R.id.chardisplay);


        if (pangkuha == 1) {

            Bazooka crossbow = new Bazooka(01, 300, 10, 200, 0, 30, 20, "Sniper", 1, 50, 100, 0, 55, 1, 1);
            crossbow.getHpoints();
            crossbow.getMpoints();
            crossbow.getPatk();
            crossbow.getPdef();
            crossbow.getMdef();
            crossbow.getClass();
            crossbow.getExp();
            crossbow.getBasetre();
            crossbow.getBaseagi();
            crossbow.getBaseintel();
            crossbow.getStrGrowth();
            crossbow.getAgiGrowth();
            crossbow.getIntgrowth();
            crossbow.getBasedex();

            //Getters
            String maincles = getIntent().getStringExtra("kles");
            String claas = getIntent().getStringExtra("mainrole");
            levelll = getIntent().getIntExtra("levelin", 0);
            health = crossbow.getHpoints();
            meynap = crossbow.getMpoints();
            pisatk = crossbow.getPatk();
            magicalattack = crossbow.getMatk();
            physicaldefense = crossbow.getPdef();
            magicaldefense = crossbow.getMdef();
            basestrength = crossbow.getBasetre();
            baseagility = crossbow.getBaseagi();
            baseintelligence = crossbow.getBaseintel();
            baseedex = crossbow.getBasedex();

            //computations
            double chealth = health * levelll;
            double mpoints = meynap * levelll;
            double physattack = pisatk * levelll;
            double magicalatt = magicalattack * levelll;
            double physicdef = physicaldefense * levelll;
            double magicdefense = magicaldefense * levelll;
            double bstre = basestrength * levelll;
            double bagi = baseagility * levelll;
            double bintel = baseintelligence * levelll;
            double bdex = baseedex * levelll;


            //FindViews
            cleys = findViewById(R.id.calss);
            level = findViewById(R.id.level);
            mainclass = findViewById(R.id.mainclass);
            gerome = findViewById(R.id.healthpoints);
            manap = findViewById(R.id.manapoints);
            pat = findViewById(R.id.physicalattack);
            mat = findViewById(R.id.magicattack);
            pdef = findViewById(R.id.physicaldefense);
            mdef = findViewById(R.id.magicdef);
            bstr = findViewById(R.id.bstre);
            bagie = findViewById(R.id.agility);
            baseintel = findViewById(R.id.intelligence);
            strgr = findViewById(R.id.bstre);


            //Setters
            cleys.setText("Stell");
            level.setText("Sniper | " + "Lvl: " + (levelll));
            mainclass.setText("''Crossbow''");
            gerome.setText("HP: " + (Math.round(chealth)));
            manap.setText("MP " + (Math.round(mpoints)));
            pat.setText("P.Atk: " + Math.round(physattack));
            mat.setText("M.Atk: " + Math.round(magicalatt));
            pdef.setText("P.Def: " + Math.round(physicdef));
            mdef.setText(("M.Def: " + Math.round(magicdefense)));
            bstr.setText("Str: " + Math.round(bstre));
            bagie.setText("Agi: " + Math.round(bagi));
            baseintel.setText("Int: " + Math.round(bintel));
            chardis.setImageResource(R.drawable.sniper2);
            ;


        } else if (pangkuha == 2) {

            DecimalFormat form1 = new DecimalFormat("0.00");
            TextView livil;
            TextView clesz;
            TextView mincles;
            TextView hilth;
            TextView meyna;
            TextView physta;
            TextView magat;
            TextView pisikaldip;
            TextView madikaldip;
            TextView bistri;
            TextView bisag;
            TextView biszte;
            TextView strinth;
            TextView bizdix;


            hologrammer bazik = new hologrammer(01, 300, 10, 450, 0, 30, 20, "Sniper", 1, 50, 70, 0, 55, 1, 1);
            bazik.getHpoints();
            bazik.getMpoints();
            bazik.getPatk();
            bazik.getPdef();
            bazik.getMdef();
            bazik.getClass();
            bazik.getExp();
            bazik.getBasetre();
            bazik.getBaseagi();
            bazik.getBaseintel();
            bazik.getStrGrowth();
            bazik.getAgiGrowth();
            bazik.getIntgrowth();
            bazik.getBasedex();

            //Getters
            String cleszz = getIntent().getStringExtra("bsubclass");
            String mainxless = getIntent().getStringExtra("bzcls");
            lebelnasad = getIntent().getIntExtra("levelin", 0);
            etspoints = bazik.getHpoints();
            meynap = bazik.getMpoints();
            pisatk = bazik.getPatk();
            magicalattack = bazik.getMatk();
            physicaldefense = bazik.getPdef();
            magicaldefense = bazik.getMdef();
            basestrength = bazik.getBasetre();
            baseagility = bazik.getBaseagi();
            baseintelligence = bazik.getBaseintel();
            baseedex = bazik.getBasedex();

            //computations
            double chealth = etspoints * lebelnasad;
            double mpoints = meynap * lebelnasad;
            double physattack = pisatk * lebelnasad;
            double magicalatt = magicalattack * lebelnasad;
            double physicdef = physicaldefense * lebelnasad;
            double emdep = magicaldefense * lebelnasad;
            double bstre = basestrength * lebelnasad;
            double bagi = baseagility * lebelnasad;
            double bintel = baseintelligence * lebelnasad;


            //FindViews
            cleys = findViewById(R.id.calss);
            livil = findViewById(R.id.level);
            mainclass = findViewById(R.id.mainclass);
            gerome = findViewById(R.id.healthpoints);
            manap = findViewById(R.id.manapoints);
            pat = findViewById(R.id.physicalattack);
            mat = findViewById(R.id.magicattack);
            pdef = findViewById(R.id.physicaldefense);
            mdef = findViewById(R.id.magicdef);
            bstr = findViewById(R.id.bstre);
            bagie = findViewById(R.id.agility);
            baseintel = findViewById(R.id.intelligence);
            strgr = findViewById(R.id.bstre);


            //Setters
            cleys.setText("Stell");
            livil.setText("Sniper | Lvl: " + (lebelnasad));
            mainclass.setText("''Bazooka''");
            gerome.setText("HP: " + Math.round(chealth));
            manap.setText("MP: " + Math.round(mpoints));
            pat.setText("P.Atk:  " + Math.round(physattack));
            mat.setText("M.Atk: " + Math.round(magicalatt));
            pdef.setText("P.Def: " + Math.round(physicdef));
            mdef.setText(("M.Def: " + Math.round(emdep)));
            bstr.setText("Str: " + Math.round(bstre));
            bagie.setText("Agi: " + Math.round(bagi));
            baseintel.setText("Int: " + Math.round(bintel));
            chardis.setImageResource(R.drawable.sniper3);


        } else if (pangkuha == 3) {

            DecimalFormat form = new DecimalFormat("0.00");
            TextView livil;


            hologrammer hologram = new hologrammer(01, 700, 800, 113, 250, 500, 450, "Sniper", 1, 50, 380, 213, 1, 1, 1);
            hologram.getHpoints();
            hologram.getMpoints();
            hologram.getPatk();
            hologram.getPdef();
            hologram.getMdef();
            hologram.getClass();
            hologram.getExp();
            hologram.getBasetre();
            hologram.getBaseagi();
            hologram.getBaseintel();
            hologram.getStrGrowth();
            hologram.getAgiGrowth();
            hologram.getIntgrowth();
            hologram.getBasedex();

            //Getters
            String rarw = getIntent().getStringExtra("subclass");
            String mainrawr = getIntent().getStringExtra("minclass");
            lebelnasad = getIntent().getIntExtra("hololevel", 0);
            etspoints = hologram.getHpoints();
            meynap = hologram.getMpoints();
            pisatk = hologram.getPatk();
            magicalattack = hologram.getMatk();
            physicaldefense = hologram.getPdef();
            magicaldefense = hologram.getMdef();
            basestrength = hologram.getBasetre();
            baseagility = hologram.getBaseagi();
            baseintelligence = hologram.getBaseintel();
            baseedex = hologram.getBasedex();

            //FindViews
            cleys = findViewById(R.id.calss);
            livil = findViewById(R.id.level);
            mainclass = findViewById(R.id.mainclass);
            gerome = findViewById(R.id.healthpoints);
            manap = findViewById(R.id.manapoints);
            pat = findViewById(R.id.physicalattack);
            mat = findViewById(R.id.magicattack);
            pdef = findViewById(R.id.physicaldefense);
            mdef = findViewById(R.id.magicdef);
            bstr = findViewById(R.id.bstre);
            bagie = findViewById(R.id.agility);
            baseintel = findViewById(R.id.intelligence);
            strgr = findViewById(R.id.bstre);

            //computations
            double chealth = etspoints * (lebelnasad);
            double mpoints = meynap * lebelnasad;
            double physattack = pisatk * lebelnasad;
            double magicalatt = magicalattack * lebelnasad;
            double physicdef = physicaldefense * lebelnasad;
            double magicdefense = magicaldefense * lebelnasad;
            double bstre = basestrength * lebelnasad;
            double bagi = baseagility * lebelnasad;
            double bintel = baseintelligence * lebelnasad;


            //Setters
            cleys.setText("Calen");
            livil.setText("Medic | Lvl: " + Math.round(lebelnasad));
            mainclass.setText("''Hologram Screen''");
            gerome.setText("HP: " + Math.round(chealth));
            manap.setText("MP: " + Math.round(mpoints));
            pat.setText("P.Atk:  " + Math.round(physattack));
            mat.setText("M.Atk: " + Math.round(magicalatt));
            pdef.setText("P.Def: " + Math.round(physicdef));
            mdef.setText(("M.Def: " + Math.round(magicdefense)));
            bstr.setText("Str: " + Math.round(bstre));
            bagie.setText("Agi: " + Math.round(bagi));
            baseintel.setText("Int: " + Math.round(bintel));
            chardis.setImageResource(R.drawable.medic2);


        } else if (pangkuha == 4) {
            DecimalFormat form = new DecimalFormat("0.00");
            TextView livil;


            Drone drown = new Drone(01, 700, 800, 113, 250, 600, 710, "Sniper", 1, 50, 120, 213, 1, 1, 1);
            drown.getHpoints();
            drown.getMpoints();
            drown.getPatk();
            drown.getPdef();
            drown.getMdef();
            drown.getClass();
            drown.getExp();
            drown.getBasetre();
            drown.getBaseagi();
            drown.getBaseintel();
            drown.getStrGrowth();
            drown.getAgiGrowth();
            drown.getIntgrowth();
            drown.getBasedex();

            //Getters
            String rarw = getIntent().getStringExtra("subclass");
            String mainrawr = getIntent().getStringExtra("minclass");
            lebelnasad = getIntent().getIntExtra("hololevel", 0);
            etspoints = drown.getHpoints();
            meynap = drown.getMpoints();
            pisatk = drown.getPatk();
            magicalattack = drown.getMatk();
            physicaldefense = drown.getPdef();
            magicaldefense = drown.getMdef();
            basestrength = drown.getBasetre();
            baseagility = drown.getBaseagi();
            baseintelligence = drown.getBaseintel();
            baseedex = drown.getBasedex();

            //FindViews
            cleys = findViewById(R.id.calss);
            livil = findViewById(R.id.level);
            mainclass = findViewById(R.id.mainclass);
            gerome = findViewById(R.id.healthpoints);
            manap = findViewById(R.id.manapoints);
            pat = findViewById(R.id.physicalattack);
            mat = findViewById(R.id.magicattack);
            pdef = findViewById(R.id.physicaldefense);
            mdef = findViewById(R.id.magicdef);
            bstr = findViewById(R.id.bstre);
            bagie = findViewById(R.id.agility);
            baseintel = findViewById(R.id.intelligence);
            strgr = findViewById(R.id.bstre);

            //computations
            double chealth = etspoints * (lebelnasad);
            double mpoints = meynap * lebelnasad;
            double physattack = pisatk * lebelnasad;
            double magicalatt = magicalattack * lebelnasad;
            double physicdef = physicaldefense * lebelnasad;
            double magicdefense = magicaldefense * lebelnasad;
            double bstre = basestrength * lebelnasad;
            double bagi = baseagility * lebelnasad;
            double bintel = baseintelligence * lebelnasad;


            //Setters
            cleys.setText("Calen");
            livil.setText("Medic | Lvl: " + Math.round(lebelnasad));
            mainclass.setText("Drone Care");
            gerome.setText("HP: " + Math.round(chealth));
            manap.setText("MP: " + Math.round(mpoints));
            pat.setText("P.Atk:  " + Math.round(physattack));
            mat.setText("M.Atk: " + Math.round(magicalatt));
            pdef.setText("P.Def: " + Math.round(physicdef));
            mdef.setText(("M.Def: " + Math.round(magicdefense)));
            bstr.setText("Str: " + Math.round(bstre));
            bagie.setText("Agi: " + Math.round(bagi));
            baseintel.setText("Int: " + Math.round(bintel));
            chardis.setImageResource(R.drawable.medic3);

        } else if (pangkuha == 5) {

            DecimalFormat form = new DecimalFormat("0.00");
            TextView livil;


            UltraShield ushield = new UltraShield(01, 850, 300, 100, 95, 900, 850, "Sniper", 1, 50, 100, 78, 1, 1, 1);
            ushield.getHpoints();
            ushield.getMpoints();
            ushield.getPatk();
            ushield.getPdef();
            ushield.getMdef();
            ushield.getClass();
            ushield.getExp();
            ushield.getBasetre();
            ushield.getBaseagi();
            ushield.getBaseintel();
            ushield.getStrGrowth();
            ushield.getAgiGrowth();
            ushield.getIntgrowth();
            ushield.getBasedex();

            //Getters
            String rarw = getIntent().getStringExtra("subcd");
            String mainrawr = getIntent().getStringExtra("mweync");
            lebelnasad = getIntent().getIntExtra("ulevel", 0);
            etspoints = ushield.getHpoints();
            meynap = ushield.getMpoints();
            pisatk = ushield.getPatk();
            magicalattack = ushield.getMatk();
            physicaldefense = ushield.getPdef();
            magicaldefense = ushield.getMdef();
            basestrength = ushield.getBasetre();
            baseagility = ushield.getBaseagi();
            baseintelligence = ushield.getBaseintel();
            baseedex = ushield.getBasedex();

            //FindViews
            cleys = findViewById(R.id.calss);
            livil = findViewById(R.id.level);
            mainclass = findViewById(R.id.mainclass);
            gerome = findViewById(R.id.healthpoints);
            manap = findViewById(R.id.manapoints);
            pat = findViewById(R.id.physicalattack);
            mat = findViewById(R.id.magicattack);
            pdef = findViewById(R.id.physicaldefense);
            mdef = findViewById(R.id.magicdef);
            bstr = findViewById(R.id.bstre);
            bagie = findViewById(R.id.agility);
            baseintel = findViewById(R.id.intelligence);
            strgr = findViewById(R.id.bstre);

            //computations
            double chealth = etspoints * (lebelnasad);
            double mpoints = meynap * lebelnasad;
            double physattack = pisatk * lebelnasad;
            double magicalatt = magicalattack * lebelnasad;
            double physicdef = physicaldefense * lebelnasad;
            double magicdefense = magicaldefense * lebelnasad;
            double bstre = basestrength * lebelnasad;
            double bagi = baseagility * lebelnasad;
            double bintel = baseintelligence * lebelnasad;


            //Setters
            cleys.setText("Azel");
            livil.setText("Guard | Lvl:  " + Math.round(lebelnasad));
            mainclass.setText("''UltraShield''");
            gerome.setText("HP: " + Math.round(chealth));
            manap.setText("MP: " + Math.round(mpoints));
            pat.setText("P.Atk:  " + Math.round(physattack));
            mat.setText("M.Atk: " + Math.round(magicalatt));
            pdef.setText("P.Def: " + Math.round(physicdef));
            mdef.setText(("M.Def: " + Math.round(magicdefense)));
            bstr.setText("Str: " + Math.round(bstre));
            bagie.setText("Agi: " + Math.round(bagi));
            baseintel.setText("Int: " + Math.round(bintel));
            chardis.setImageResource(R.drawable.guard2);


        } else if (pangkuha == 6) {

            DecimalFormat form = new DecimalFormat("0.00");
            TextView livil;


            HoloShield hshield = new HoloShield(01, 700, 98, 100, 95, 900, 850, "Sniper", 1, 50, 150, 78, 1, 1, 1);
            hshield.getHpoints();
            hshield.getMpoints();
            hshield.getPatk();
            hshield.getPdef();
            hshield.getMdef();
            hshield.getClass();
            hshield.getExp();
            hshield.getBasetre();
            hshield.getBaseagi();
            hshield.getBaseintel();
            hshield.getStrGrowth();
            hshield.getAgiGrowth();
            hshield.getIntgrowth();
            hshield.getBasedex();

            //Getters
            String rarw = getIntent().getStringExtra("seyb");
            String mainrawr = getIntent().getStringExtra("mehn");
            lebelnasad = getIntent().getIntExtra("hlevel", 0);
            etspoints = hshield.getHpoints();
            meynap = hshield.getMpoints();
            pisatk = hshield.getPatk();
            magicalattack = hshield.getMatk();
            physicaldefense = hshield.getPdef();
            magicaldefense = hshield.getMdef();
            basestrength = hshield.getBasetre();
            baseagility = hshield.getBaseagi();
            baseintelligence = hshield.getBaseintel();
            baseedex = hshield.getBasedex();

            //FindViews
            cleys = findViewById(R.id.calss);
            livil = findViewById(R.id.level);
            mainclass = findViewById(R.id.mainclass);
            gerome = findViewById(R.id.healthpoints);
            manap = findViewById(R.id.manapoints);
            pat = findViewById(R.id.physicalattack);
            mat = findViewById(R.id.magicattack);
            pdef = findViewById(R.id.physicaldefense);
            mdef = findViewById(R.id.magicdef);
            bstr = findViewById(R.id.bstre);
            bagie = findViewById(R.id.agility);
            baseintel = findViewById(R.id.intelligence);
            strgr = findViewById(R.id.bstre);

            //computations
            double chealth = etspoints * (lebelnasad);
            double mpoints = meynap * lebelnasad;
            double physattack = pisatk * lebelnasad;
            double magicalatt = magicalattack * lebelnasad;
            double physicdef = physicaldefense * lebelnasad;
            double magicdefense = magicaldefense * lebelnasad;
            double bstre = basestrength * lebelnasad;
            double bagi = baseagility * lebelnasad;
            double bintel = baseintelligence * lebelnasad;


            //Setters
            cleys.setText("Azel");
            livil.setText("Guard | Lvl: " + Math.round(lebelnasad));
            mainclass.setText("''HoloShield''");
            gerome.setText("HP: " + Math.round(chealth));
            manap.setText("MP: " + Math.round(mpoints));
            pat.setText("P.Atk:  " + Math.round(physattack));
            mat.setText("M.Atk: " + Math.round(magicalatt));
            pdef.setText("P.Def: " + Math.round(physicdef));
            mdef.setText(("M.Def: " + Math.round(magicdefense)));
            bstr.setText("Str: " + Math.round(bstre));
            bagie.setText("Agi: " + Math.round(bagi));
            baseintel.setText("Int: " + Math.round(bintel));
            chardis.setImageResource(R.drawable.guard3);


        } else if (pangkuha == 7) {

            DecimalFormat form = new DecimalFormat("0.00");
            TextView livil;


            RocketBoot rbot = new RocketBoot(01, 500, 120, 630, 95, 300, 250, "Sniper", 1, 50, 150, 78, 1, 1, 1);
            rbot.getHpoints();
            rbot.getMpoints();
            rbot.getPatk();
            rbot.getPdef();
            rbot.getMdef();
            rbot.getClass();
            rbot.getExp();
            rbot.getBasetre();
            rbot.getBaseagi();
            rbot.getBaseintel();
            rbot.getStrGrowth();
            rbot.getAgiGrowth();
            rbot.getIntgrowth();
            rbot.getBasedex();

            //Getters
            String rarw = getIntent().getStringExtra("rsub");
            String mainrawr = getIntent().getStringExtra("rmehn");
            lebelnasad = getIntent().getIntExtra("rlevel", 0);
            etspoints = rbot.getHpoints();
            meynap = rbot.getMpoints();
            pisatk = rbot.getPatk();
            magicalattack = rbot.getMatk();
            physicaldefense = rbot.getPdef();
            magicaldefense = rbot.getMdef();
            basestrength = rbot.getBasetre();
            baseagility = rbot.getBaseagi();
            baseintelligence = rbot.getBaseintel();
            baseedex = rbot.getBasedex();

            //FindViews
            cleys = findViewById(R.id.calss);
            livil = findViewById(R.id.level);
            mainclass = findViewById(R.id.mainclass);
            gerome = findViewById(R.id.healthpoints);
            manap = findViewById(R.id.manapoints);
            pat = findViewById(R.id.physicalattack);
            mat = findViewById(R.id.magicattack);
            pdef = findViewById(R.id.physicaldefense);
            mdef = findViewById(R.id.magicdef);
            bstr = findViewById(R.id.bstre);
            bagie = findViewById(R.id.agility);
            baseintel = findViewById(R.id.intelligence);
            strgr = findViewById(R.id.bstre);

            //computations
            double chealth = etspoints * (lebelnasad);
            double mpoints = meynap * lebelnasad;
            double physattack = pisatk * lebelnasad;
            double magicalatt = magicalattack * lebelnasad;
            double physicdef = physicaldefense * lebelnasad;
            double magicdefense = magicaldefense * lebelnasad;
            double bstre = basestrength * lebelnasad;
            double bagi = baseagility * lebelnasad;
            double bintel = baseintelligence * lebelnasad;


            //Setters
            cleys.setText("Amias");
            livil.setText("Vanguard | Lvl: " + Math.round(lebelnasad));
            mainclass.setText("''Rocket Bot''");
            gerome.setText("HP: " + Math.round(chealth));
            manap.setText("MP: " + Math.round(mpoints));
            pat.setText("P.Atk:  " + Math.round(physattack));
            mat.setText("M.Atk: " + Math.round(magicalatt));
            pdef.setText("P.Def: " + Math.round(physicdef));
            mdef.setText(("M.Def: " + Math.round(magicdefense)));
            bstr.setText("Str: " + Math.round(bstre));
            bagie.setText("Agi: " + Math.round(bagi));
            baseintel.setText("Int: " + Math.round(bintel));
            chardis.setImageResource(R.drawable.vanguard2);

        } else if (pangkuha == 8) {
            TextView livil;
            UltraDest udes = new UltraDest(01, 500, 120, 900, 95, 300, 250, "Sniper", 1, 50, 90, 78, 1, 1, 1);
            udes.getHpoints();
            udes.getMpoints();
            udes.getPatk();
            udes.getPdef();
            udes.getMdef();
            udes.getClass();
            udes.getExp();
            udes.getBasetre();
            udes.getBaseagi();
            udes.getBaseintel();
            udes.getStrGrowth();
            udes.getAgiGrowth();
            udes.getIntgrowth();
            udes.getBasedex();

            //Getters
            String rarw = getIntent().getStringExtra("seyb");
            String mainrawr = getIntent().getStringExtra("mehn");
            lebelnasad = getIntent().getIntExtra("dlevel", 0);
            etspoints = udes.getHpoints();
            meynap = udes.getMpoints();
            pisatk = udes.getPatk();
            magicalattack = udes.getMatk();
            physicaldefense = udes.getPdef();
            magicaldefense = udes.getMdef();
            basestrength = udes.getBasetre();
            baseagility = udes.getBaseagi();
            baseintelligence = udes.getBaseintel();
            baseedex = udes.getBasedex();

            //FindViews
            cleys = findViewById(R.id.calss);
            livil = findViewById(R.id.level);
            mainclass = findViewById(R.id.mainclass);
            gerome = findViewById(R.id.healthpoints);
            manap = findViewById(R.id.manapoints);
            pat = findViewById(R.id.physicalattack);
            mat = findViewById(R.id.magicattack);
            pdef = findViewById(R.id.physicaldefense);
            mdef = findViewById(R.id.magicdef);
            bstr = findViewById(R.id.bstre);
            bagie = findViewById(R.id.agility);
            baseintel = findViewById(R.id.intelligence);
            strgr = findViewById(R.id.bstre);

            //computations
            double chealth = etspoints * (lebelnasad);
            double mpoints = meynap * lebelnasad;
            double physattack = pisatk * lebelnasad;
            double magicalatt = magicalattack * lebelnasad;
            double physicdef = physicaldefense * lebelnasad;
            double magicdefense = magicaldefense * lebelnasad;
            double bstre = basestrength * lebelnasad;
            double bagi = baseagility * lebelnasad;
            double bintel = baseintelligence * lebelnasad;


            //Setters
            cleys.setText("Amias");
            livil.setText("Vanguard | Lvl: " + Math.round(lebelnasad));
            mainclass.setText("''Ultra Destruction''");
            gerome.setText("HP: " + Math.round(chealth));
            manap.setText("MP: " + Math.round(mpoints));
            pat.setText("P.Atk:  " + Math.round(physattack));
            mat.setText("M.Atk: " + Math.round(magicalatt));
            pdef.setText("P.Def: " + Math.round(physicdef));
            mdef.setText(("M.Def: " + Math.round(magicdefense)));
            bstr.setText("Str: " + Math.round(bstre));
            bagie.setText("Agi: " + Math.round(bagi));
            baseintel.setText("Int: " + Math.round(bintel));
            chardis.setImageResource(R.drawable.vanguard3);
        } else if (pangkuha == 9) {
            TextView livil;
            ModernCaster ya = new ModernCaster(01, 500, 120, 150, 300, 150, 250, "Sniper", 1, 50, 120, 78, 1, 1, 1);
            ya.getHpoints();
            ya.getMpoints();
            ya.getPatk();
            ya.getPdef();
            ya.getMdef();
            ya.getClass();
            ya.getExp();
            ya.getBasetre();
            ya.getBaseagi();
            ya.getBaseintel();
            ya.getStrGrowth();
            ya.getAgiGrowth();
            ya.getIntgrowth();
            ya.getBasedex();

            //Getters
            String rarw = getIntent().getStringExtra("csub");
            String mainrawr = getIntent().getStringExtra("cmehn");
            lebelnasad = getIntent().getIntExtra("clevel", 0);
            etspoints = ya.getHpoints();
            meynap = ya.getMpoints();
            pisatk = ya.getPatk();
            magicalattack = ya.getMatk();
            physicaldefense = ya.getPdef();
            magicaldefense = ya.getMdef();
            basestrength = ya.getBasetre();
            baseagility = ya.getBaseagi();
            baseintelligence = ya.getBaseintel();
            baseedex = ya.getBasedex();

            //FindViews
            cleys = findViewById(R.id.calss);
            livil = findViewById(R.id.level);
            mainclass = findViewById(R.id.mainclass);
            gerome = findViewById(R.id.healthpoints);
            manap = findViewById(R.id.manapoints);
            pat = findViewById(R.id.physicalattack);
            mat = findViewById(R.id.magicattack);
            pdef = findViewById(R.id.physicaldefense);
            mdef = findViewById(R.id.magicdef);
            bstr = findViewById(R.id.bstre);
            bagie = findViewById(R.id.agility);
            baseintel = findViewById(R.id.intelligence);
            strgr = findViewById(R.id.bstre);

            //computations
            double chealth = etspoints * (lebelnasad);
            double mpoints = meynap * lebelnasad;
            double physattack = pisatk * lebelnasad;
            double magicalatt = magicalattack * lebelnasad;
            double physicdef = physicaldefense * lebelnasad;
            double magicdefense = magicaldefense * lebelnasad;
            double bstre = basestrength * lebelnasad;
            double bagi = baseagility * lebelnasad;
            double bintel = baseintelligence * lebelnasad;


            //Setters
            cleys.setText("Erzil");
            livil.setText("Caster | Lvl: " + Math.round(lebelnasad));
            mainclass.setText("''Modern Caster''");
            gerome.setText("HP: " + Math.round(chealth));
            manap.setText("MP: " + Math.round(mpoints));
            pat.setText("P.Atk:  " + Math.round(physattack));
            mat.setText("M.Atk: " + Math.round(magicalatt));
            pdef.setText("P.Def: " + Math.round(physicdef));
            mdef.setText(("M.Def: " + Math.round(magicdefense)));
            bstr.setText("Str: " + Math.round(bstre));
            bagie.setText("Agi: " + Math.round(bagi));
            baseintel.setText("Int: " + Math.round(bintel));
            chardis.setImageResource(R.drawable.caster2);


        } else if (pangkuha == 10) {

            TextView livil;
            UltraSuit wa = new UltraSuit(01, 500, 120, 150, 400, 300, 150, "Sniper", 1, 50, 90, 100, 1, 1, 1);
            wa.getHpoints();
            wa.getMpoints();
            wa.getPatk();
            wa.getPdef();
            wa.getMdef();
            wa.getClass();
            wa.getExp();
            wa.getBasetre();
            wa.getBaseagi();
            wa.getBaseintel();
            wa.getStrGrowth();
            wa.getAgiGrowth();
            wa.getIntgrowth();
            wa.getBasedex();

            //Getters
            String rarw = getIntent().getStringExtra("csubb");
            String mainrawr = getIntent().getStringExtra("cmehnn");
            lebelnasad = getIntent().getIntExtra("clevell", 0);
            etspoints = wa.getHpoints();
            meynap = wa.getMpoints();
            pisatk = wa.getPatk();
            magicalattack = wa.getMatk();
            physicaldefense = wa.getPdef();
            magicaldefense = wa.getMdef();
            basestrength = wa.getBasetre();
            baseagility = wa.getBaseagi();
            baseintelligence = wa.getBaseintel();
            baseedex = wa.getBasedex();

            //FindViews
            cleys = findViewById(R.id.calss);
            livil = findViewById(R.id.level);
            mainclass = findViewById(R.id.mainclass);
            gerome = findViewById(R.id.healthpoints);
            manap = findViewById(R.id.manapoints);
            pat = findViewById(R.id.physicalattack);
            mat = findViewById(R.id.magicattack);
            pdef = findViewById(R.id.physicaldefense);
            mdef = findViewById(R.id.magicdef);
            bstr = findViewById(R.id.bstre);
            bagie = findViewById(R.id.agility);
            baseintel = findViewById(R.id.intelligence);
            strgr = findViewById(R.id.bstre);

            //computations
            double chealth = etspoints * (lebelnasad);
            double mpoints = meynap * lebelnasad;
            double physattack = pisatk * lebelnasad;
            double magicalatt = magicalattack * lebelnasad;
            double physicdef = physicaldefense * lebelnasad;
            double magicdefense = magicaldefense * lebelnasad;
            double bstre = basestrength * lebelnasad;
            double bagi = baseagility * lebelnasad;
            double bintel = baseintelligence * lebelnasad;


            //Setters
            cleys.setText("Erzil");
            livil.setText("Caster | Lvl: " + ((lebelnasad)));
            mainclass.setText("''Ultra Suit''");
            gerome.setText("HP: " + Math.round(chealth));
            manap.setText("MP: " + Math.round(mpoints));
            pat.setText("P.Atk:  " + Math.round(physattack));
            mat.setText("M.Atk: " + Math.round(magicalatt));
            pdef.setText("P.Def: " + Math.round(physicdef));
            mdef.setText(("M.Def: " + Math.round(magicdefense)));
            bstr.setText("Str: " + Math.round(bstre));
            bagie.setText("Agi: " + Math.round(bagi));
            baseintel.setText("Int: " + Math.round(bintel));
            chardis.setImageResource(R.drawable.caster3);
        } else if (pangkuha == 11) {
            TextView livil;
            Monsters r = new Monsters(01, 50, 20, 30, 15, 50, 40);
            r.getPdef();
            r.getPatk();
            r.getMpoints();
            r.getHpoints();
            r.getMdef();
            r.getMatk();

            //Getters
            lebelnasad = getIntent().getIntExtra("lehvehll", 0);
            etspoints = r.getHpoints();
            meynap = r.getMpoints();
            pisatk = r.getPatk();
            magicalattack = r.getMatk();
            physicaldefense = r.getPdef();
            magicaldefense = r.getMdef();

            //FindViews
            cleys = findViewById(R.id.calss);
            livil = findViewById(R.id.level);
            mainclass = findViewById(R.id.mainclass);
            gerome = findViewById(R.id.healthpoints);
            manap = findViewById(R.id.manapoints);
            pat = findViewById(R.id.physicalattack);
            mat = findViewById(R.id.magicattack);
            pdef = findViewById(R.id.physicaldefense);
            mdef = findViewById(R.id.magicdef);
            bstr = findViewById(R.id.bstre);
            bagie = findViewById(R.id.agility);
            baseintel = findViewById(R.id.intelligence);
            strgr = findViewById(R.id.bstre);

            //computations
            double chealth = etspoints * (lebelnasad);
            double mpoints = meynap * lebelnasad;
            double physattack = pisatk * lebelnasad;
            double magicalatt = magicalattack * lebelnasad;
            double physicdef = physicaldefense * lebelnasad;
            double magicdefense = magicaldefense * lebelnasad;


            baseintel.setVisibility(View.GONE);
            bagie.setVisibility(View.GONE);
            strgr.setVisibility(View.GONE);

            //Setters
            cleys.setText("HyperActive Drone");
            livil.setText("Drone | Lvl: " + ((lebelnasad)));
            gerome.setText("HP: " + Math.round(chealth));
            manap.setText("MP: " + Math.round(mpoints));
            pat.setText("P.Atk:  " + Math.round(physattack));
            mat.setText("M.Atk: " + Math.round(magicalatt));
            pdef.setText("P.Def: " + Math.round(physicdef));
            mdef.setText(("M.Def: " + Math.round(magicdefense)));


        } else if (pangkuha == 12) {
            TextView livil;
            Monsters rr = new Monsters(01, 30, 10, 15, 5, 21, 20);
            rr.getPdef();
            rr.getPatk();
            rr.getMpoints();
            rr.getHpoints();
            rr.getMdef();
            rr.getMatk();

            //Getters
            lebelnasad = getIntent().getIntExtra("lezel", 0);
            etspoints = rr.getHpoints();
            meynap = rr.getMpoints();
            pisatk = rr.getPatk();
            magicalattack = rr.getMatk();
            physicaldefense = rr.getPdef();
            magicaldefense = rr.getMdef();

            //FindViews
            cleys = findViewById(R.id.calss);
            livil = findViewById(R.id.level);
            mainclass = findViewById(R.id.mainclass);
            gerome = findViewById(R.id.healthpoints);
            manap = findViewById(R.id.manapoints);
            pat = findViewById(R.id.physicalattack);
            mat = findViewById(R.id.magicattack);
            pdef = findViewById(R.id.physicaldefense);
            mdef = findViewById(R.id.magicdef);
            bstr = findViewById(R.id.bstre);
            bagie = findViewById(R.id.agility);
            baseintel = findViewById(R.id.intelligence);
            strgr = findViewById(R.id.bstre);

            //computations
            double chealth = etspoints * (lebelnasad);
            double mpoints = meynap * lebelnasad;
            double physattack = pisatk * lebelnasad;
            double magicalatt = magicalattack * lebelnasad;
            double physicdef = physicaldefense * lebelnasad;
            double magicdefense = magicaldefense * lebelnasad;


            baseintel.setVisibility(View.GONE);
            bagie.setVisibility(View.GONE);
            strgr.setVisibility(View.GONE);

            //Setters
            cleys.setText("Roaming Drone");
            livil.setText("Drone | Lvl: " + ((lebelnasad)));
            gerome.setText("HP: " + Math.round(chealth));
            manap.setText("MP: " + Math.round(mpoints));
            pat.setText("P.Atk:  " + Math.round(physattack));
            mat.setText("M.Atk: " + Math.round(magicalatt));
            pdef.setText("P.Def: " + Math.round(physicdef));
            mdef.setText(("M.Def: " + Math.round(magicdefense)));


        } else if (pangkuha == 13) {
            TextView livil;
            Monsters re = new Monsters(01, 50, 20, 70, 30, 25, 30);
            re.getPdef();
            re.getPatk();
            re.getMpoints();
            re.getHpoints();
            re.getMdef();
            re.getMatk();

            //Getters
            lebelnasad = getIntent().getIntExtra("fzel", 0);
            etspoints = re.getHpoints();
            meynap = re.getMpoints();
            pisatk = re.getPatk();
            magicalattack = re.getMatk();
            physicaldefense = re.getPdef();
            magicaldefense = re.getMdef();

            //FindViews
            cleys = findViewById(R.id.calss);
            livil = findViewById(R.id.level);
            mainclass = findViewById(R.id.mainclass);
            gerome = findViewById(R.id.healthpoints);
            manap = findViewById(R.id.manapoints);
            pat = findViewById(R.id.physicalattack);
            mat = findViewById(R.id.magicattack);
            pdef = findViewById(R.id.physicaldefense);
            mdef = findViewById(R.id.magicdef);
            bstr = findViewById(R.id.bstre);
            bagie = findViewById(R.id.agility);
            baseintel = findViewById(R.id.intelligence);
            strgr = findViewById(R.id.bstre);

            //computations
            double chealth = etspoints * (lebelnasad);
            double mpoints = meynap * lebelnasad;
            double physattack = pisatk * lebelnasad;
            double magicalatt = magicalattack * lebelnasad;
            double physicdef = physicaldefense * lebelnasad;
            double magicdefense = magicaldefense * lebelnasad;


            baseintel.setVisibility(View.GONE);
            bagie.setVisibility(View.GONE);
            strgr.setVisibility(View.GONE);

            //Setters
            cleys.setText("Fighting Drone");
            livil.setText("Drone | Lvl: " + ((lebelnasad)));
            gerome.setText("HP: " + Math.round(chealth));
            manap.setText("MP: " + Math.round(mpoints));
            pat.setText("P.Atk:  " + Math.round(physattack));
            mat.setText("M.Atk: " + Math.round(magicalatt));
            pdef.setText("P.Def: " + Math.round(physicdef));
            mdef.setText(("M.Def: " + Math.round(magicdefense)));


        } else if (pangkuha == 14) {
            TextView livil;
            Monsters rs = new Monsters(01, 50, 20, 3, 5, 25, 20);
            rs.getPdef();
            rs.getPatk();
            rs.getMpoints();
            rs.getHpoints();
            rs.getMdef();
            rs.getMatk();

            //Getters
            lebelnasad = getIntent().getIntExtra("szel", 0);
            etspoints = rs.getHpoints();
            meynap = rs.getMpoints();
            pisatk = rs.getPatk();
            magicalattack = rs.getMatk();
            physicaldefense = rs.getPdef();
            magicaldefense = rs.getMdef();

            //FindViews
            cleys = findViewById(R.id.calss);
            livil = findViewById(R.id.level);
            mainclass = findViewById(R.id.mainclass);
            gerome = findViewById(R.id.healthpoints);
            manap = findViewById(R.id.manapoints);
            pat = findViewById(R.id.physicalattack);
            mat = findViewById(R.id.magicattack);
            pdef = findViewById(R.id.physicaldefense);
            mdef = findViewById(R.id.magicdef);
            bstr = findViewById(R.id.bstre);
            bagie = findViewById(R.id.agility);
            baseintel = findViewById(R.id.intelligence);
            strgr = findViewById(R.id.bstre);

            //computations
            double chealth = etspoints * (lebelnasad);
            double mpoints = meynap * lebelnasad;
            double physattack = pisatk * lebelnasad;
            double magicalatt = magicalattack * lebelnasad;
            double physicdef = physicaldefense * lebelnasad;
            double magicdefense = magicaldefense * lebelnasad;


            baseintel.setVisibility(View.GONE);
            bagie.setVisibility(View.GONE);
            strgr.setVisibility(View.GONE);

            //Setters
            cleys.setText("HyperActive Drone");
            livil.setText("Drone | Lvl: " + ((lebelnasad)));
            gerome.setText("HP: " + Math.round(chealth));
            manap.setText("MP: " + Math.round(mpoints));
            pat.setText("P.Atk:  " + Math.round(physattack));
            mat.setText("M.Atk: " + Math.round(magicalatt));
            pdef.setText("P.Def: " + Math.round(physicdef));
            mdef.setText(("M.Def: " + Math.round(magicdefense)));


        } else if (pangkuha == 15) {
            TextView livil;
            Monsters rm = new Monsters(01, 50, 20, 113, 98, 3, 25);
            rm.getPdef();
            rm.getPatk();
            rm.getMpoints();
            rm.getHpoints();
            rm.getMdef();
            rm.getMatk();

            //Getters
            lebelnasad = getIntent().getIntExtra("mzel", 0);
            etspoints = rm.getHpoints();
            meynap = rm.getMpoints();
            pisatk = rm.getPatk();
            magicalattack = rm.getMatk();
            physicaldefense = rm.getPdef();
            magicaldefense = rm.getMdef();

            //FindViews
            cleys = findViewById(R.id.calss);
            livil = findViewById(R.id.level);
            mainclass = findViewById(R.id.mainclass);
            gerome = findViewById(R.id.healthpoints);
            manap = findViewById(R.id.manapoints);
            pat = findViewById(R.id.physicalattack);
            mat = findViewById(R.id.magicattack);
            pdef = findViewById(R.id.physicaldefense);
            mdef = findViewById(R.id.magicdef);
            bstr = findViewById(R.id.bstre);
            bagie = findViewById(R.id.agility);
            baseintel = findViewById(R.id.intelligence);
            strgr = findViewById(R.id.bstre);

            //computations
            double chealth = etspoints * (lebelnasad);
            double mpoints = meynap * lebelnasad;
            double physattack = pisatk * lebelnasad;
            double magicalatt = magicalattack * lebelnasad;
            double physicdef = physicaldefense * lebelnasad;
            double magicdefense = magicaldefense * lebelnasad;


            baseintel.setVisibility(View.GONE);
            bagie.setVisibility(View.GONE);
            strgr.setVisibility(View.GONE);

            //Setters
            cleys.setText("HyperActive Drone");
            livil.setText("Drone | Lvl: " + ((lebelnasad)));
            gerome.setText("HP: " + Math.round(chealth));
            manap.setText("MP: " + Math.round(mpoints));
            pat.setText("P.Atk:  " + Math.round(physattack));
            mat.setText("M.Atk: " + Math.round(magicalatt));
            pdef.setText("P.Def: " + Math.round(physicdef));
            mdef.setText(("M.Def: " + Math.round(magicdefense)));


        }

    }
}







