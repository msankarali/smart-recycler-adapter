package com.example.smartrecycleradapter.viewholder;

/*
 * Created by Manne Öhlund on 04/10/17.
 * Copyright © 2017. All rights reserved.
 */

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.smartrecycleradapter.DemoActivity;
import com.example.smartrecycleradapter.R;

import smartadapter.viewholder.SmartAutoEventViewHolder;

public class PostViewHolder extends SmartAutoEventViewHolder<DemoActivity.Post> {

    TextView title;

    public PostViewHolder(ViewGroup parentView) {
        super(LayoutInflater.from(parentView.getContext()).inflate(R.layout.simple_list_item_more, parentView, false));
        title = itemView.findViewById(android.R.id.text1);
    }

    @Override
    public void bind(DemoActivity.Post mail) {
        title.setText(mail.toString());
    }
}
