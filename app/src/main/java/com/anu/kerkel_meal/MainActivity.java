package com.anu.kerkel_meal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    TabItem mmenu, mabout;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtoolbar=findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);
        mmenu=findViewById(R.id.menu);
        mabout=findViewById(R.id.about);

        ViewPager viewPager =
                findViewById(R.id.fragmentcontainer);
        tabLayout=findViewById(R.id.include);
        pagerAdapter = new PagerAdapter(this.getSupportFragmentManager(), 2);
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new
                                                   TabLayout.OnTabSelectedListener() {
                                                       @Override
                                                       public void onTabSelected(TabLayout.Tab tab) {
                                                           viewPager.setCurrentItem(tab.getPosition());

                                                           if(tab.getPosition()==0||tab.getPosition()==1)
                                                           {
                                                               pagerAdapter.notifyDataSetChanged();
                                                           }
                                                       }
                                                       @Override
                                                       public void onTabUnselected(TabLayout.Tab tab) {
                                                       }
                                                       @Override
                                                       public void onTabReselected(TabLayout.Tab tab) {
                                                       }
                                                   });
    }

}
