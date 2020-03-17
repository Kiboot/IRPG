package mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //SPINNERS
    Spinner role;
    Spinner heroClass;
    Spinner sniper;
    Spinner medic;
    Spinner guard;
    Spinner vanguard;
    Spinner caster;
    TextView heroName;
    Spinner mons;
    /////////////////////EDITTEXT/////////////////////////////
    EditText levelin;
    EditText bazlevel;
    //medic
    EditText hologramming;
    EditText dronee;
    //guard
    EditText ibangshield;
    EditText hologramshield;
    //vanguard
    EditText rocketing;
    EditText bazookwshield;
    //caster
    EditText sub1;
    EditText sub2;

    EditText hypdrone;
    EditText romdrone;
    EditText paytdrone;
    EditText surdrone;
    EditText maldrone;

    /////////////////////////////////////////////////////////

    //////////////////////STRINGS///////////////////////
    String hclass;
    String snayp;
    String meydic;
    String gard;
    String bangard;
    String castering;
    String cles;
    String hologramm;
    String rll;
    String mnstr;
//////////////////////////////////////////////////////////

    ///////////////////////////////IMAGEVIEW//////////////////////
    ImageView bazooka;
    ImageView crossbow;
    ImageView dipleh;
    //////////////////////////////////////////////////////////////


    //////////////////////////////BUTTONS//////////////////////
    //Sniper
    Button pangadalasacross;
    Button pandalasabazooka;
    //Medic
    Button pandalasahologrammer;
    Button pandalasadrone;
    //Guard
    Button pandalasaibangshield;
    Button pandalasaholoshield;
    //Vanguard
    Button pandalasasarocket;
    Button pandalasarocketwitdef;
    //Caster
    Button pandalasasubs1;
    Button pandalasubs2;


    /////// mIONS

    Button hypdronee;
    Button romdronee;
    Button paytdronee;
    Button surdronee;
    Button maldronee;
