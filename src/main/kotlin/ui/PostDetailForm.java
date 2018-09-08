package ui;

import business.PostBusiness;
import entity.PostEntity;
import javafx.geometry.Pos;

import javax.swing.*;

public class PostDetailForm extends JFrame{
    private JPanel rootPanel;
    private JLabel lblTitulo;
    private JLabel lblBody;

    private PostBusiness mPostBusiness = new PostBusiness();

    public PostDetailForm(int id){
        super();

        this.loadPost(id);

        this.setContentPane(rootPanel);
        this.setSize(500, 250);
        this.setVisible(true);
    }

    private void loadPost(int id) {
        PostEntity entity = this.mPostBusiness.getSinglePost(id);

        this.lblTitulo.setText(entity.getTitle());
        this.lblBody.setText("<html>" + entity.getBody() + "<html>");

    }
}
