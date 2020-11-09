package com.example.pcs_recyclerview_0584;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ListViewHolder> {

    private ArrayList<Movie> listMovie;

    public MovieAdapter(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }

    @NonNull
    @Override
    public MovieAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.ListViewHolder holder, int position) {
        Movie mov = listMovie.get(position);

        holder.TxtTitle.setText(mov.getTitle());
        holder.TxtYear.setText(mov.getYear());
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }


    private class ListViewHolder extends RecyclerView.ViewHolder{
        TextView TxtTitle;
        TextView TxtYear;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            TxtTitle = itemView.findViewById(R.id.txtTitle);
            TxtYear = itemView.findViewById(R.id.txtYear);
        }
    }
}
