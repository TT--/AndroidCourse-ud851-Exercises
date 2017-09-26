package com.example.android.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by TT 2017-09
 *
 // TODO x (12) Create a class called NumberViewHolder that extends RecyclerView.ViewHolder
 // TODO x (13) Within NumberViewHolder, create a TextView variable called listItemNumberView

 // TODO x (14) Create a constructor for NumberViewHolder that accepts a View called itemView as a parameter
 // TODO x (15) Within the constructor, call super(itemView) and then find listItemNumberView by ID

 // TODO x (16) Within the NumberViewHolder class, create a void method called bind that accepts an int parameter called listIndex
 // TODO x (17) Within bind, set the text of listItemNumberView to the listIndex
 // TODO x (18) Be careful to get the String representation of listIndex, as using setText with an int does something different

 */

public class NumberViewHolder extends RecyclerView.ViewHolder {

    TextView listItemNumberView;

    public NumberViewHolder(View itemView) {
        super(itemView);
        listItemNumberView = (TextView) itemView.findViewById(R.id.tv_item_number);
    }

    public void bind(int listIndex){
        listItemNumberView.setText(Integer.toString(listIndex));
    }

}
