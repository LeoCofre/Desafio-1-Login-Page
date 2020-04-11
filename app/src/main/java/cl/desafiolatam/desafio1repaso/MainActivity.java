package cl.desafiolatam.desafio1repaso;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        Picasso.get().load("http://blog.desafiolatam.com/wp-content/uploads/2019/02/logo.png").into(imageView);
        Button btnAcceso = findViewById(R.id.button);
        btnAcceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Usuario Ingresado con exito", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
