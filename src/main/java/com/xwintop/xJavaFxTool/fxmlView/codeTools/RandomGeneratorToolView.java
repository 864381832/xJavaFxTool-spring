package com.xwintop.xJavaFxTool.fxmlView.codeTools;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
@FXMLView(value = "/com/xwintop/xJavaFxTool/fxmlView/codeTools/RandomGeneratorTool.fxml")
@Lazy
public class RandomGeneratorToolView extends AbstractFxmlView {
}
