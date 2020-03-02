package com.xwintop.xJavaFxTool.view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.web.WebView;
import lombok.Getter;
import lombok.Setter;

import java.util.ResourceBundle;

@Getter
@Setter
public abstract class IndexView implements Initializable {
    protected ResourceBundle bundle;

    @FXML
    protected Button myButton;

    @FXML
    protected CheckBox singleWindowBootCheckBox;

    @FXML
    protected TextField myTextField;

    @FXML
    protected TabPane tabPaneMain;

    @FXML
    protected MenuBar mainMenuBar;

    @FXML
    protected Menu fileMenu;

    @FXML
    protected Menu toolsMenu;

    @FXML
    protected Menu moreToolsMenu;

    @FXML
    protected Menu netWorkToolsMenu;

    @FXML
    protected Menu helpMenu;

    @FXML
    protected WebView tongjiWebView;
}
