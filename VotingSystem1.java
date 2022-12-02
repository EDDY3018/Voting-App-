import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VotingSystem1 {
    private JPanel framePanel;
    private JPanel northPanel;
    private JPanel eastPanel;
    private JPanel southPanel;
    private JPanel westPanel;
    private JLabel COMPSSAALUMNIDESKLabel;
    private JLabel alreadyAMemberLabel;
    private JLabel usernameLabel;
    private JTextField usernameTextField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton logInButton;
    private JLabel forgotPasswordLabel;
    private JButton hereButton;
    private JButton presidentButton;
    private JButton secretaryButton;
    private JButton treassureButton;
    private JCheckBox joshuaCheckBox;
    private JCheckBox ericaCheckBox;
    private JButton doneButton;
    private JButton doneButton1;
    private JCheckBox loisCheckBox;
    private JCheckBox razakCheckBox;
    private JCheckBox eddyCheckBox;
    private JPanel presidentPanel;
    private JPanel secretaryPanel;
    private JPanel treassurePanel;
    private JCheckBox dannyCheckBox;
    private JCheckBox giftyCheckBox;
    private JButton doneButton2;


    public VotingSystem1() {
        southPanel.setVisible(false);

        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                southPanel.setVisible(true);
                secretaryButton.setVisible(false);
                treassureButton.setVisible(false);
                presidentButton.setVisible(true);
                presidentPanel.setVisible(false);
                secretaryPanel.setVisible(false);
                treassurePanel.setVisible(false);
            }
        });


        presidentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secretaryButton.setVisible(false);
                treassureButton.setVisible(false);
                presidentPanel.setVisible(true);
                secretaryPanel.setVisible(false);
                treassurePanel.setVisible(false);
            }
        });
        doneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secretaryButton.setVisible(true);
                treassureButton.setVisible(false);
                presidentButton.setVisible(true);
                presidentPanel.setVisible(false);
                secretaryPanel.setVisible(false);
                treassurePanel.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new VotingSystem1().framePanel);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);

    }
}
