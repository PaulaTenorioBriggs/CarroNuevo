package com.example.perfume.CarroPefume;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.perfume.CarroPefume.R;


public class Fragment_Producto extends Fragment {

    private RecyclerView reciclador;
    private LinearLayoutManager layoutManager;
    private AdaptadorProducto adaptador;

    public Fragment_Producto() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment__producto, container, false);

        reciclador = (RecyclerView) view.findViewById(R.id.reciclador);
        layoutManager = new LinearLayoutManager(getActivity());
        reciclador.setLayoutManager(layoutManager);

        adaptador = new AdaptadorProducto();
        reciclador.setAdapter(adaptador);
        return view;
    }





















}
