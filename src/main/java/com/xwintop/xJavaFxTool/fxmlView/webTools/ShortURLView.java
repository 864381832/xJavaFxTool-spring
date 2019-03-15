package com.xwintop.xJavaFxTool.fxmlView.webTools;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import javafx.fxml.Initializable;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
@Lazy
@FXMLView(value = "/com/xwintop/xJavaFxTool/fxmlView/webTools/ShortURL.fxml")
public class ShortURLView extends AbstractFxmlView {
}
