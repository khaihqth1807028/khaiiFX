package main.java.entity;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RegisterStage extends Stage {

    private GridPane gridPane;
    private Label labelUsername;
    private Label labelMonney;
    private Label txtUsername;
    private TextField Monney;
    private Label pass;
    private Button btnLogin;
    private Button btnReset;
private Label Title;
private VBox TitleBox;
private VBox vbox;
private Label labelphone;
private PasswordField passwordField;
private TextField txtphone;
private Label email;
private TextField txtEmail;
    public RegisterStage() {
        initComponent();
    }
    private void initComponent() {
        this.TitleBox = new VBox ();
        this.Title = new Label ("Register");
        this.TitleBox.getChildren ().addAll (Title);

        this.gridPane = new GridPane();
        this.labelUsername = new Label("UserName : ");
        this.pass = new Label(" Pass");
        this.txtUsername = new Label ("KhaiHo");
        this.passwordField = new PasswordField ();
        this.labelphone = new Label ("Phone");
        this.txtphone = new TextField ();
        this.email = new Label ("Email");
        this.txtEmail = new TextField ();
        this.btnLogin = new Button("Submit");
        this.btnReset = new Button("Close");
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(labelUsername, 0, 0);
        gridPane.add(txtUsername, 1, 0);
        gridPane.add(pass, 0, 1);
        gridPane.add(passwordField, 1, 1);
        gridPane.add (labelphone,0,2);
        gridPane.add (txtphone,1,2);
        gridPane.add (email,0,3);
        gridPane.add (txtEmail,1,3);
        HBox hBox = new HBox();
        hBox.getChildren().addAll(btnLogin, btnReset);
        hBox.setSpacing(10);
        gridPane.add(hBox, 0, 4);
        this.vbox = new VBox ();
        this.vbox.getChildren ().addAll (this.TitleBox,this.gridPane);
        Scene scene = new Scene(vbox, 300, 300);
        this.setScene(scene);
        btnReset.setOnAction (e -> Close());

    }

    private void Close() {
        close ();
    }

}
