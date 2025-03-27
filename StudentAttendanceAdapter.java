package com.example.tracker.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tracker.R;
import com.example.tracker.models.Student;
import java.util.List;

public class StudentAttendanceAdapter extends RecyclerView.Adapter<StudentAttendanceAdapter.ViewHolder> {

    private Context context;
    private List<Student> studentList;

    public StudentAttendanceAdapter(Context context, List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_student_attendance, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Student student = studentList.get(position);
        holder.txtStudentName.setText(student.getName());
        holder.txtStudentRoll.setText(student.getRollNumber());

        // Handle checkbox selection
        holder.checkboxAttendance.setOnCheckedChangeListener((buttonView, isChecked) -> {
            student.setPresent(isChecked);
        });
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public List<Student> getUpdatedList() {
        return studentList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtStudentName, txtStudentRoll;
        CheckBox checkboxAttendance;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtStudentName = itemView.findViewById(R.id.txtStudentName);
            txtStudentRoll = itemView.findViewById(R.id.txtStudentRoll);
            checkboxAttendance = itemView.findViewById(R.id.checkboxAttendance);
        }
    }
}
