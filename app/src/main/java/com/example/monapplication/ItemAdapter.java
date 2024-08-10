package com.example.monapplication;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private Context context;
    private List<Item> itemList;

    public ItemAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = itemList.get(position);

        holder.titleTextView.setText(item.getTitle());
        holder.categoryTextView.setText(item.getCategory());
        holder.priceTextView.setText(String.valueOf(item.getPrice()));
        holder.descriptionTextView.setText(item.getDescription());
        holder.publicationDateTextView.setText(item.getPublicationDate());
        // Picasso.get().load(item.getImage()).into(holder.imageView); // Use Picasso or Glide for image loading

        Intent detailActivity = new Intent(context, DetailActivity.class);

        detailActivity.putExtra("KEY_TITLE", item.getTitle());
        detailActivity.putExtra("KEY_CATEGORY", item.getCategory());
        detailActivity.putExtra("KEY_PRICE", String.valueOf(item.getPrice()));
        detailActivity.putExtra("KEY_DESCRIPTION", item.getDescription());
        detailActivity.putExtra("KEY_PUBLICATION_DATE", item.getPublicationDate());
        detailActivity.putExtra("KEY_IMAGE", item.getImage());

        holder.titleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(detailActivity);
            }
        });

        holder.categoryTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(detailActivity);
            }
        });

        holder.priceTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(detailActivity);
            }
        });

        holder.descriptionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(detailActivity);
            }
        });

        holder.publicationDateTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(detailActivity);
            }
        });

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(detailActivity);
            }
        });

        Picasso.get()
                .load(item.getImage())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView, categoryTextView, priceTextView, descriptionTextView, publicationDateTextView;
        ImageView imageView;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            categoryTextView = itemView.findViewById(R.id.categoryTextView);
            priceTextView = itemView.findViewById(R.id.priceTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
            publicationDateTextView = itemView.findViewById(R.id.publicationDateTextView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
