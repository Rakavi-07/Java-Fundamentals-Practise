import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FeedbackForm extends JFrame implements ActionListener {
    JRadioButton[] stars;
    JTextArea comments;
    JButton submit;
    ButtonGroup group;

    public FeedbackForm() {
        setTitle("Online Feedback Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Panel for star rating
        JPanel ratingPanel = new JPanel();
        ratingPanel.setBorder(BorderFactory.createTitledBorder("Rate our service"));
        stars = new JRadioButton[5];
        group = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            stars[i] = new JRadioButton(String.valueOf(i + 1));
            group.add(stars[i]);
            ratingPanel.add(stars[i]);
        }

        // Comments area
        JPanel commentPanel = new JPanel();
        commentPanel.setLayout(new BorderLayout());
        commentPanel.setBorder(BorderFactory.createTitledBorder("Your Comments"));
        comments = new JTextArea(5, 30);
        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);
        commentPanel.add(new JScrollPane(comments), BorderLayout.CENTER);

        // Submit button
        submit = new JButton("Submit");
        submit.addActionListener(this);

        add(ratingPanel, BorderLayout.NORTH);
        add(commentPanel, BorderLayout.CENTER);
        add(submit, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int rating = 0;
        for (int i = 0; i < 5; i++) {
            if (stars[i].isSelected()) {
                rating = i + 1;
                break;
            }
        }

        String comment = comments.getText().trim();
        if (rating == 0) {
            JOptionPane.showMessageDialog(this, "Please select a rating!");
        } else {
            JOptionPane.showMessageDialog(this, 
                "Thank you for your feedback!\nRating: " + rating + " stars\nComment: " + comment);
            // Optional: clear form after submission
            group.clearSelection();
            comments.setText("");
        }
    }

    public static void main(String[] args) {
        new FeedbackForm();
    }
}

