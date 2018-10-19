package org.d3ifcool.chartexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    BarChart chart;
    ArrayList<BarEntry> barEntries;
    ArrayList<String> barEntryLabels;
    BarDataSet barDataSet;
    BarData barData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chart = (BarChart) findViewById(R.id.containerChart);
        barEntries = new ArrayList<>();
        barEntryLabels = new ArrayList<String>();

        addValuesToBarEntries();
        addValuesToBarEntryLabels();

        barDataSet= new BarDataSet(barEntries, "Projects");
        barData = new BarData(barDataSet);
        barDataSet.setColor(ColorTemplate.getHoloBlue());
        chart.setData(barData);
        chart.animateY(3000);
    }

    public void addValuesToBarEntries(){
        barEntries.add(new BarEntry(2f, 0));
        barEntries.add(new BarEntry(3f, 1));
        barEntries.add(new BarEntry(4f, 2));
        barEntries.add(new BarEntry(5f, 3));
        barEntries.add(new BarEntry(6f, 4));
        barEntries.add(new BarEntry(7f, 5));
    }

    public void addValuesToBarEntryLabels(){
        barEntryLabels.add("January");
        barEntryLabels.add("February");
        barEntryLabels.add("March");
        barEntryLabels.add("April");
        barEntryLabels.add("May");
        barEntryLabels.add("June");
    }
}
