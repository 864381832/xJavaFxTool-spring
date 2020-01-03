package com.xwintop.xJavaFxTool;

import com.xwintop.xJavaFxTool.fxmlView.IndexView;
import com.xwintop.xJavaFxTool.utils.JavaFxViewUtil;
import com.xwintop.xJavaFxTool.utils.StageUtils;
import com.xwintop.xJavaFxTool.utils.XJavaFxSystemUtil;
import com.xwintop.xcore.util.javafx.AlertUtil;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import de.felixroske.jfxsupport.GUIState;
import de.felixroske.jfxsupport.SplashScreen;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName: Main
 * @Description: 启动类
 * @author: xufeng
 * @date: 2017年11月10日 下午4:34:11
 */
@SpringBootApplication
@Slf4j
public class Main extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        XJavaFxSystemUtil.initSystemLocal();//初始化本地语言
        XJavaFxSystemUtil.addJarByLibs();//添加外部jar包

        SplashScreen splashScreen = new SplashScreen() {
            @Override
            public String getImagePath() {
                return "/images/javafx.png";
            }
        };
        launch(Main.class, IndexView.class, splashScreen, args);
//		launchApp(Main.class, IndexView.class, args);
    }

    @Override
    public void beforeInitialView(Stage stage, ConfigurableApplicationContext ctx) {
        super.beforeInitialView(stage, ctx);
        Scene scene = JavaFxViewUtil.getJFXDecoratorScene(stage, "", null, new AnchorPane());
        stage.setScene(scene);
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                if (AlertUtil.showConfirmAlert("确定要退出吗？")) {
                    System.exit(0);
                } else {
                    event.consume();
                }
            }
        });
        GUIState.setScene(scene);
        Platform.runLater(() -> {
            StageUtils.updateStageStyle(GUIState.getStage());
        });
    }
}