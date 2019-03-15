package com.xwintop.xJavaFxTool.fxmlView.littleTools;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import javafx.fxml.Initializable;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
@Lazy
@FXMLView(value = "/com/xwintop/xJavaFxTool/fxmlView/littleTools/CronExpBuilder.fxml")
public class CronExpBuilderView extends AbstractFxmlView {
}
