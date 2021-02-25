package com.sujan.task.report;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.sujan.task.dto.ReportDto;

import java.io.FileOutputStream;
import java.util.List;
import java.util.stream.Stream;

public class GenerateReport {

    public  void generateReport(List<ReportDto> reportDtos) throws Exception
    {

        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("Report.pdf"));
        document.open();
        PdfPTable table = new PdfPTable(3);
        addTableHeader(table);
        addRows(table,reportDtos);
        document.add(table);
        document.close();

    }

    private void addTableHeader(PdfPTable table) {
        Stream.of("Vehicle No", "Location", "Camera Details")
                .forEach(columnTitle -> {
                    PdfPCell header = new PdfPCell();
                    header.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    header.setBorderWidth(2);
                    header.setPhrase(new Phrase(columnTitle));
                    table.addCell(header);
                });
    }


    private void addRows(PdfPTable table, List<ReportDto> reportDtos) {

        reportDtos.stream().forEach(reportDto -> {
            table.addCell(reportDto.getVehicleNo());
            table.addCell(reportDto.getLocation());
            table.addCell(reportDto.getCameraDetails());
        });

    }

}
