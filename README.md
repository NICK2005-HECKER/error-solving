C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\LoginActivity.java:14: error: package com.example.tracker.admin does not exist
import com.example.tracker.admin.DashboardAdminActivity;
                                ^


C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\LoginActivity.java:15: error: package com.example.tracker.student does not exist
import com.example.tracker.student.DashboardStudentActivity;
                                  ^


C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\LoginActivity.java:16: error: package com.example.tracker.teacher does not exist
import com.example.tracker.teacher.DashboardTeacherActivity;
                                  ^
C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\AdminLoginActivity.java:27: error: cannot find symbol
        adminUsername = findViewById(R.id.admin_username);
                                         ^
  symbol:   variable admin_username
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\AdminLoginActivity.java:28: error: cannot find symbol
        adminPassword = findViewById(R.id.admin_password);
                                         ^
  symbol:   variable admin_password
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\AdminLoginActivity.java:29: error: cannot find symbol
        adminLoginBtn = findViewById(R.id.admin_login_btn);
                                         ^
  symbol:   variable admin_login_btn
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\DashboardAdminActivity.java:16: error: cannot find symbol
        setContentView(R.layout.activity_dashboard_admin);
                               ^
  symbol:   variable activity_dashboard_admin
  location: class layout
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\DashboardAdminActivity.java:23: error: cannot find symbol
        btnManageUsers.setOnClickListener(v -> startActivity(new Intent(this, ManageUsersActivity.class)));
                                                                              ^
  symbol:   class ManageUsersActivity
  location: class DashboardAdminActivity
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\DashboardAdminActivity.java:25: error: cannot find symbol
        btnViewReports.setOnClickListener(v -> startActivity(new Intent(this, ClassReportActivity.class)));
                                                                              ^
  symbol:   class ClassReportActivity
  location: class DashboardAdminActivity
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\DashboardAdminActivity.java:27: error: cannot find symbol
        btnSendNotices.setOnClickListener(v -> startActivity(new Intent(this, SendNoticeActivity.class)));
                                                                              ^
  symbol:   class SendNoticeActivity
  location: class DashboardAdminActivity
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\DashboardStudentActivity.java:16: error: cannot find symbol
        setContentView(R.layout.activity_dashboard_student);
                               ^
  symbol:   variable activity_dashboard_student
  location: class layout
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\DashboardStudentActivity.java:25: error: cannot find symbol
        btnProfile.setOnClickListener(v -> startActivity(new Intent(this, StudentProfileActivity.class)));
                                                                          ^
  symbol:   class StudentProfileActivity
  location: class DashboardStudentActivity
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\DashboardStudentActivity.java:29: error: cannot find symbol
        btnSubjects.setOnClickListener(v -> startActivity(new Intent(this, ViewSubjectsActivity.class)));
                                                                           ^
  symbol:   class ViewSubjectsActivity
  location: class DashboardStudentActivity
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\DashboardStudentActivity.java:31: error: cannot find symbol
        btnTimetable.setOnClickListener(v -> startActivity(new Intent(this, ViewTimetableActivity.class)));
                                                                            ^
  symbol:   class ViewTimetableActivity
  location: class DashboardStudentActivity
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\DashboardTeacherActivity.java:16: error: cannot find symbol
        setContentView(R.layout.activity_dashboard_teacher);
                               ^
  symbol:   variable activity_dashboard_teacher
  location: class layout
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\DashboardTeacherActivity.java:26: error: cannot find symbol
        btnProfile.setOnClickListener(v -> startActivity(new Intent(this, TeacherProfileActivity.class)));
                                                                          ^
  symbol:   class TeacherProfileActivity
  location: class DashboardTeacherActivity
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\DashboardTeacherActivity.java:32: error: cannot find symbol
        btnMarks.setOnClickListener(v -> startActivity(new Intent(this, UploadMarksActivity.class)));
                                                                        ^
  symbol:   class UploadMarksActivity
  location: class DashboardTeacherActivity
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\DashboardTeacherActivity.java:34: error: cannot find symbol
        btnReports.setOnClickListener(v -> startActivity(new Intent(this, ClassPerformanceActivity.class)));
                                                                          ^
  symbol:   class ClassPerformanceActivity
  location: class DashboardTeacherActivity
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\DashboardTeacherActivity.java:36: error: cannot find symbol
        btnLeave.setOnClickListener(v -> startActivity(new Intent(this, LeaveManagementActivity.class)));
                                                                        ^
  symbol:   class LeaveManagementActivity
  location: class DashboardTeacherActivity
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\ManageTimetableActivity.java:50: error: cannot find symbol
        timeSlotInput = findViewById(R.id.timeSlotInput);
                                         ^
  symbol:   variable timeSlotInput
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\ManageTimetableActivity.java:51: error: cannot find symbol
        subjectInput = findViewById(R.id.subjectInput);
                                        ^
  symbol:   variable subjectInput
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\ManageTimetableActivity.java:52: error: cannot find symbol
        addTimetableBtn = findViewById(R.id.addTimetableBtn);
                                           ^
  symbol:   variable addTimetableBtn
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\ManageTimetableActivity.java:53: error: cannot find symbol
        timetableRecyclerView = findViewById(R.id.timetableRecyclerView);
                                                 ^
  symbol:   variable timetableRecyclerView
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\ManageTimetableActivity.java:57: error: constructor TimetableAdapter in class TimetableAdapter cannot be applied to given types;
        timetableAdapter = new TimetableAdapter(this, timetableList);
                           ^
  required: Context,List<Timetable>,boolean
  found:    ManageTimetableActivity,List<Timetable>
  reason: actual and formal argument lists differ in length
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\adapters\TimetableAdapter.java:71: error: cannot find symbol
            timeSlot = itemView.findViewById(R.id.textTimeSlot);
                                                 ^
  symbol:   variable textTimeSlot
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\adapters\TimetableAdapter.java:72: error: cannot find symbol
            subject = itemView.findViewById(R.id.textSubject);
                                                ^
  symbol:   variable textSubject
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\adapters\TimetableAdapter.java:73: error: cannot find symbol
            editIcon = itemView.findViewById(R.id.iconEdit);
                                                 ^
  symbol:   variable iconEdit
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\adapters\TimetableAdapter.java:74: error: cannot find symbol
            deleteIcon = itemView.findViewById(R.id.iconDelete);
                                                   ^
  symbol:   variable iconDelete
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\MarkAttendanceActivity.java:44: error: incompatible types: List<Attendance> cannot be converted to List<Student>
        adapter = new StudentAttendanceAdapter(this, attendanceList);
                                                     ^
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\MarkAttendanceActivity.java:45: error: incompatible types: StudentAttendanceAdapter cannot be converted to ListAdapter
        studentListView.setAdapter(adapter);
                                   ^
