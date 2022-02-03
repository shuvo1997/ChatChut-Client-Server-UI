import javax.swing.*;
import java.awt.*;

public class ChatChutServer extends JFrame {
    public static final String TITLE = "Kothar Adda Chat Server";
    private static ChatChutServer instance;
    private JTextArea console;
    private JList listUsers;

    ChatChutServer(){
        createView();
    setTitle(TITLE);
    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    setSize(new Dimension(500,400));
    setResizable(true);
    setLocationRelativeTo(null);

    }

    private void createView() {
    JPanel panel = new JPanel();
    getContentPane().add(panel);
    panel.setLayout(new BorderLayout());

    console = new JTextArea();
    console.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(console);
    scrollPane.setBorder(BorderFactory.createTitledBorder("Console Output"));
    panel.add(scrollPane, BorderLayout.CENTER);

    listUsers = new JList();
    JScrollPane scrollPane1 = new JScrollPane(listUsers);
    scrollPane1.setBorder(BorderFactory.createTitledBorder("Clients List:"));
    scrollPane1.setPreferredSize(new Dimension(200,0));
    panel.add(scrollPane1, BorderLayout.EAST);

    }

    public static ChatChutServer getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            instance = new ChatChutServer();
            instance.setVisible(true);
            }
        });
    }


}
