package mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Monsters daly = new Monsters(1,
                20,
                0,
                0,
                0,
                30,
                30,
                "Monster Daly"
                );
        daly.getHpoints();
        daly.getMatk();
        daly.getMdef();
        daly.getMpoints();
        daly.getPatk();
        daly.getPdef();



        Hero lixa = new Hero(0,
                100,
                150,
                130,
                0,
                500,
                450,
                "Tank",
                0,
                70,
                10,
                6,
                3,
                1,
                4);

        lixa.getMatk();
        lixa.getPatk();
        lixa.getHpoints();
        lixa.getPdef();
        lixa.getMdef();
        lixa.getExp();
        lixa.getBaseagi();
        lixa.getBaseintel();
        lixa.getBasetre();
        lixa.getAgiGrowth();
        lixa.getStrGrowth();
        lixa.getIntgrowth();


    }


}