///////////////////////////////////////////////////////

    ////////////////////////TEXTVIEWS/////////////////
    TextView title;
    //////////////////////////////////////////////////

    /////////////////////INTS////////////////////////
     int leybell;
     int bazleybel;
     int hologs;
     int drons;
     int oshield;
     int holoshield;
     int rocks;
     int defbaz;
     int casa1;
     int casa2;
     int disp;
     int hypee;
    int ropee;
    int foree;
    int suree;
    int malee;

     ////////////////////////////////////////////////




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        role = findViewById(R.id.roles);
mons = findViewById(R.id.Monster);
        ////LevelInputs
        levelin = findViewById(R.id.leveltyope);

        /////////////////////////////////////////
        title = findViewById(R.id.title);
        bazlevel = findViewById(R.id.leveltypebaz);
        heroName = findViewById(R.id.nameview);
        heroClass = findViewById(R.id.Class);
        sniper = findViewById(R.id.snipersub);
        medic = findViewById(R.id.medicsub);
        guard = findViewById(R.id.guardsub);
        vanguard = findViewById(R.id.vanguardsub);
        caster = findViewById(R.id.castersub);
        bazooka = findViewById(R.id.bazooka);
        crossbow = findViewById(R.id.crossbow);
        pangadalasacross = findViewById(R.id.viewstats);
        pandalasabazooka = findViewById(R.id.viewstatsbaz);
        heroClass.setVisibility(View.GONE);

        //Medic
        pandalasahologrammer = findViewById(R.id.viewstatsholo);
        pandalasadrone = findViewById(R.id.viewstatsdroner);
        hologramming = findViewById(R.id.hologramin);
        dronee = findViewById(R.id.dronein);

        //Guard
        pandalasaibangshield = findViewById(R.id.viewstatsprimshield);
        pandalasaholoshield = findViewById(R.id.viewstatsholoshield);
        ibangshield = findViewById(R.id.ibangshieldin);
        hologramshield = findViewById(R.id.hologuardin);
        //Vanguard
        pandalasasarocket = findViewById(R.id.viewstatsrocketlauncher);
        pandalasarocketwitdef = findViewById(R.id.viewstatsshieldwithbazooka);
        rocketing=findViewById(R.id.rocketin);
        bazookwshield = findViewById(R.id.bazookwshieldin);
        //Caster
         pandalasasubs1 = findViewById(R.id.viewstatsskin1);
         pandalasubs2 = findViewById(R.id.viewstatsskin2);
         sub1 = findViewById(R.id.caster1);
         sub2 = findViewById(R.id.caster2);


        role.setVisibility(View.VISIBLE);
        heroName.setVisibility(View.GONE);
        bazlevel.setVisibility(View.GONE);
        title.setVisibility(View.VISIBLE);
        crossbow.setVisibility(View.GONE);
        bazooka.setVisibility(View.GONE);
        sniper.setVisibility(View.GONE);
        medic.setVisibility(View.GONE);
        guard.setVisibility(View.GONE);
        vanguard.setVisibility(View.GONE);
        caster.setVisibility(View.GONE);
        levelin.setVisibility(View.GONE);
        pangadalasacross.setVisibility(View.GONE);
        pandalasabazooka.setVisibility(View.GONE);
        //Medic
        pandalasahologrammer.setVisibility(View.GONE);
        pandalasadrone.setVisibility(View.GONE);
        hologramming.setVisibility(View.GONE);
        dronee.setVisibility(View.GONE);
        //Guard
        pandalasaibangshield.setVisibility(View.GONE);
        pandalasaholoshield.setVisibility(View.GONE);
        ibangshield.setVisibility(View.GONE);
        hologramshield.setVisibility(View.GONE);
        //Vanguard
        pandalasasarocket.setVisibility(View.GONE);
        pandalasarocketwitdef.setVisibility(View.GONE);
        rocketing.setVisibility(View.GONE);
        bazookwshield.setVisibility(View.GONE);
        //Caster
        pandalasasubs1.setVisibility(View.GONE);
        pandalasubs2.setVisibility(View.GONE);
        sub1.setVisibility(View.GONE);
        sub2.setVisibility(View.GONE);
        mons.setVisibility(View.GONE);
        ///////monsterrrrrrrr
        hypdrone = findViewById(R.id.hyperactdrone);
        romdrone = findViewById(R.id.roamingdrone);
        paytdrone = findViewById(R.id.Fightingdrone);
        surdrone = findViewById(R.id.surveillancedron);
        maldrone = findViewById(R.id.maldrone);

        //editext
        hypdrone.setVisibility(View.GONE);
        romdrone.setVisibility(View.GONE);
        paytdrone.setVisibility(View.GONE);
        surdrone.setVisibility(View.GONE);
        maldrone.setVisibility(View.GONE);
        //buts
         hypdronee=findViewById(R.id.hidrone);
         romdronee=findViewById(R.id.rodrone);
         paytdronee=findViewById(R.id.fdrone);
         surdronee=findViewById(R.id.sudrone);
         maldronee=findViewById(R.id.maldroneeee);
         //////buttons
        hypdronee.setVisibility(View.GONE);
        romdronee.setVisibility(View.GONE);
        paytdronee.setVisibility(View.GONE);
        surdronee.setVisibility(View.GONE);
        maldronee.setVisibility(View.GONE);
        dipleh=findViewById(R.id.bordering);
        dipleh.setVisibility(View.GONE);


        role.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        rll = role.getSelectedItem().toString();

                        if (rll.equals("Hero")) {

                            heroClass.setVisibility(View.VISIBLE);
                            hypdronee.setVisibility(View.GONE);
                            romdronee.setVisibility(View.GONE);
                            paytdronee.setVisibility(View.GONE);
                            surdronee.setVisibility(View.GONE);
                            maldronee.setVisibility(View.GONE);
                            hypdrone.setVisibility(View.GONE);
                            romdrone.setVisibility(View.GONE);
                            paytdrone.setVisibility(View.GONE);
                            surdrone.setVisibility(View.GONE);
                            maldrone.setVisibility(View.GONE);
                            mons.setVisibility(View.GONE);
                            dipleh.setVisibility(View.GONE);


                        }
                        else if (rll.equals("Monster")){
                            title.setVisibility(View.VISIBLE);
                            dipleh.setVisibility(View.GONE);
                            dipleh.setImageResource(R.drawable.prevsniper);
                            mons.setVisibility(View.VISIBLE);
                            role.setVisibility(View.VISIBLE);
                            pangadalasacross.setVisibility(View.GONE);
                            pandalasabazooka.setVisibility(View.GONE);
                            //Medic
                            pandalasahologrammer.setVisibility(View.GONE);
                            pandalasadrone.setVisibility(View.GONE);
                            hologramming.setVisibility(View.GONE);
                            dronee.setVisibility(View.GONE);
                            //Guard
                            pandalasaibangshield.setVisibility(View.GONE);
                            pandalasaholoshield.setVisibility(View.GONE);
                            ibangshield.setVisibility(View.GONE);
                            hologramshield.setVisibility(View.GONE);
                            //Vanguard
                            pandalasasarocket.setVisibility(View.GONE);
                            pandalasarocketwitdef.setVisibility(View.GONE);
                            rocketing.setVisibility(View.GONE);
                            bazookwshield.setVisibility(View.GONE);
                            //Caster
                            pandalasasubs1.setVisibility(View.GONE);
                            pandalasubs2.setVisibility(View.GONE);
                            sub1.setVisibility(View.GONE);
                            sub2.setVisibility(View.GONE);
                            levelin.setVisibility(View.GONE);
                            bazlevel.setVisibility(View.GONE);
                            heroName.setVisibility(View.GONE);
                            heroClass.setVisibility(View.GONE);
                            sniper.setVisibility(View.GONE);
                            medic.setVisibility(View.GONE);
                            guard.setVisibility(View.GONE);
                            vanguard.setVisibility(View.GONE);
                            caster.setVisibility(View.GONE);



                        }
                    }


                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );


        mons.setOnItemSelectedListener(

                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        mnstr = mons.getSelectedItem().toString();


                        if (mnstr.equals("HyperActive Drone")){
                            title.setVisibility(View.GONE);
                            hypdrone.setVisibility(View.VISIBLE);
                            romdrone.setVisibility(View.GONE);
                            paytdrone.setVisibility(View.GONE);
                            surdrone.setVisibility(View.GONE);
                            maldrone.setVisibility(View.GONE);
                            hypdronee.setVisibility(View.VISIBLE);
                            romdronee.setVisibility(View.GONE);
                            paytdronee.setVisibility(View.GONE);
                            surdronee.setVisibility(View.GONE);
                            maldronee.setVisibility(View.GONE);
                            dipleh.setVisibility(View.VISIBLE);
                            dipleh.setImageResource(R.drawable.droneborderred);
                            hypdronee.setOnClickListener(

                                    new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            hypee = Integer.valueOf(hypdrone.getText().toString());
                                            if (hypee >= 1 && hypee <= 50) {
                                                Intent hapit = new Intent(MainActivity.this, HeroDisplay.class);
                                                hapit.putExtra("lehvehll", hypee);
                                                hapit.putExtra("indic", 11);
                                                startActivity(hapit);
                                            }
                                            else {
                                                Toast.makeText(getApplicationContext(),"Enter numbers between 1-50 only",Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    }
                            );


                        }

                        else if (mnstr.equals("Roaming Drone")){

                            hypdrone.setVisibility(View.GONE);
                            romdrone.setVisibility(View.VISIBLE);
                            paytdrone.setVisibility(View.GONE);
                            surdrone.setVisibility(View.GONE);
                            maldrone.setVisibility(View.GONE);
                            title.setVisibility(View.GONE);
                            hypdronee.setVisibility(View.GONE);
                            romdronee.setVisibility(View.VISIBLE);
                            paytdronee.setVisibility(View.GONE);
                            surdronee.setVisibility(View.GONE);
                            maldronee.setVisibility(View.GONE);
                            dipleh.setVisibility(View.VISIBLE);
                            dipleh.setImageResource(R.drawable.dronebordergr);
                            romdronee.setOnClickListener(
                                    new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            ropee = Integer.valueOf(romdrone.getText().toString());
                                            if (ropee>=1 && ropee<=50){
                                                Intent roam = new Intent(MainActivity.this, HeroDisplay.class);
                                                roam.putExtra("lezel",ropee);
                                                roam.putExtra("indic",12);
                                                startActivity(roam);



                                            }
                                            else{

                                                Toast.makeText(getApplicationContext(),"Enter numbers between 1-50 only",Toast.LENGTH_SHORT).show();

                                            }

                                        }
                                    }
                            );

                        }else if(mnstr.equals("Fighting Drone")){
                            hypdrone.setVisibility(View.GONE);
                            romdrone.setVisibility(View.GONE);
                            paytdrone.setVisibility(View.VISIBLE);
                            surdrone.setVisibility(View.GONE);
                            maldrone.setVisibility(View.GONE);
                            title.setVisibility(View.GONE);
                            hypdronee.setVisibility(View.GONE);
                            romdronee.setVisibility(View.GONE);
                            paytdronee.setVisibility(View.VISIBLE);
                            surdronee.setVisibility(View.GONE);
                            maldronee.setVisibility(View.GONE);

                            dipleh.setVisibility(View.VISIBLE);
                            dipleh.setImageResource(R.drawable.droneborderblu);
                            paytdronee.setOnClickListener(

                                    new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            foree = Integer.valueOf(paytdrone.getText().toString());
                                            if (foree>=1 && foree<=50){
                                                Intent fdrone = new Intent(MainActivity.this, HeroDisplay.class);
                                                fdrone.putExtra("fzel",foree);
                                                fdrone.putExtra("indic",13);
                                                startActivity(fdrone);



                                            }
                                            else{

                                                Toast.makeText(getApplicationContext(),"Enter numbers between 1-50 only",Toast.LENGTH_SHORT).show();

                                            }

                                        }
                                    }
                            );

                        }
                        else if(mnstr.equals("Surveillance Drone")){
                            hypdrone.setVisibility(View.GONE);
                            romdrone.setVisibility(View.GONE);
                            paytdrone.setVisibility(View.GONE);
                            surdrone.setVisibility(View.VISIBLE);
                            maldrone.setVisibility(View.GONE);
                            title.setVisibility(View.GONE);
                            hypdronee.setVisibility(View.GONE);
                            romdronee.setVisibility(View.GONE);
                            paytdronee.setVisibility(View.GONE);
                            surdronee.setVisibility(View.VISIBLE);
                            maldronee.setVisibility(View.GONE);
                            dipleh.setVisibility(View.GONE);
                            dipleh.setVisibility(View.VISIBLE);
                            dipleh.setImageResource(R.drawable.droneborderyel);
                            surdronee.setOnClickListener(
                                    new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            suree = Integer.valueOf(surdrone.getText().toString());
                                            if (suree>=1 && suree<=50){
                                                Intent sdrone = new Intent(MainActivity.this, HeroDisplay.class);
                                                sdrone.putExtra("szel",suree);
                                                sdrone.putExtra("indic",14);
                                                startActivity(sdrone);



                                            }
                                            else{

                                                Toast.makeText(getApplicationContext(),"Enter numbers between 1-50 only",Toast.LENGTH_SHORT).show();

                                            }
                                        }
                                    }
                            );

                        }
                        else if(mnstr.equals("Malfunctioned Drone")){
                            hypdrone.setVisibility(View.GONE);
                            romdrone.setVisibility(View.GONE);
                            paytdrone.setVisibility(View.GONE);
                            surdrone.setVisibility(View.GONE);
                            maldrone.setVisibility(View.VISIBLE);
                            title.setVisibility(View.GONE);
                            hypdronee.setVisibility(View.GONE);
                            romdronee.setVisibility(View.GONE);
                            paytdronee.setVisibility(View.GONE);
                            surdronee.setVisibility(View.GONE);
                            maldronee.setVisibility(View.VISIBLE);
                            dipleh.setVisibility(View.VISIBLE);
                            dipleh.setImageResource(R.drawable.droneborderbro);
                            maldrone.setOnClickListener(
                                    new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            malee = Integer.valueOf(maldrone.getText().toString());
                                            if (malee>=1 && malee<=50){
                                                Intent mdrone = new Intent(MainActivity.this, HeroDisplay.class);
                                                mdrone.putExtra("mzel",malee);
                                                mdrone.putExtra("indic",15);
                                                startActivity(mdrone);



                                            }
                                            else{

                                                Toast.makeText(getApplicationContext(),"Enter numbers between 1-50 only",Toast.LENGTH_SHORT).show();

                                            }

                                        }
                                    }
                            );

                        }


                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

        heroClass.setOnItemSelectedListener(

                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                        hclass=heroClass.getSelectedItem().toString();


                        if (hclass.equals("Select a Class")){

                            heroName.setVisibility(View.GONE);
                            bazlevel.setVisibility(View.GONE);
                            title.setVisibility(View.VISIBLE);
                            crossbow.setVisibility(View.GONE);
                            bazooka.setVisibility(View.GONE);
                            sniper.setVisibility(View.GONE);
                            medic.setVisibility(View.GONE);
                            guard.setVisibility(View.GONE);
                            vanguard.setVisibility(View.GONE);
                            caster.setVisibility(View.GONE);
                            levelin.setVisibility(View.GONE);
                            pangadalasacross.setVisibility(View.GONE);
                            pandalasabazooka.setVisibility(View.GONE);
                            //Medic
                            pandalasahologrammer.setVisibility(View.GONE);
                            pandalasadrone.setVisibility(View.GONE);
                            hologramming.setVisibility(View.GONE);
                            dronee.setVisibility(View.GONE);
                            //Guard
                            pandalasaibangshield.setVisibility(View.GONE);
                            pandalasaholoshield.setVisibility(View.GONE);
                            ibangshield.setVisibility(View.GONE);
                            hologramshield.setVisibility(View.GONE);
                            //Vanguard
                            pandalasasarocket.setVisibility(View.GONE);
                            pandalasarocketwitdef.setVisibility(View.GONE);
                            rocketing.setVisibility(View.GONE);
                            bazookwshield.setVisibility(View.GONE);
                            //Caster
                            pandalasasubs1.setVisibility(View.GONE);
                            pandalasubs2.setVisibility(View.GONE);
                            sub1.setVisibility(View.GONE);
                            sub2.setVisibility(View.GONE);



                        }
                        else if (hclass.equals("Sniper")){
                            sniper.setVisibility(View.VISIBLE);
                            medic.setVisibility(View.GONE);
                            guard.setVisibility(View.GONE);
                            bazlevel.setVisibility(View.GONE);
                            vanguard.setVisibility(View.GONE);
                            caster.setVisibility(View.GONE);
                            levelin.setVisibility(View.GONE);
                            pangadalasacross.setVisibility(View.GONE);
                            heroName.setVisibility(View.VISIBLE);
                            heroName.setText("Stell");
                            title.setVisibility(View.GONE);
                            pandalasasubs1.setVisibility(View.GONE);
                            pandalasubs2.setVisibility(View.GONE);
                            pandalasabazooka.setVisibility(View.GONE);
                            //
                            sub1.setVisibility(View.GONE);
                            sub2.setVisibility(View.GONE);
                            rocketing.setVisibility(View.GONE);
                            bazookwshield.setVisibility(View.GONE);
                            ibangshield.setVisibility(View.GONE);
                            hologramshield.setVisibility(View.GONE);
                            hologramming.setVisibility(View.GONE);
                            dronee.setVisibility(View.GONE);
                            dipleh.setVisibility(View.VISIBLE);
                            dipleh.setImageResource(R.drawable.prevsniper);
                            pandalasahologrammer.setVisibility(View.GONE);
                            pandalasadrone.setVisibility(View.GONE);
                            pandalasaibangshield.setVisibility(View.GONE);
                            pandalasaholoshield.setVisibility(View.GONE);
                            pandalasasarocket.setVisibility(View.GONE);
                            pandalasarocketwitdef.setVisibility(View.GONE);

                            sniper.setOnItemSelectedListener(
                                   new AdapterView.OnItemSelectedListener() {
                                       @Override
                                       public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                           snayp=sniper.getSelectedItem().toString();


                                           if (snayp.equals("Crossbow (+30 Agi)")){
                                               levelin.setVisibility(View.GONE);
                                               bazlevel.setVisibility(View.VISIBLE);

                                               pangadalasacross.setVisibility(View.VISIBLE);
                                               dipleh.setImageResource(R.drawable.prevsniper2);
                                               title.setVisibility(View.GONE);
                                               pandalasabazooka.setVisibility(View.GONE);

                                               pangadalasacross.setOnClickListener(
                                                       new View.OnClickListener() {
                                                           @Override
                                                           public void onClick(View v) {
                                                               bazleybel = Integer.valueOf(bazlevel.getText().toString());
                                                               snayp = sniper.getSelectedItem().toString();
                                                               hclass = heroClass.getSelectedItem().toString();
                                                               if (bazleybel>=1 && bazleybel<=50)
                                                               {

                                                                   Intent crossbownext = new Intent(MainActivity.this, HeroDisplay.class);
                                                                   crossbownext.putExtra("levelin", bazleybel);
                                                                   crossbownext.putExtra("kles", snayp);
                                                                   crossbownext.putExtra("mainrole", hclass);
                                                                   crossbownext.putExtra("indic", 1);


                                                                   startActivity(crossbownext);
                                                               }
                                                               else{
                                                                   Toast.makeText(getApplicationContext(),"Enter numbers between 1-50 only",Toast.LENGTH_SHORT).show();

                                                               }
                                                           }
                                                       }
                                               );



                                           }

                                           else if(snayp.equals("Bazooka (+150 P.Atk, -30 Agi)")){
                                               levelin.setVisibility(View.VISIBLE);
                                               bazlevel.setVisibility(View.GONE);
                                               dipleh.setImageResource(R.drawable.prevsniper3);
                                               bazooka.setVisibility(View.GONE);
                                               pangadalasacross.setVisibility(View.GONE);
                                               crossbow.setVisibility(View.GONE);
                                               title.setVisibility(View.GONE);
                                               pandalasabazooka.setVisibility(View.VISIBLE);

                                               pandalasabazooka.setOnClickListener(
                                                       new View.OnClickListener() {
                                                           @Override
                                                           public void onClick(View v) {

                                                               leybell = Integer.valueOf(levelin.getText().toString());
                                                               snayp = sniper.getSelectedItem().toString();
                                                               hclass = heroClass.getSelectedItem().toString();

                                                               if (leybell >= 1 && leybell <= 50) {

                                                                   Intent bazookanext = new Intent(MainActivity.this, HeroDisplay.class);
                                                                   bazookanext.putExtra("levelin", leybell);
                                                                   bazookanext.putExtra("bzcls", snayp);
                                                                   bazookanext.putExtra("bsubclass", hclass);
                                                                   bazookanext.putExtra("indic", 2);
                                                                   startActivity(bazookanext);

                                                               }else{

                                                                   Toast.makeText(getApplicationContext(),"Enter numbers between 1-50 only",Toast.LENGTH_SHORT).show();
                                                               }
                                                           }
                                                       }
                                               );


                                           }

                                       }

                                       @Override
                                       public void onNothingSelected(AdapterView<?> parent) {

                                       }

                                   }
                           );


                            }
                        else if (hclass.equals("Medic")){
                            sniper.setVisibility(View.GONE);
                            medic.setVisibility(View.VISIBLE);
                            guard.setVisibility(View.GONE);
                            vanguard.setVisibility(View.GONE);
                            caster.setVisibility(View.GONE);
                            pandalasasubs1.setVisibility(View.GONE);
                            pandalasubs2.setVisibility(View.GONE);
                            levelin.setVisibility(View.GONE);
                            pangadalasacross.setVisibility(View.GONE);
                            heroName.setVisibility(View.VISIBLE);
                            heroName.setText("Calen");
                            title.setVisibility(View.GONE);
                            pandalasasarocket.setVisibility(View.GONE);
                            pandalasarocketwitdef.setVisibility(View.GONE);
                            dipleh.setImageResource(R.drawable.prevmedic);
                            //
                            pandalasaibangshield.setVisibility(View.GONE);
                            pandalasaholoshield.setVisibility(View.GONE);
                            bazlevel.setVisibility(View.GONE);
                            levelin.setVisibility(View.GONE);
                            dipleh.setVisibility(View.VISIBLE);
                            pandalasaholoshield.setVisibility(View.GONE);
                            hologramshield.setVisibility(View.GONE);
                            //Vanguard
                            pandalasasarocket.setVisibility(View.GONE);
                            pandalasarocketwitdef.setVisibility(View.GONE);
                            rocketing.setVisibility(View.GONE);
                            bazookwshield.setVisibility(View.GONE);
                            //Caster
                            pandalasasubs1.setVisibility(View.GONE);
                            pandalasubs2.setVisibility(View.GONE);
                            sub1.setVisibility(View.GONE);
                            sub2.setVisibility(View.GONE);
                            pandalasabazooka.setVisibility(View.GONE);


                            medic.setOnItemSelectedListener(
                                    new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            meydic=medic.getSelectedItem().toString();

                                            if (meydic.equals("Hologram Screen (+260 Agi)")){

                                                crossbow.setVisibility(View.GONE);
                                                dronee.setVisibility(View.GONE);
                                                pandalasadrone.setVisibility(View.GONE);
                                                hologramming.setVisibility(View.VISIBLE);
                                                pandalasahologrammer.setVisibility(View.VISIBLE);
                                                bazooka.setVisibility(View.GONE);
                                                title.setVisibility(View.GONE);
                                                dipleh.setImageResource(R.drawable.prevmedic2);
                                                pandalasahologrammer.setOnClickListener(
                                                        new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {

                                                                hologs = Integer.valueOf(hologramming.getText().toString());
                                                                hologramm = medic.getSelectedItem().toString();
                                                                hclass = heroClass.getSelectedItem().toString();

                                                                if (hologs>=1 && hologs<=50) {
                                                                    Intent hologram = new Intent(MainActivity.this, HeroDisplay.class);
                                                                    hologram.putExtra("hololevel", hologs);
                                                                    hologram.putExtra("minclass", hologramm);
                                                                    hologram.putExtra("subclass", hclass);
                                                                    hologram.putExtra("indic", 3);
                                                                    startActivity(hologram);
                                                                }
                                                                else {
                                                                    Toast.makeText(getApplicationContext(),"Enter numbers between 1-50 only",Toast.LENGTH_SHORT).show();
                                                                }
                                                            }
                                                        }
                                                );


                                            }

                                            else if(meydic.equals("Drone Care (+100 P.Def)")){
                                                dronee.setVisibility(View.VISIBLE);
                                                hologramming.setVisibility(View.GONE);
                                                bazooka.setVisibility(View.GONE);
                                                pangadalasacross.setVisibility(View.VISIBLE);
                                                crossbow.setVisibility(View.GONE);
                                                title.setVisibility(View.GONE);
                                                pandalasahologrammer.setVisibility(View.GONE);
                                                sub1.setVisibility(View.GONE);
                                                sub2.setVisibility(View.GONE);
                                                rocketing.setVisibility(View.GONE);
                                                bazookwshield.setVisibility(View.GONE);
                                                ibangshield.setVisibility(View.GONE);
                                                dipleh.setImageResource(R.drawable.prevmedic3);
                                                bazlevel.setVisibility(View.GONE);
                                                levelin.setVisibility(View.GONE);

                                                pangadalasacross.setOnClickListener(
                                                        new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                drons = Integer.valueOf(dronee.getText().toString());
                                                                hologramm = medic.getSelectedItem().toString();
                                                                hclass = heroClass.getSelectedItem().toString();
                                                                if (drons>=1 && drons <=50 ) {
                                                                    Intent drun = new Intent(MainActivity.this, HeroDisplay.class);
                                                                    drun.putExtra("hololevel", drons);
                                                                    drun.putExtra("minclass", hologramm);
                                                                    drun.putExtra("subclass", hclass);
                                                                    drun.putExtra("indic", 4);

                                                                    startActivity(drun);
                                                                }
                                                                else{
                                                                    Toast.makeText(getApplicationContext(),"Enter numbers between 1-50 only",Toast.LENGTH_SHORT).show();
                                                                }

                                                            }
                                                        }
                                                );




                                            }

                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    }
                            );

                        }
                        else if (hclass.equals("Guard")){
                            dipleh.setVisibility(View.VISIBLE);
                            dipleh.setImageResource(R.drawable.prevguard);
                            sniper.setVisibility(View.GONE);
                            medic.setVisibility(View.GONE);
                            guard.setVisibility(View.VISIBLE);
                            pandalasasarocket.setVisibility(View.GONE);
                            pandalasarocketwitdef.setVisibility(View.GONE);
                            vanguard.setVisibility(View.GONE);
                            caster.setVisibility(View.GONE);
                            pandalasasubs1.setVisibility(View.GONE);
                            pandalasubs2.setVisibility(View.GONE);
                            levelin.setVisibility(View.GONE);
                            pangadalasacross.setVisibility(View.GONE);
                            heroName.setVisibility(View.VISIBLE);
                            heroName.setText("Azel");
                            title.setVisibility(View.GONE);
                            pangadalasacross.setVisibility(View.GONE);
                            pandalasabazooka.setVisibility(View.GONE);
                            //
                            sub1.setVisibility(View.GONE);
                            sub2.setVisibility(View.GONE);
                            rocketing.setVisibility(View.GONE);
                            bazookwshield.setVisibility(View.GONE);
                            ibangshield.setVisibility(View.GONE);
                            hologramshield.setVisibility(View.GONE);
                            hologramming.setVisibility(View.GONE);
                            dronee.setVisibility(View.GONE);
                            bazlevel.setVisibility(View.GONE);
                            levelin.setVisibility(View.GONE);
                            pandalasahologrammer.setVisibility(View.GONE);
                            pandalasadrone.setVisibility(View.GONE);


                            guard.setOnItemSelectedListener(
                                    new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            gard=guard.getSelectedItem().toString();

                                            if (gard.equals("UltraShield (+150 HP)")){
                                                ibangshield.setVisibility(View.VISIBLE);
                                                crossbow.setVisibility(View.GONE);
                                                pandalasaibangshield.setVisibility(View.VISIBLE);
                                                bazooka.setVisibility(View.GONE);
                                                title.setVisibility(View.GONE);
                                                hologramshield.setVisibility(View.GONE);
                                                pandalasaholoshield.setVisibility(View.GONE);
                                                heroName.setVisibility(View.VISIBLE);
                                                bazlevel.setVisibility(View.GONE);
                                                title.setVisibility(View.GONE);
                                                crossbow.setVisibility(View.GONE);
                                                sniper.setVisibility(View.GONE);
                                                medic.setVisibility(View.GONE);
                                                guard.setVisibility(View.VISIBLE);
                                                vanguard.setVisibility(View.GONE);
                                                caster.setVisibility(View.GONE);
                                                levelin.setVisibility(View.GONE);
                                                pangadalasacross.setVisibility(View.GONE);
                                                pandalasabazooka.setVisibility(View.GONE);
                                                //Medic
                                                pandalasahologrammer.setVisibility(View.GONE);
                                                pandalasadrone.setVisibility(View.GONE);
                                                hologramming.setVisibility(View.GONE);
                                                dronee.setVisibility(View.GONE);
                                                //Guard

                                                pandalasaholoshield.setVisibility(View.GONE);
                                                hologramshield.setVisibility(View.GONE);
                                                //Vanguard
                                                pandalasasarocket.setVisibility(View.GONE);
                                                pandalasarocketwitdef.setVisibility(View.GONE);
                                                rocketing.setVisibility(View.GONE);
                                                bazookwshield.setVisibility(View.GONE);
                                                //Caster
                                                pandalasasubs1.setVisibility(View.GONE);
                                                pandalasubs2.setVisibility(View.GONE);
                                                sub1.setVisibility(View.GONE);
                                                sub2.setVisibility(View.GONE);
                                                dipleh.setImageResource(R.drawable.prevguard2);
                                                pandalasaibangshield.setOnClickListener(
                                                        new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                oshield = Integer.valueOf(ibangshield.getText().toString());
                                                                gard = guard.getSelectedItem().toString();
                                                                hclass = heroClass.getSelectedItem().toString();
                                                                dipleh.setImageResource(R.drawable.prevguard2);

                                                                if (oshield>=1 && oshield<=50) {

                                                                    Intent owltra = new Intent(MainActivity.this, HeroDisplay.class);

                                                                    owltra.putExtra("ulevel", oshield);
                                                                    owltra.putExtra("mweync", gard);
                                                                    owltra.putExtra("subcd", hclass);
                                                                    owltra.putExtra("indic", 5);
                                                                    startActivity(owltra);
                                                                }
                                                                else{
                                                                    Toast.makeText(getApplicationContext(),"Enter numbers between 1-50 only",Toast.LENGTH_SHORT).show();
                                                                }


                                                            }
                                                        }
                                                );


                                            }

                                            else if(gard.equals("HoloShield (-150 HP, +50 Agi)")){
                                                hologramshield.setVisibility(View.VISIBLE);
                                                bazooka.setVisibility(View.GONE);
                                                pandalasaholoshield.setVisibility(View.VISIBLE);
                                                pandalasaibangshield.setVisibility(View.GONE);

                                                crossbow.setVisibility(View.GONE);
                                                title.setVisibility(View.GONE);
                                                pandalasaibangshield.setVisibility(View.GONE);
                                                ibangshield.setVisibility(View.GONE);
                                                heroName.setVisibility(View.VISIBLE);
                                                hologramshield.setVisibility(View.VISIBLE);
                                                bazlevel.setVisibility(View.GONE);
                                                title.setVisibility(View.GONE);
                                                crossbow.setVisibility(View.GONE);
                                                sniper.setVisibility(View.GONE);
                                                medic.setVisibility(View.GONE);
                                                guard.setVisibility(View.VISIBLE);
                                                vanguard.setVisibility(View.GONE);
                                                caster.setVisibility(View.GONE);
                                                levelin.setVisibility(View.GONE);
                                                pangadalasacross.setVisibility(View.GONE);
                                                pandalasabazooka.setVisibility(View.GONE);
                                                //Medic
                                                pandalasahologrammer.setVisibility(View.GONE);
                                                pandalasadrone.setVisibility(View.GONE);
                                                hologramming.setVisibility(View.GONE);
                                                dronee.setVisibility(View.GONE);
                                                //Guard

                                                //Vanguard
                                                pandalasasarocket.setVisibility(View.GONE);
                                                pandalasarocketwitdef.setVisibility(View.GONE);
                                                rocketing.setVisibility(View.GONE);
                                                bazookwshield.setVisibility(View.GONE);
                                                //Caster
                                                pandalasasubs1.setVisibility(View.GONE);
                                                pandalasubs2.setVisibility(View.GONE);
                                                sub1.setVisibility(View.GONE);
                                                sub2.setVisibility(View.GONE);
                                                dipleh.setImageResource(R.drawable.prevguard3);

                                                pandalasaholoshield.setOnClickListener(
                                                        new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                holoshield = Integer.valueOf(hologramshield.getText().toString());
                                                                gard = guard.getSelectedItem().toString();
                                                                hclass = heroClass.getSelectedItem().toString();

                                                                if (holoshield>=1 && holoshield <=50) {
                                                                    Intent owltra = new Intent(MainActivity.this, HeroDisplay.class);

                                                                    owltra.putExtra("hlevel", holoshield);
                                                                    owltra.putExtra("mehn", gard);
                                                                    owltra.putExtra("seyb", hclass);
                                                                    owltra.putExtra("indic", 6);
                                                                    startActivity(owltra);
                                                                }
                                                                else{
                                                                    Toast.makeText(getApplicationContext(),"Enter numbers between 1-50 only",Toast.LENGTH_SHORT).show();
                                                                }


                                                            }
                                                        }
                                                );





                                            }
                                            else if (gard.equals("Select a Skin")){
                                                levelin.setVisibility(View.GONE);
                                                bazooka.setVisibility(View.GONE);
                                                pangadalasacross.setVisibility(View.GONE);
                                                crossbow.setVisibility(View.GONE);
                                                title.setVisibility(View.GONE);





                                            }

                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    }
                            );

                        }

                        else if (hclass.equals("Vanguard")){
                            sniper.setVisibility(View.GONE);
                            medic.setVisibility(View.GONE);
                            guard.setVisibility(View.GONE);
                            vanguard.setVisibility(View.VISIBLE);
                            caster.setVisibility(View.GONE);
                            levelin.setVisibility(View.GONE);
                            pandalasasubs1.setVisibility(View.GONE);
                            pandalasubs2.setVisibility(View.GONE);
                            pangadalasacross.setVisibility(View.GONE);
                            heroName.setVisibility(View.VISIBLE);
                            heroName.setText("Amias");
                            title.setVisibility(View.GONE);
                            sub1.setVisibility(View.GONE);
                            sub2.setVisibility(View.GONE);
                            ibangshield.setVisibility(View.GONE);
                            hologramshield.setVisibility(View.GONE);
                            hologramming.setVisibility(View.GONE);
                            dronee.setVisibility(View.GONE);
                            bazlevel.setVisibility(View.GONE);
                            levelin.setVisibility(View.GONE);
                            dipleh.setVisibility(View.VISIBLE);
                            pandalasaibangshield.setVisibility(View.GONE);
                            pandalasaholoshield.setVisibility(View.GONE);
                            dipleh.setImageResource(R.drawable.prevvanguard);
                            pandalasasubs1.setVisibility(View.GONE);
                            pandalasubs2.setVisibility(View.GONE);
                            sub1.setVisibility(View.GONE);
                            sub2.setVisibility(View.GONE);
                            pandalasahologrammer.setVisibility(View.GONE);
                            pandalasadrone.setVisibility(View.GONE);
                            hologramming.setVisibility(View.GONE);
                            dronee.setVisibility(View.GONE);
                            pandalasahologrammer.setVisibility(View.GONE);
                            pandalasadrone.setVisibility(View.GONE);
                            hologramming.setVisibility(View.GONE);
                            dronee.setVisibility(View.GONE);
                            pandalasaholoshield.setVisibility(View.GONE);
                            pandalasaibangshield.setVisibility(View.GONE);
                            pangadalasacross.setVisibility(View.GONE);
                            pandalasabazooka.setVisibility(View.GONE);
                            pandalasahologrammer.setVisibility(View.GONE);
                            pandalasadrone.setVisibility(View.GONE);


                            vanguard.setOnItemSelectedListener(
                                    new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            bangard=vanguard.getSelectedItem().toString();

                                            if (bangard.equals("Rocket Bot (+60 Agi)")){
                                                rocketing.setVisibility(View.VISIBLE);
                                                crossbow.setVisibility(View.GONE);
                                                pandalasasarocket.setVisibility(View.VISIBLE);
                                                bazooka.setVisibility(View.GONE);
                                                title.setVisibility(View.GONE);
                                                pandalasarocketwitdef.setVisibility(View.GONE);
                                                bazookwshield.setVisibility(View.GONE);
                                                dipleh.setImageResource(R.drawable.prevvanguard2);
                                                pandalasasarocket.setOnClickListener(
                                                        new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                rocks = Integer.valueOf(rocketing.getText().toString());
                                                                bangard= vanguard.getSelectedItem().toString();
                                                                hclass = heroClass.getSelectedItem().toString();

                                                                if (rocks>=1 && rocks<=50) {
                                                                    Intent ban = new Intent(MainActivity.this, HeroDisplay.class);

                                                                    ban.putExtra("rlevel", rocks);
                                                                    ban.putExtra("rmehn", bangard);
                                                                    ban.putExtra("rsub", hclass);
                                                                    ban.putExtra("indic", 7);
                                                                    startActivity(ban);
                                                                }
                                                                else{
                                                                    Toast.makeText(getApplicationContext(),"Enter numbers between 1-50 only",Toast.LENGTH_SHORT).show();
                                                                }

                                                            }
                                                        }
                                                );


                                            }

                                            else if(bangard.equals("Ultra Destruction (+270 P.Atk, -60 Agi)")){
                                                bazookwshield.setVisibility(View.VISIBLE);
                                                rocketing.setVisibility(View.GONE);
                                                bazooka.setVisibility(View.GONE);
                                                pandalasarocketwitdef.setVisibility(View.VISIBLE);
                                                pandalasasarocket.setVisibility(View.GONE);
                                                crossbow.setVisibility(View.GONE);
                                                title.setVisibility(View.GONE);
                                                dipleh.setImageResource(R.drawable.prevvanguard3);

                                                pandalasarocketwitdef.setOnClickListener(
                                                        new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                defbaz = Integer.valueOf(bazookwshield.getText().toString());
                                                                bangard= vanguard.getSelectedItem().toString();
                                                                hclass = heroClass.getSelectedItem().toString();

                                                                if (defbaz>=1 && defbaz<=50) {

                                                                    Intent ban = new Intent(MainActivity.this, HeroDisplay.class);

                                                                    ban.putExtra("dlevel", defbaz);
                                                                    ban.putExtra("dmen", bangard);
                                                                    ban.putExtra("dsub", hclass);
                                                                    ban.putExtra("indic", 8);
                                                                    startActivity(ban);
                                                                }
                                                                else {
                                                                    Toast.makeText(getApplicationContext(),"Enter numbers between 1-50 only",Toast.LENGTH_SHORT).show();
                                                                }
                                                            }
                                                        }
                                                );




                                            }
                                            else if (bangard.equals("Select a Skin")){
                                                levelin.setVisibility(View.GONE);
                                                bazooka.setVisibility(View.GONE);
                                                pangadalasacross.setVisibility(View.GONE);
                                                crossbow.setVisibility(View.GONE);
                                                title.setVisibility(View.GONE);





                                            }

                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    }
                            );

                        }
                        else if (hclass.equals("Caster")){
                            sniper.setVisibility(View.GONE);
                            medic.setVisibility(View.GONE);
                            guard.setVisibility(View.GONE);
                            pandalasasarocket.setVisibility(View.GONE);
                            pandalasarocketwitdef.setVisibility(View.GONE);
                            vanguard.setVisibility(View.GONE);
                            caster.setVisibility(View.VISIBLE);
                            levelin.setVisibility(View.GONE);
                            pangadalasacross.setVisibility(View.GONE);
                            heroName.setVisibility(View.VISIBLE);
                            heroName.setText("Erzil");
                            title.setVisibility(View.GONE);
                            rocketing.setVisibility(View.GONE);
                            bazookwshield.setVisibility(View.GONE);
                            ibangshield.setVisibility(View.GONE);
                            hologramshield.setVisibility(View.GONE);
                            pandalasaibangshield.setVisibility(View.GONE);
                            pandalasaholoshield.setVisibility(View.GONE);
                            hologramming.setVisibility(View.GONE);
                            dronee.setVisibility(View.GONE);
                            bazlevel.setVisibility(View.GONE);
                            dipleh.setVisibility(View.VISIBLE);
                            pandalasaholoshield.setVisibility(View.GONE);
                            hologramshield.setVisibility(View.GONE);
                            //Vanguard
                            pandalasasarocket.setVisibility(View.GONE);
                            pandalasarocketwitdef.setVisibility(View.GONE);
                            rocketing.setVisibility(View.GONE);
                            bazookwshield.setVisibility(View.GONE);
                            pandalasaholoshield.setVisibility(View.GONE);
                            pandalasaibangshield.setVisibility(View.GONE);
                            pangadalasacross.setVisibility(View.GONE);
                            pandalasabazooka.setVisibility(View.GONE);
                            pandalasahologrammer.setVisibility(View.GONE);
                            pandalasadrone.setVisibility(View.GONE);




                            dipleh.setImageResource(R.drawable.prevcaster);

                            caster.setOnItemSelectedListener(
                                    new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                            castering=caster.getSelectedItem().toString();

                                            if (castering.equals("Modern Caster (+30 Agi)")){
                                                sub2.setVisibility(View.VISIBLE);
                                                sub1.setVisibility(View.GONE);
                                                crossbow.setVisibility(View.GONE);
                                                pandalasasubs1.setVisibility(View.VISIBLE);
                                                bazooka.setVisibility(View.GONE);
                                                title.setVisibility(View.GONE);
                                                dipleh.setImageResource(R.drawable.prevcaster2);
                                                pandalasasubs1.setOnClickListener(

                                                        new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                casa1 = Integer.valueOf(sub2.getText().toString());
                                                                castering= caster.getSelectedItem().toString();
                                                                hclass = heroClass.getSelectedItem().toString();

                                                                if (casa1>=1 && casa1<=50) {
                                                                    Intent ban = new Intent(MainActivity.this, HeroDisplay.class);

                                                                    ban.putExtra("clevel", casa1);
                                                                    ban.putExtra("cmehn", bangard);
                                                                    ban.putExtra("csub", hclass);
                                                                    ban.putExtra("indic", 9);

                                                                    startActivity(ban);
                                                                }
                                                                else{
                                                                    Toast.makeText(getApplicationContext(),"Enter numbers between 1-50 only",Toast.LENGTH_SHORT).show();
                                                                }
                                                            }
                                                        }
                                                );


                                            }

                                            else if(castering.equals("Ultra Suit (+100 M.Atk, +150 P.Def)")){
                                                sub1.setVisibility(View.VISIBLE);
                                                sub2.setVisibility(View.GONE);
                                                bazooka.setVisibility(View.GONE);
                                                pandalasubs2.setVisibility(View.VISIBLE);
                                                crossbow.setVisibility(View.GONE);
                                                title.setVisibility(View.GONE);
                                                dipleh.setImageResource(R.drawable.prevcaster3);
                                                pandalasubs2.setOnClickListener(
                                                        new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                casa2 = Integer.valueOf(sub1.getText().toString());
                                                                castering= caster.getSelectedItem().toString();
                                                                hclass = heroClass.getSelectedItem().toString();
                                                                if (casa2>=1 && casa2<=50) {

                                                                    Intent ban = new Intent(MainActivity.this, HeroDisplay.class);

                                                                    ban.putExtra("clevell", casa2);
                                                                    ban.putExtra("cmehnn", castering);
                                                                    ban.putExtra("csubb", hclass);
                                                                    ban.putExtra("indic", 10);
                                                                    startActivity(ban);
                                                                }
                                                                else{
                                                                    Toast.makeText(getApplicationContext(),"Enter numbers between 1-50 only",Toast.LENGTH_SHORT).show();
                                                                }
                                                            }
                                                        }
                                                );





                                            }
                                            else if (castering.equals("Select a Skin")){
                                                levelin.setVisibility(View.GONE);
                                                bazooka.setVisibility(View.GONE);
                                                pangadalasacross.setVisibility(View.GONE);
                                                crossbow.setVisibility(View.GONE);
                                                title.setVisibility(View.GONE);





                                            }

                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> parent) {

                                        }
                                    }
                            );

                        }


                        }





                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );
//gerome
//penalosa


    }


}
