package software.ulpgc.Kata3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import javax.net.ssl.HostnameVerifier;
import javax.swing.*;
import java.awt.*;

import static java.time.chrono.JapaneseEra.values;

public class MainFrame extends JFrame {
    public MainFrame() throws HeadlessException{
        this.setTitle("Histogram Viewer");
        this.setSize(850, 650);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(createHistogramDisplay());
    }

    private Component createHistogramDisplay() {
        JFreeChart histogram = ChartFactory.createHistogram(
            "Histograma Numero Huesos",
            "numHuesos",
            "count",
            dataset(),
            PlotOrientation.VERTICAL,
            false, false, false);
        return new ChartPanel(histogram);
    }

    private HistogramDataset dataset() {
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("series", values(), 10);
        return dataset;
    }

    private double[] values() {
        return new double[] {207,205,206,207,205,32,206,207,206,85,1,206,212,210,206,200,206,207,112,216,207,205};
    }

    public static void main(String[] args) {
        new MainFrame().setVisible(true);
    }
}


