package com.example.tracker.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import android.widget.ProgressBar;
import android.widget.BaseAdapter;
import com.example.tracker.R;
import com.example.tracker.models.StudentReport;
import java.util.List;

public class ClassReportAdapter extends BaseAdapter {

    private Context context;
    private List<StudentReport> reportList;

    public ClassReportAdapter(Context context, List<StudentReport> reportList) {
        this.context = context;
        this.reportList = reportList;
    }

    @Override
    public int getCount() {
        return reportList.size();
    }

    @Override
    public Object getItem(int position) {
        return reportList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_class_report, parent, false);
        }

        TextView txtStudentName = convertView.findViewById(R.id.txtStudentName);
        TextView txtStudentRoll = convertView.findViewById(R.id.txtStudentRoll);
        ProgressBar progressAttendance = convertView.findViewById(R.id.progressAttendance);
        TextView txtAttendancePercentage = convertView.findViewById(R.id.txtAttendancePercentage);
        TextView txtAverageMarks = convertView.findViewById(R.id.txtAverageMarks);

        StudentReport report = reportList.get(position);

        txtStudentName.setText(report.getStudentName());
        txtStudentRoll.setText("Roll No: " + report.getStudentRoll());
        progressAttendance.setProgress(report.getAttendancePercentage());
        txtAttendancePercentage.setText(report.getAttendancePercentage() + "%");
        txtAverageMarks.setText("Avg Marks: " + report.getAverageMarks());

        return convertView;
    }
}
