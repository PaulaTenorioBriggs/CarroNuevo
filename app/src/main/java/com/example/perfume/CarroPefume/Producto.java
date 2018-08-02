package com.example.perfume.CarroPefume;
import java.util.ArrayList;
import java.util.List;
import  com.example.perfume.CarroPefume.R;
import com.example.perfume.CarroPefume.Fragment_Producto;
import  com.example.perfume.CarroPefume.Producto;

public class Producto {
    private int id_producto;
    private String productos;
    private String precio;
    private int idDrawable;


    public Producto(int id_producto, String productos, String precio, int idDrawable) {

        this.id_producto =id_producto;
        this.productos = productos;
        this.precio = precio;
        this.idDrawable = idDrawable;
    }

    public static final List<Producto> CatalogoPerfume = new ArrayList<Producto>();


 static {
       CatalogoPerfume.add(new Producto (1,"tease","30",R.drawable.tease));
        CatalogoPerfume.add(new Producto(3, "angelOnly","20", R.drawable.angelonly));
        CatalogoPerfume.add(new Producto(1, "beyond",  "30", R.drawable.beyond));
        CatalogoPerfume.add(new Producto(67, "bom",  "50", R.drawable.bom));


    }

    public int  getId_producto(){return id_producto;}

    public String getProductos() {
        return productos;
    }



    public String getPrecio() {
        return precio;
    }



    public int getIdDrawable() {
        return idDrawable;
    }


}

