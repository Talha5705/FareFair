package com.tview.talhazubaer.farefair;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    ImageView flag;
    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mToolbar = (Toolbar) findViewById(R.id.toolbar1);

        flag = (ImageView) findViewById(R.id.imageView);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            mToolbar.setTitle(bundle.getString("countryNames"));
            if (mToolbar.getTitle().toString().equalsIgnoreCase("Thikana")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.thikana));
            }

            else if (mToolbar.getTitle().toString().equalsIgnoreCase("36 No")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_b));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Moumita")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_c));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("D-Link")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.dlink));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Trans Silva")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.trans));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Mirpur Link")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.mirpur));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Bihonga")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.bihanga));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Ashirbad")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.ashirbad));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Malancha")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.malancha));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Bikash Paribohan")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.bikash));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Bikolpo")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.bikolpo));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Safety")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.safety));
            }else if (mToolbar.getTitle().toString().equalsIgnoreCase("CityBus")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_spain));
            }
            else if (mToolbar.getTitle().toString().equalsIgnoreCase("MTCL")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.mtcl));
            }
            else if (mToolbar.getTitle().toString().equalsIgnoreCase("FTCL")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.ftcl));
            }


            else if (mToolbar.getTitle().toString().equalsIgnoreCase("Agradut")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.agradut));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Airport Bangabandhu Avenue")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.airport));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Achim Paribahan")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.achim));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Active Paribohan")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.active));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Akik Paribahan")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.akik));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Himachal")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.himachal));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Alif Enterprise")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.alif));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Asmani Paribahan")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.asmani));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("BRTC 3")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.brtc));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Balaka")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.balaka));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Basumati Transport")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.basumati));
            }else if (mToolbar.getTitle().toString().equalsIgnoreCase("Champion")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.champion));
            }
            else if (mToolbar.getTitle().toString().equalsIgnoreCase("ETC Paribahan")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.etc));
            }
            else if (mToolbar.getTitle().toString().equalsIgnoreCase("Doyel Paribahan")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.doyel));
            }
            else if (mToolbar.getTitle().toString().equalsIgnoreCase("Falgun")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.falgun));
            }
            else if (mToolbar.getTitle().toString().equalsIgnoreCase("Dipon")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.dipon));
            }
            else if (mToolbar.getTitle().toString().equalsIgnoreCase("Galaxy Line")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.galaxy));
            }
            else if (mToolbar.getTitle().toString().equalsIgnoreCase("Grameen")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.grameen));
            }
        }



    }
}
