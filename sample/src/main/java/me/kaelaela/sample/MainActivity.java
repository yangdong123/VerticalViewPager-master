package me.kaelaela.sample;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("");
        initViewPager();
    }

    private void initViewPager() {
      List listViews = new ArrayList<View>();
        for (int i = 0; i < 5; i++) {
            View view = LayoutInflater.from(getApplicationContext()).inflate(
                    R.layout.viewpager_item, null);
            TextView title = (TextView) view.findViewById(R.id.tv_number);
            title.setText(i+"");
            listViews.add(view);
        }
        DirectionalViewPager viewPager = (DirectionalViewPager) findViewById(R.id.vertical_viewpager);
        //viewPager.setPageTransformer(false, new ZoomOutTransformer());
        //viewPager.setPageTransformer(true, new StackTransformer());

        ViewPagerAdapter  adapter = new ViewPagerAdapter(listViews);
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//                Log.e("yd" , "  position  == " + position);

            }

            @Override
            public void onPageSelected(int position) {
//                Log.e("yd" , "  position  == " + position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
