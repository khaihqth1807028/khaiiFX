package main.java.mainthread;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import main.java.entity.LoginStage;
import main.java.entity.RegisterStage;

public class MainStage extends Application {
    private VBox vBox;
    private HBox hBox;
    private HBox TittleBox;
    private Label title;
    private Button LoginStage;
    private LoginStage Login;
    private Button RegisterStage;
    private RegisterStage registerStage;
    private Label Witdraw;
    private Label Deposite;
    private Label Springherobank;
    private Label Acount;
    private Scene scene;
    private MainStage aplication;
    private Stage curenStage;
    private GridPane gridPaneContent;
    private Label acountName;
    private Label monney;
    private TextField MonneyCash;
    private VBox Narbar;
    private Button Edit;
    private Button Close;
    private HBox Btn;
    private VBox gripVbox;


    @Override
    public void start(Stage primaryStage) throws Exception {

        this.aplication = this;
        this.curenStage = primaryStage;
        this.compodent ( );
        this.curenStage.setScene (this.scene);
        this.curenStage.show ( );

    }

    private void compodent() {
this.registerStage = new RegisterStage ();
        this.vBox = new VBox ( );
        this.hBox = new HBox ();
        this.TittleBox = new HBox ( );
        this.title = new Label ("LOGO BANK");
        this.title.setAlignment (Pos.CENTER);
        this.title.setPadding (new Insets (20));
        this.TittleBox.getChildren ( ).add (title);
        this.title.setFont (Font.font (17));
        this.title.setTextFill (Color.web ("#f9e70b"));

        this.TittleBox.setSpacing (10);
        this.gridPaneContent = new GridPane ( );
        this.Acount = new Label ("Welcome tho Bank");
        this.Acount.setAlignment (Pos.TOP_RIGHT);

        this.Close = new Button ("close");
        this.Edit = new Button ("Edit");
//        this.acountName = new Label ( );
//        this.monney = new Label ("Monney");
//        this.MonneyCash = new TextField ( );
        this.Springherobank = new Label ( );
        this.gridPaneContent.add (Acount, 6, 0);

        this.gripVbox = new VBox ();
        this.Btn = new HBox ();
       this.Btn.getChildren ().addAll (Edit,Close);
        this.Btn.setSpacing (10);
        this.Btn.setAlignment (Pos.CENTER);
        this.gridPaneContent.setHgap(10);
     this.gripVbox.getChildren ().addAll (this.gridPaneContent);
this.Login = new LoginStage ();

//        this.gridPaneContent.add (MonneyCash, 1, 1);
//        this.gridPaneContent.add (Springherobank, 0, 2);
        this.gridPaneContent.setAlignment (Pos.TOP_RIGHT);
        this.gridPaneContent.setPadding (new Insets (10, 10, 10, 10));
        this.gridPaneContent.setVgap (10);
        this.gridPaneContent.setHgap (10);

        this.Narbar = new VBox ( );
        this.LoginStage = new Button ("Login");
        this.RegisterStage = new Button ("Register");
        this.Deposite = new Label ("DEPOSITE");
        this.Witdraw = new Label ("Witdraw");
        this.Narbar.setAlignment (Pos.BASELINE_CENTER);
        this.Narbar.setSpacing (12);
        this.Narbar.setPadding (new Insets (0,0,0,12));
        this.Narbar.getChildren ().addAll (this.LoginStage, this.RegisterStage, this.Deposite, this.Witdraw);

        this.hBox.getChildren().addAll (this.Narbar,this.gripVbox);

        this.vBox.getChildren ( ).addAll (this.TittleBox,this.hBox,this.Btn);
        this.scene = new Scene (this.vBox, 300, 250);
    LoginStage.setOnAction (new EventHandler<ActionEvent> ( ) {
        @Override
        public void handle(ActionEvent event) {
            Login.show ();
        }
    });
    RegisterStage.setOnAction (new EventHandler<ActionEvent> ( ) {
        @Override
        public void handle(ActionEvent event) {
            registerStage.show ();
        }
    });



        vBox.getStylesheets ().add("../java/css.css");
    }

    public static void main(String[] args) {
        launch (args);
    }

    public VBox getvBox() {
        return vBox;
    }

    public void setvBox(VBox vBox) {
        this.vBox = vBox;
    }

    public HBox gethBox() {
        return hBox;
    }

    public void sethBox(HBox hBox) {
        this.hBox = hBox;
    }

    public HBox getTittleBox() {
        return TittleBox;
    }

    public void setTittleBox(HBox tittleBox) {
        TittleBox = tittleBox;
    }

    public Label getTitle() {
        return title;
    }

    public void setTitle(Label title) {
        this.title = title;
    }

    public Button getLoginStage() {
        return LoginStage;
    }

    public void setLoginStage(Button loginStage) {
        LoginStage = loginStage;
    }

    public main.java.entity.LoginStage getLogin() {
        return Login;
    }

    public void setLogin(main.java.entity.LoginStage login) {
        Login = login;
    }

    public Button getEdit() {
        return Edit;
    }

    public void setEdit(Button edit) {
        Edit = edit;
    }

    public Button getClose() {
        return Close;
    }

    public void setClose(Button close) {
        Close = close;
    }

    public HBox getBtn() {
        return Btn;
    }

    public void setBtn(HBox btn) {
        Btn = btn;
    }

    public VBox getGripVbox() {
        return gripVbox;
    }

    public void setGripVbox(VBox gripVbox) {
        this.gripVbox = gripVbox;
    }

    public Button getRegisterStage() {
        return RegisterStage;
    }

    public void setRegisterStage(main.java.entity.RegisterStage registerStage) {
        this.registerStage = registerStage;
    }

    public void setRegisterStage(Button registerStage) {
        RegisterStage = registerStage;
    }

    public Label getWitdraw() {
        return Witdraw;
    }

    public void setWitdraw(Label witdraw) {
        Witdraw = witdraw;
    }

    public Label getDeposite() {
        return Deposite;
    }

    public void setDeposite(Label deposite) {
        Deposite = deposite;
    }

    public Label getSpringherobank() {
        return Springherobank;
    }

    public void setSpringherobank(Label springherobank) {
        Springherobank = springherobank;
    }

    public Label getAcount() {
        return Acount;
    }

    public void setAcount(Label acount) {
        Acount = acount;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public MainStage getAplication() {
        return aplication;
    }

    public void setAplication(MainStage aplication) {
        this.aplication = aplication;
    }

    public Stage getCurenStage() {
        return curenStage;
    }

    public void setCurenStage(Stage curenStage) {
        this.curenStage = curenStage;
    }

    public GridPane getGridPaneContent() {
        return gridPaneContent;
    }

    public void setGridPaneContent(GridPane gridPaneContent) {
        this.gridPaneContent = gridPaneContent;
    }

    public Label getAcountName() {
        return acountName;
    }

    public void setAcountName(Label acountName) {
        this.acountName = acountName;
    }

    public Label getMonney() {
        return monney;
    }

    public void setMonney(Label monney) {
        this.monney = monney;
    }

    public TextField getMonneyCash() {
        return MonneyCash;
    }

    public void setMonneyCash(TextField monneyCash) {
        MonneyCash = monneyCash;
    }

    public VBox getNarbar() {
        return Narbar;
    }

    public void setNarbar(VBox narbar) {
        Narbar = narbar;
    }
}