Ask Gemini

	C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\StudentLoginActivity.java:28: error: cannot find symbol
        setContentView(R.layout.activity_student_login);
                               ^
  symbol:   variable activity_student_login
  location: class layout
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\StudentLoginActivity.java:30: error: cannot find symbol
        usernameInput = findViewById(R.id.student_username);
                                         ^
  symbol:   variable student_username
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\StudentLoginActivity.java:31: error: cannot find symbol
        passwordInput = findViewById(R.id.student_password);
                                         ^
  symbol:   variable student_password
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\StudentLoginActivity.java:32: error: cannot find symbol
        loginButton = findViewById(R.id.student_login_btn);
                                       ^
  symbol:   variable student_login_btn
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\TeacherLoginActivity.java:25: error: cannot find symbol
        setContentView(R.layout.activity_teacher_login);
                               ^
  symbol:   variable activity_teacher_login
  location: class layout
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\TeacherLoginActivity.java:27: error: cannot find symbol
        usernameInput = findViewById(R.id.teacher_username);
                                         ^
  symbol:   variable teacher_username
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\TeacherLoginActivity.java:28: error: cannot find symbol
        passwordInput = findViewById(R.id.teacher_password);
                                         ^
  symbol:   variable teacher_password
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\TeacherLoginActivity.java:29: error: cannot find symbol
        loginButton = findViewById(R.id.teacher_login_btn);
                                       ^
  symbol:   variable teacher_login_btn
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\ViewAttendanceActivity.java:33: error: cannot find symbol
        setContentView(R.layout.activity_view_attendance);
                               ^
  symbol:   variable activity_view_attendance
  location: class layout
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\ViewAttendanceActivity.java:35: error: cannot find symbol
        listViewAttendance = findViewById(R.id.listViewAttendance);
                                              ^
  symbol:   variable listViewAttendance
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\ViewAttendanceActivity.java:40: error: incompatible types: AttendanceAdapter cannot be converted to ListAdapter
        listViewAttendance.setAdapter(adapter);
                                      ^
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\ViewAttendanceActivity.java:67: error: incompatible types: Date cannot be converted to String
            data.add(new String[]{att.getDate(), att.getStatus()});
                                             ^
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\ViewAttendanceActivity.java:67: error: cannot find symbol
            data.add(new String[]{att.getDate(), att.getStatus()});
                                                    ^
  symbol:   method getStatus()
  location: variable att of type Attendance
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\adapters\AttendanceAdapter.java:30: error: cannot find symbol
        View view = LayoutInflater.from(context).inflate(R.layout.item_attendance, parent, false);
                                                                 ^
  symbol:   variable item_attendance
  location: class layout
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\adapters\AttendanceAdapter.java:37: error: no suitable method found for setText(Date)
        holder.date.setText(attendance.getDate());
                   ^
    method TextView.setText(CharSequence) is not applicable
      (argument mismatch; Date cannot be converted to CharSequence)
    method TextView.setText(int) is not applicable
      (argument mismatch; Date cannot be converted to int)
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\adapters\AttendanceAdapter.java:51: error: cannot find symbol
            date = itemView.findViewById(R.id.attendance_date);
                                             ^
  symbol:   variable attendance_date
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\adapters\AttendanceAdapter.java:52: error: cannot find symbol
            status = itemView.findViewById(R.id.attendance_status);
                                               ^
  symbol:   variable attendance_status
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\ViewMarksActivity.java:39: error: incompatible types: List<Marksheet> cannot be converted to List<Marks>
        adapter = new MarksAdapter(this, marksList);
                                         ^
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\activities\ViewMarksActivity.java:40: error: incompatible types: MarksAdapter cannot be converted to ListAdapter
        listViewMarks.setAdapter(adapter);
                                 ^
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\adapters\MarksAdapter.java:38: error: cannot find symbol
        holder.score.setText(marks.getScore() + " / " + marks.getTotalMarks());
                                                             ^
  symbol:   method getTotalMarks()
  location: variable marks of type Marks
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\adapters\ClassReportAdapter.java:43: error: cannot find symbol
            convertView = LayoutInflater.from(context).inflate(R.layout.item_class_report, parent, false);
                                                                       ^
  symbol:   variable item_class_report
  location: class layout
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\adapters\ClassReportAdapter.java:48: error: cannot find symbol
        ProgressBar progressAttendance = convertView.findViewById(R.id.progressAttendance);
                                                                      ^
  symbol:   variable progressAttendance
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\adapters\ClassReportAdapter.java:49: error: cannot find symbol
        TextView txtAttendancePercentage = convertView.findViewById(R.id.txtAttendancePercentage);
                                                                        ^
  symbol:   variable txtAttendancePercentage
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\adapters\ClassReportAdapter.java:50: error: cannot find symbol
        TextView txtAverageMarks = convertView.findViewById(R.id.txtAverageMarks);
                                                                ^
  symbol:   variable txtAverageMarks
  location: class id
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\MainActivity.java:26: error: cannot find symbol
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                                                          ^
  symbol:   class LoginActivity
  location: class MainActivity
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\MainActivity.java:33: error: cannot find symbol
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                                                          ^
  symbol:   class LoginActivity
  location: class MainActivity
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\MainActivity.java:40: error: cannot find symbol
            Intent intent = new Intent(MainActivity.this, AdminLoginActivity.class);
                                                          ^
  symbol:   class AdminLoginActivity
  location: class MainActivity
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\UserAdapter.java:32: error: cannot find symbol
        holder.textEmail.setText(user.getEmail());
                                     ^
  symbol:   method getEmail()
  location: variable user of type User
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:7: error: package com.itextpdf.text does not exist
import com.itextpdf.text.Document;
                        ^
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:8: error: package com.itextpdf.text does not exist
import com.itextpdf.text.Element;
                        ^
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:9: error: package com.itextpdf.text does not exist
import com.itextpdf.text.Font;
                        ^
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:10: error: package com.itextpdf.text does not exist
import com.itextpdf.text.Paragraph;
                        ^
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:11: error: package com.itextpdf.text does not exist
import com.itextpdf.text.PdfPCell;
                        ^
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:12: error: package com.itextpdf.text does not exist
import com.itextpdf.text.PdfPTable;
                        ^
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:13: error: package com.itextpdf.text does not exist
import com.itextpdf.text.PdfWriter;
                        ^
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:22: error: cannot find symbol
        Document document = new Document();
        ^
  symbol:   class Document
  location: class PDFGenerator
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:22: error: cannot find symbol
        Document document = new Document();
                                ^
  symbol:   class Document
  location: class PDFGenerator
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:29: error: cannot find symbol
            PdfWriter.getInstance(document, new FileOutputStream(pdfFile));
            ^
  symbol:   variable PdfWriter
  location: class PDFGenerator
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:33: error: cannot find symbol
            Font titleFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            ^
  symbol:   class Font
  location: class PDFGenerator
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:33: error: cannot find symbol
            Font titleFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
                                 ^
  symbol:   class Font
  location: class PDFGenerator
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:33: error: package Font does not exist
            Font titleFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
                                          ^
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:33: error: cannot find symbol
            Font titleFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
                                                                     ^
  symbol:   variable Font
  location: class PDFGenerator
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:34: error: cannot find symbol
            Paragraph titlePara = new Paragraph(title, titleFont);
            ^
  symbol:   class Paragraph
  location: class PDFGenerator
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:34: error: cannot find symbol
            Paragraph titlePara = new Paragraph(title, titleFont);
                                      ^
  symbol:   class Paragraph
  location: class PDFGenerator
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:35: error: cannot find symbol
            titlePara.setAlignment(Element.ALIGN_CENTER);
                                   ^
  symbol:   variable Element
  location: class PDFGenerator
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:38: error: cannot find symbol
            document.add(new Paragraph("\n"));
                             ^
  symbol:   class Paragraph
  location: class PDFGenerator
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:40: error: cannot find symbol
            PdfPTable table = new PdfPTable(data.get(0).length);
            ^
  symbol:   class PdfPTable
  location: class PDFGenerator
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:40: error: cannot find symbol
            PdfPTable table = new PdfPTable(data.get(0).length);
                                  ^
  symbol:   class PdfPTable
  location: class PDFGenerator
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:43: error: cannot find symbol
                    PdfPCell pdfPCell = new PdfPCell(new Paragraph(cell));
                    ^
  symbol:   class PdfPCell
  location: class PDFGenerator
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:43: error: cannot find symbol
                    PdfPCell pdfPCell = new PdfPCell(new Paragraph(cell));
                                            ^
  symbol:   class PdfPCell
  location: class PDFGenerator
Ask Gemini

C:\Users\nickp\AndroidStudioProjects\tracker\app\src\main\java\com\example\tracker\utils\PDFGenerator.java:43: error: cannot find symbol
                    PdfPCell pdfPCell = new PdfPCell(new Paragraph(cell));
                                                         ^
  symbol:   class Paragraph
  location: class PDFGenerator
Ask Gemini


