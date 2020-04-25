package com.example.personalphotoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Integer[] family = {R.drawable.dad, R.drawable.mom, R.drawable.alex, R.drawable.elaina,
            R.drawable.jasmine, R.drawable.aunt, R.drawable.uncle, R.drawable.ben};
    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView grid = (GridView) findViewById(R.id.gridView);
        final ImageView pic = (ImageView) findViewById(R.id.imgLarge);
        grid.setAdapter(new ImageAdapter(this));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(getBaseContext(), "Dad", Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Toast.makeText(getBaseContext(), "Mom", Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        Toast.makeText(getBaseContext(), "Brother Alex", Toast.LENGTH_SHORT).show();
                        break;

                    case 3:
                        Toast.makeText(getBaseContext(), "Sister Elaina", Toast.LENGTH_SHORT).show();
                        break;

                    case 4:
                        Toast.makeText(getBaseContext(), "Cousin Jasmine", Toast.LENGTH_SHORT).show();
                        break;

                    case 5:
                        Toast.makeText(getBaseContext(), "Aunt Lynn", Toast.LENGTH_SHORT).show();
                        break;

                    case 6:
                        Toast.makeText(getBaseContext(), "Uncle Jack", Toast.LENGTH_SHORT).show();
                        break;

                    case 7:
                        Toast.makeText(getBaseContext(), "Cousin Ben", Toast.LENGTH_SHORT).show();
                        break;
                }

                pic.setImageResource(family[position]);

            }
        });

    }

    public class ImageAdapter extends BaseAdapter {
        private Context context;

        public ImageAdapter(Context c) {
            context = c;

        }

        @Override
        public int getCount() {

            return family.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            pic = new ImageView(context);
            pic.setImageResource(family[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(330, 300));

            return pic;
        }
    }
}
