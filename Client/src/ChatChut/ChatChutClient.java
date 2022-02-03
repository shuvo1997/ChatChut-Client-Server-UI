package ChatChut;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatChutClient extends JFrame {
    private static final String TITLE = "Kothar adda Client server";
    private static ChatChutClient instance;

    private JList listUsers;
    private JTextArea textChat;
    private JTextField textInput;
    private JButton buttonSend;

    ChatChutClient(){
        createView();

        setTitle(TITLE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,500);
        setLocationRelativeTo(null);
        setResizable(true);
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(new BorderLayout());

        listUsers = new JList();
        JScrollPane listpane = new JScrollPane(listUsers);
        listpane.setPreferredSize(new Dimension(200,0));
        panel.add(listpane, BorderLayout.EAST);

        JPanel panelChat = new JPanel(new BorderLayout());
        panel.add(panelChat, BorderLayout.CENTER);

        textChat = new JTextArea();
        textChat.setEditable(false);
        JScrollPane textPane = new JScrollPane(textChat);
        panelChat.add(textPane, BorderLayout.CENTER);

        JPanel panelInput = new JPanel(new BorderLayout());
        panel.add(panelInput, BorderLayout.SOUTH);

        textInput = new JTextField();
        panelInput.add(textInput, BorderLayout.CENTER);

        buttonSend = new JButton("Send");
        buttonSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panelInput.add(buttonSend, BorderLayout.EAST);


    }
    public static ChatChutClient getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                instance = new ChatChutClient();
                instance.setVisible(true);
            }
        });
    }
}
