package com.example.tracker.utils;

import android.content.Context;
import android.os.Environment;
import android.widget.Toast;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.PdfPCell;
import com.itextpdf.text.PdfPTable;
import com.itextpdf.text.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

public class PDFGenerator {

    public static void generatePDF(Context context, String fileName, String title, List<String[]> data) {
        Document document = new Document();

        try {
            File pdfDir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "TrackerApp");
            if (!pdfDir.exists()) pdfDir.mkdirs();

            File pdfFile = new File(pdfDir, fileName);
            PdfWriter.getInstance(document, new FileOutputStream(pdfFile));

            document.open();

            Font titleFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titlePara = new Paragraph(title, titleFont);
            titlePara.setAlignment(Element.ALIGN_CENTER);
            document.add(titlePara);

            document.add(new Paragraph("\n"));

            PdfPTable table = new PdfPTable(data.get(0).length);
            for (String[] row : data) {
                for (String cell : row) {
                    PdfPCell pdfPCell = new PdfPCell(new Paragraph(cell));
                    table.addCell(pdfPCell);
                }
            }

            document.add(table);
            document.close();

            Toast.makeText(context, "PDF saved to: " + pdfFile.getAbsolutePath(), Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(context, "Error creating PDF: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
