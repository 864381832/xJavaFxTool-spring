package com.xwintop.xJavaFxTool.fxmlView.debugTools;

import com.xwintop.xJavaFxTool.model.FtpServerTableBean;
import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
@Lazy
@FXMLView(value = "/com/xwintop/xJavaFxTool/fxmlView/debugTools/FtpServer.fxml")
public class FtpServerView extends AbstractFxmlView {

}