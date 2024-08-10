package com.example.monapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {
    private TextView titleTextView;
    private TextView categoryTextView;
    private TextView priceTextView;
    private TextView descriptionTextView;
    private TextView publicationDateTextView;
    private ImageView imageView;
    private Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        titleTextView = (TextView) findViewById(R.id.activity_detail_title_textview);
        categoryTextView = (TextView) findViewById(R.id.activity_detail_category_textview);
        priceTextView = (TextView) findViewById(R.id.activity_detail_price_textview);
        descriptionTextView = (TextView) findViewById(R.id.activity_detail_description_textview);
        publicationDateTextView = (TextView) findViewById(R.id.activity_detail_publicationdate_textview);
        imageView = (ImageView) findViewById(R.id.activity_detail_image_imageview);
        returnButton = (Button) findViewById(R.id.activity_detail_return_button);

        Intent intent = getIntent();
        String name = intent.getStringExtra("KEY_NAME");
        int age = intent.getIntExtra("KEY_AGE", 0);

        // Use the data (e.g., display it in a TextView)
        titleTextView.setText(intent.getStringExtra("KEY_TITLE"));
        categoryTextView.setText(intent.getStringExtra("KEY_CATEGORY"));
        priceTextView.setText(intent.getStringExtra("KEY_PRICE"));
        descriptionTextView.setText(intent.getStringExtra("KEY_DESCRIPTION"));
        publicationDateTextView.setText(intent.getStringExtra("KEY_PUBLICATION_DATE"));

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked

                Intent homeActivity = new Intent(DetailActivity.this, HomeActivity.class);
                startActivity(homeActivity);
            }
        });
    }
}