package software.ulpgc.kata3;

public class Main {

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.histogramDisplay().show(histogram());
        mainFrame.setVisible(true);
    }

    private static DatasetProvider histogram() {
        return new DatasetProvider() {
            @Override
            public int bins() {
                return 10;
            }

            @Override
            public double[] get() {
                return new double[] {207,205,206,207,205,32,206,207,206,85,1,206,212,210,206,200,206,207,112,216,207,205};
            }
        };
    }
}