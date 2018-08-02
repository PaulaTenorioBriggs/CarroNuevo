package com.example.perfume.CarroPefume;
import java.util.ArrayList;
import java.util.List;



public class Producto {
    private String id_producto;
    private String producto;
    private String  imagenPath;
    private String precio;

    public Producto(String id_producto, String producto, String imagenPath, String precio) {
        this.id_producto = id_producto;
        this.producto = producto;
        this.imagenPath = imagenPath;
        this.precio = precio;


    }

    public static final List<Producto> Perfumes = new ArrayList<Producto>();
    public static final List<Producto>  Victoriaecret = new ArrayList<>();








    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getImagenPath() {
        return imagenPath;
    }

    public void setImagenPath(String imagenPath) {
        this.imagenPath = imagenPath;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
