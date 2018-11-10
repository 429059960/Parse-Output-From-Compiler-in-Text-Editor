import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;

public class Window {
    JTextArea informationArea = new JTextArea();

    Window() {
        JFrame serverFrame = new JFrame("Server");
        serverFrame.setSize(600, 400);    //create server frame
        serverFrame.setLocation(500, 500);
        serverFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set default close
        serverFrame.setAlwaysOnTop(true);

        Container container = serverFrame.getContentPane(); //create container
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);    //create layout and apply it in the container

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu buildMeun = new JMenu("Build");
        JMenuItem saveItem = new JMenuItem("save");
        JMenuItem openItem = new JMenuItem("open");
        JMenuItem quitItem = new JMenuItem("quit");
        fileMenu.add(saveItem);
        fileMenu.add(openItem);
        fileMenu.add(quitItem);
        JMenuItem compileItem = new JMenuItem("Compile");
        JMenuItem runItem = new JMenuItem("Run");
        buildMeun.add(compileItem);
        buildMeun.add(runItem);
        menuBar.add(fileMenu);
        menuBar.add(buildMeun);
        menuBar.setVisible(true);
        container.add(menuBar);



        JTextArea informationArea = new JTextArea();    //create information area included all operations of clients
        this.informationArea = informationArea; //connect the area with member variables informationArea
        informationArea.setRows(20);
        informationArea.setColumns(35);
        informationArea.setEditable(true); //set and make it read-only
        Font font = new Font("Times Roman", Font.PLAIN,18);
        informationArea.setFont(font);
        container.add(informationArea); //add area into the container

        JScrollPane scroll = new JScrollPane();
        scroll.setViewportView(informationArea);
        DefaultCaret caret = (DefaultCaret) informationArea.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        container.add(scroll);  //create, add and set bar at the button of the scroll when it is updated

        serverFrame.setResizable(false);
        serverFrame.setVisible(true);   //solid the size of frame and make it visible
    }

    public static void main(String[] agrs){
        Window mainWindow = new Window();   //create main window
    }
}
