import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Word Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        final JTextArea textArea = new JTextArea();
        JButton countButton = new JButton("Count Words");
        final JLabel resultLabel = new JLabel("Word count: ");

        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                String[] words = text.split("\\s+");
                int wordCount = words.length;
                resultLabel.setText("Word count: " + wordCount);
            }
        });

        frame.add(textArea);
        frame.add(countButton);
        frame.add(resultLabel);

        frame.setLayout(null);
        textArea.setBounds(10, 10, 380, 60);
        countButton.setBounds(10, 80, 150, 30);
        resultLabel.setBounds(170, 80, 200, 30);

        frame.setVisible(true);
    }
}
