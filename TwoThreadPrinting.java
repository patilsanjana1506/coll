import javax.swing.*;
import java.awt.*;

public class TwoThreadPrinting extends JPanel {
    private JTextArea textArea;

    public TwoThreadPrinting() {
        setLayout(new BorderLayout());
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // Create and start the first thread
        Thread thread1 = new Thread(new PrintNumbers(1, 100));
        thread1.start();

        // Create and start the second thread
        Thread thread2 = new Thread(new PrintNumbers(101, 200));
        thread2.start();
    }

    private void appendText(String text) {
        SwingUtilities.invokeLater(() -> {
            textArea.append(text + "\n");
        });
    }

    private class PrintNumbers implements Runnable {
        private int start;
        private int end;

        public PrintNumbers(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                appendText(Integer.toString(i));
                try {
                    // Sleep for a short duration to simulate printing delay
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Two Thread Printing Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new TwoThreadPrinting());
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
