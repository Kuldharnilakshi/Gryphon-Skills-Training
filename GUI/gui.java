import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class gui implements ActionListener{
        
            JFrame frame;
            JPanel panel;
            
            public gui() {
                frame = new JFrame();
                panel = new JPanel();
                JButton button = new JButton("Click Me");
                JLabel label = new JLabel("Number of clicks: 0");
                button.addActionListener(e -> {
                    String text = label.getText();
                    int count = Integer.parseInt(text.replaceAll("\\D+",""));
                    count++;
                    label.setText("Number of clicks: " + count);
                });
                panel.add(label);
                panel.add(button);
                panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
                panel.setLayout(new GridLayout(0,1));
                frame.add(panel,BorderLayout.CENTER);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("GUI Example"); 
                frame.pack();
                frame.setVisible(true);
            }
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            // No action needed here as we are using a lambda for the button action
        }


        public static void main(String[] args) {
                new gui();
        }
}