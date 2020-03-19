package com.example.hershsheti;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.hershsheti.BNB_Fragments.AndajeFragment;
import com.example.hershsheti.BNB_Fragments.BajarFragment;
import com.example.hershsheti.BNB_Fragments.HomeFragment;
import com.example.hershsheti.BNB_Fragments.ParFragment;
import com.example.hershsheti.BNB_Fragments.SevaDeneGheneFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomView=(BottomNavigationView)findViewById(R.id.bottom_navigation);

        bottomView.setOnNavigationItemSelectedListener(nl);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();

    }
   private BottomNavigationView.OnNavigationItemSelectedListener nl=new BottomNavigationView.OnNavigationItemSelectedListener() {
       @Override
       public boolean onNavigationItemSelected(@NonNull MenuItem item) {

           Fragment selctedFragment=null;

           switch (item.getItemId())
           {
               case R.id.bHome:
                   SelectedFragment(new HomeFragment());
                   break;
               case R.id.bBajar:
                   SelectedFragment(new BajarFragment());
                   break;
               case R.id.bSevaDeneGhene:
                   SelectedFragment(new SevaDeneGheneFragment());
                   break;
               case R.id.bAndaje:
                   SelectedFragment(new AndajeFragment());
                   break;
               case R.id.bPar:
                   SelectedFragment(new ParFragment());
                   break;
           }

           return true;
       }
   };


   private void SelectedFragment(Fragment fragment)
   {
       FragmentManager fm=getSupportFragmentManager();
       FragmentTransaction ft=fm.beginTransaction();
       ft.replace(R.id.fragment_container,fragment).commit();
   }
}
