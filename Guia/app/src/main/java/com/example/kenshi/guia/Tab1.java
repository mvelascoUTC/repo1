package com.example.kenshi.guia;

/**
 * Created by Kenshi on 26/10/2016.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;

public class Tab1 extends  Fragment{
@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
View rootview = inflater.inflate(R.layout.tab1, container,false);
    return rootview;
    }
}
