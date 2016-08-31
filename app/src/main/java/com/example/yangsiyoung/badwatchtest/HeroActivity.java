package com.example.yangsiyoung.badwatchtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import butterknife.Bind;
import butterknife.ButterKnife;

public class HeroActivity extends AppCompatActivity {

    @Bind(R.id.btnShowRank)
    Button btnShowRank;

    @Bind(R.id.btnShowQuick)
    Button btnShowQuick;

    @Bind(R.id.btnCloseHeroActivity)
    ImageButton btnCloseHeroActivity;

    private String overWatchId;

    Intent intent;

    public static final String url = "http://bad.watch/api/heros/";

    private String gameType = "quick";

    private String hero = "";

    @Bind(R.id.btnShowRecordForAna)
    ImageButton btnShowRecordForAna;

    @Bind(R.id.btnShowRecordForBastion)
    ImageButton btnShowRecordForBastion;

    @Bind(R.id.btnShowRecordForDva)
    ImageButton btnShowRecordForDva;

    @Bind(R.id.btnShowRecordForGenji)
    ImageButton btnShowRecordForGenji;

    @Bind(R.id.btnShowRecordForHanzo)
    ImageButton btnShowRecordForHanzo;

    @Bind(R.id.btnShowRecordForJunkrat)
    ImageButton btnShowRecordForJunkrat;

    @Bind(R.id.btnShowRecordForLucio)
    ImageButton btnShowRecordForLucio;

    @Bind(R.id.btnShowRecordForTorbjorn)
    ImageButton btnShowRecordForTorbjorn;

    @Bind(R.id.btnShowRecordForMei)
    ImageButton btnShowRecordForMei;

    @Bind(R.id.btnShowRecordForMercy)
    ImageButton btnShowRecordForMercy;

    @Bind(R.id.btnShowRecordForPharah)
    ImageButton btnShowRecordForPharah;

    @Bind(R.id.btnShowRecordForReaper)
    ImageButton btnShowRecordForReaper;

    @Bind(R.id.btnShowRecordForReinhardt)
    ImageButton btnShowRecordForReinhardt;

    @Bind(R.id.btnShowRecordForRoadhog)
    ImageButton btnShowRecordForRoadhog;

    @Bind(R.id.btnShowRecordForSoldier)
    ImageButton btnShowRecordForSoldier;

    @Bind(R.id.btnShowRecordForMccree)
    ImageButton btnShowRecordForMccree;

    @Bind(R.id.btnShowRecordForSymmetra)
    ImageButton btnShowRecordForSymmetra;

    @Bind(R.id.btnShowRecordForTracer)
    ImageButton btnShowRecordForTracer;

    @Bind(R.id.btnShowRecordForWidowmaker)
    ImageButton btnShowRecordForWidowmaker;

    @Bind(R.id.btnShowRecordForWinston)
    ImageButton btnShowRecordForWinston;

    @Bind(R.id.btnShowRecordForZarya)
    ImageButton btnShowRecordForZarya;

    @Bind(R.id.btnShowRecordForZenyatta)
    ImageButton btnShowRecordForZenyatta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);
        ButterKnife.bind(this);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        intent = getIntent();
        overWatchId = intent.getStringExtra("overWatchId");
        btnShowQuick.setSelected(true);

        btnShowRank.setOnClickListener(onClickListener);
        btnShowQuick.setOnClickListener(onClickListener);
        try {
            btnCloseHeroActivity.setOnClickListener(onClickListener);
        }catch(Exception e){
            Log.d("error", "ImageButton OnClickListener Error is " + e.toString());
        }

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch(view.getId()){
                case R.id.btnShowRank:
                    btnShowRank.setSelected(true);
                    btnShowQuick.setSelected(false);
                    gameType = "rank";

                    break;
                case R.id.btnShowQuick:
                    btnShowQuick.setSelected(true);
                    btnShowRank.setSelected(false);
                    gameType = "quick";

                    break;

                case R.id.btnCloseHeroActivity:
                    finish();

                    break;

                case R.id.btnShowRecordForAna:
                    hero = "ana";


                    break;

                case R.id.btnShowRecordForBastion:
                    hero = "bastion";

                    break;

                case R.id.btnShowRecordForDva:
                    hero = "dva";

                    break;

                case R.id.btnShowRecordForGenji:
                    hero = "genji";

                    break;

                case R.id.btnShowRecordForHanzo:
                    hero = "hanzo";

                    break;

                case R.id.btnShowRecordForJunkrat:
                    hero = "junkrat";

                    break;

                case R.id.btnShowRecordForLucio:
                    hero = "lucio";

                    break;

                case R.id.btnShowRecordForMccree:
                    hero = "mccree";

                    break;

                case R.id.btnShowRecordForMei:
                    hero = "mei";

                    break;

                case R.id.btnShowRecordForMercy:
                    hero = "mercy";

                    break;

                case R.id.btnShowRecordForPharah:
                    hero = "pharah";

                    break;

                case R.id.btnShowRecordForReaper:
                    hero = "reaper";

                    break;

                case R.id.btnShowRecordForReinhardt:
                    hero = "reinhardt";

                    break;

                case R.id.btnShowRecordForRoadhog:
                    hero = "roadhog";

                    break;

                case R.id.btnShowRecordForSoldier:
                    hero = "soldier";

                    break;

                case R.id.btnShowRecordForSymmetra:
                    hero = "symmetra";

                    break;

                case R.id.btnShowRecordForTorbjorn:
                    hero = "torbjorn";

                    break;
                case R.id.btnShowRecordForTracer:
                    hero = "tracer";

                    break;

                case R.id.btnShowRecordForWidowmaker:
                    hero = "widowmaker";

                    break;

                case R.id.btnShowRecordForWinston:
                    hero = "winston";

                    break;

                case R.id.btnShowRecordForZarya:
                    hero = "zarya";

                    break;

                case R.id.btnShowRecordForZenyatta:
                    hero = "zenyatta";

                    break;


            }

        }
    };


}
