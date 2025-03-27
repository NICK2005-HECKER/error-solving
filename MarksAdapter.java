package com.example.tracker.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tracker.R;
import com.example.tracker.models.Marks;

import java.util.List;

public class MarksAdapter extends RecyclerView.Adapter<MarksAdapter.ViewHolder> {

    private Context context;
    private List<Marks> marksList;

    public MarksAdapter(Context context, List<Marks> marksList) {
        this.context = context;
        this.marksList = marksList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_marks, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Marks marks = marksList.get(position);
        holder.subject.setText(marks.getSubject());
        holder.score.setText(marks.getScore() + " / " + marks.getTotalMarks());
    }

    @Override
    public int getItemCount() {
        return marksList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView subject, score;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            subject = itemView.findViewById(R.id.subject_name);
            score = itemView.findViewById(R.id.marks_score);
        }
    }
}
