package com.example.tracker.adapters;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tracker.R;
import com.example.tracker.models.Timetable;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;

public class TimetableAdapter extends RecyclerView.Adapter<TimetableAdapter.ViewHolder> {

    private Context context;
    private List<Timetable> timetableList;
    private boolean isTeacher;  // Determines if edit/delete is enabled

    public TimetableAdapter(Context context, List<Timetable> timetableList, boolean isTeacher) {
        this.context = context;
        this.timetableList = timetableList;
        this.isTeacher = isTeacher;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_timetable, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Timetable timetable = timetableList.get(position);
        holder.timeSlot.setText(timetable.getTimeSlot());
        holder.subject.setText(timetable.getSubject());

        // Show edit/delete only if user is a teacher
        if (!isTeacher) {
            holder.editIcon.setVisibility(View.GONE);
            holder.deleteIcon.setVisibility(View.GONE);
        } else {
            // Edit action
            holder.editIcon.setOnClickListener(v -> editTimetable(timetable));

            // Delete action
            holder.deleteIcon.setOnClickListener(v -> showDeleteDialog(position));
        }
    }

    @Override
    public int getItemCount() {
        return timetableList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView timeSlot, subject;
        ImageView editIcon, deleteIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            timeSlot = itemView.findViewById(R.id.textTimeSlot);
            subject = itemView.findViewById(R.id.textSubject);
            editIcon = itemView.findViewById(R.id.iconEdit);
            deleteIcon = itemView.findViewById(R.id.iconDelete);
        }
    }

    // Method to handle deleting a timetable entry
    private void showDeleteDialog(int position) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Delete Timetable Entry")
                .setMessage("Are you sure you want to delete this entry?")
                .setPositiveButton("Delete", (dialog, which) -> deleteTimetable(position))
                .setNegativeButton("Cancel", null)
                .show();
    }

    // Method to delete timetable entry from Firestore
    private void deleteTimetable(int position) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        String docId = timetableList.get(position).getId();

        db.collection("timetable").document(docId)
                .delete()
                .addOnSuccessListener(aVoid -> {
                    timetableList.remove(position);
                    notifyItemRemoved(position);
                    Toast.makeText(context, "Timetable entry deleted", Toast.LENGTH_SHORT).show();
                })
                .addOnFailureListener(e -> Toast.makeText(context, "Failed to delete", Toast.LENGTH_SHORT).show());
    }

    // Placeholder for editing timetable (Implement as needed)
    private void editTimetable(Timetable timetable) {
        Toast.makeText(context, "Edit feature to be implemented", Toast.LENGTH_SHORT).show();
    }
}
