package com.example.prac_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Пример использования ресурсов строк
        String welcomeMessage = getResources().getString(R.string.welcome_message);

        // Пример использования форматирования строк
        String formattedString = String.format("Hello, %s!", "World");

        // Пример использования ресурса Plurals
        int numberOfItems = 5;
        String quantityString = getResources().getQuantityString(R.plurals.numberOfItems, numberOfItems, numberOfItems);

        // Пример использования ресурса string array
        String[] fruitsArray = getResources().getStringArray(R.array.fruits);

        // Пример использования ресурса dimension
        float buttonMargin = getResources().getDimension(R.dimen.button_margin);

        // Пример использования ресурса Color
        int primaryColor = ContextCompat.getColor(this, R.color.primary_color);

        // Пример использования элемента ImageView и папки res/drawables
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.my_image));

        // Пример загрузки изображения из папки assets в Android на Java
        try {
            InputStream inputStream = getAssets().open("my_image.png");
            Drawable drawable = Drawable.createFromStream(inputStream, null);
            imageView.setImageDrawable(drawable);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
