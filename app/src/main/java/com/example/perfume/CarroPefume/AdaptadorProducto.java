package com.example.perfume.CarroPefume;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

import  com.example.perfume.CarroPefume.AdaptadorProducto;




public class AdaptadorProducto  extends RecyclerView.Adapter<AdaptadorProducto.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public TextView productos;
        public TextView precio;
        public ImageView imagen;

        public ViewHolder(View v) {
            super(v);
            productos = (TextView) v.findViewById(R.id.miniatura_perfume);
            precio = (TextView) v.findViewById(R.id.precio_perfume);
            imagen = (ImageView) v.findViewById(R.id.producto_perfume);
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_lista_inicio, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
       Producto item = Producto.CatalogoPerfume.get(i);

       Glide.with(viewHolder.itemView.getContext())
                .load(item.getIdDrawable())
                .centerCrop()
                .into(viewHolder.imagen);
        viewHolder.productos.setText(item.getProductos());
        viewHolder.precio.setText("$" + item.getPrecio());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}


