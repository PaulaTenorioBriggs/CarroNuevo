package com.example.perfume.CarroPefume;
import java.util.ArrayList;
import java.util.List;
import  com.example.perfume.CarroPefume.R;
import com.example.perfume.CarroPefume.Fragment_Producto;
import  com.example.perfume.CarroPefume.Producto;

public class Producto {

    private String productos;
    private String precio;
    private int idDrawable;


    public Producto(int id_producto, String productos, String precio, int idDrawable) {

        this.productos = productos;
        this.precio = precio;
        this.idDrawable = idDrawable;
    }

    public static final List<Producto> CatalogoPerfume = new ArrayList<Producto>();


 static {
       CatalogoPerfume.add(new Producto (1,"angel","30",R.drawable.angel));
        CatalogoPerfume.add(new Producto(3, "angelOnly","20", R.drawable.angelOnly));
        CatalogoPerfume.add(new Producto(1, "beyond",  "30", R.drawable.beyond));
        CatalogoPerfume.add(new Producto(67, "bom",  "50", R.drawable.bom));


    }


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

