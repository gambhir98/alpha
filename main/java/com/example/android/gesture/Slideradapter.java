package com.example.android.gesture;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Slideradapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    // list of images
    public int[] lst_images = {
            R.drawable.apple,
            R.drawable.boy,
            R.drawable.cat,
            R.drawable.dog,
            R.drawable.elephant,
            R.drawable.fish,
            R.drawable.girl,
            R.drawable.hen,
            R.drawable.icecream,
            R.drawable.jug,
            R.drawable.kite,
            R.drawable.lion,
            R.drawable.mango,
            R.drawable.nest,
            R.drawable.owl,
            R.drawable.parrot,
            R.drawable.queen,R.drawable.rat,R.drawable.ship,R.drawable.tiger,R.drawable.umbrella,R.drawable.van,
            R.drawable.watch,R.drawable.xmas,R.drawable.yacht,R.drawable.zebra


    };
    // list of titles
    public String[] lst_title = {
            "A",
            "B",
            "C",
            "D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"
    };
    // list of descriptions
    public String[] lst_description = {
           "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    // list of background colors
   /* public int[] lst_backgroundcolor = {
            Color.rgb(55, 55, 55),
            Color.rgb(239, 85, 85),
            Color.rgb(110, 49, 89),
            Color.rgb(1, 188, 212)
    };*/


    public Slideradapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide_layout, container, false);
        ConstraintLayout layoutslide = (ConstraintLayout) view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView) view.findViewById(R.id.slideimg);
        TextView txttitle = (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView) view.findViewById(R.id.txtdescription);
       // layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_title[position]);
        description.setText(lst_description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}