package com.example.perfume.CarroPefume;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class foto extends Fragment {

    private ImageView iV_imagen;
    static final int REQUEST_IMAGE_CAPTURE=100;
    private Button btnTomarFoto;

  
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_foto);
        iV_imagen = (ImageView) iV_imagen.findViewById();
        btnTomarFoto = (Button) findViewById(R.id.btnTomaFoto);

        btnTomarFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Camerapermission();
                    accesoCamara();
                }catch (Exception ex){
                    Log.v("Error-btn",ex.getMessage());
                }

            }
        });

    }
    private void accesoCamara(){
        Intent TomarFotoIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        if(TomarFotoIntent.resolveActivity(getPackageManager())!=null){
            startActivityForResult(TomarFotoIntent,REQUEST_IMAGE_CAPTURE);
        }
    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK){
            Bundle extra = data.getExtras();
            //Log.v("Error",extra.toString());
            Bitmap imgBitmap = (Bitmap)  extra.get("data") ;
            iV_imagen.setImageBitmap(imgBitmap);
        }
    }

    public static final int MY_PERMISSIONS_REQUEST_CAMERA = 0;
    private void Camerapermission() {
        // Here, thisActivity is the current activity
        if (ContextCompat.checkSelfPermission(foto.this,
                Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(foto.this,
                    Manifest.permission.CAMERA)) {

                // Show an expanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

            } else {

                // No explanation needed, we can request the permission.

                ActivityCompat.requestPermissions(foto.this,
                        new String[]{Manifest.permission.CAMERA},
                        MY_PERMISSIONS_REQUEST_CAMERA);

                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
            }
        }
    }


    public void setContentView(int contentView) {
        this.contentView = contentView;
    }
}
