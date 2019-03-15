package com.xwintop.xJavaFxTool.fxmlView.codeTools;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
@Lazy
@FXMLView(value = "/com/xwintop/xJavaFxTool/fxmlView/codeTools/RegexTester.fxml")
public class RegexTesterView extends AbstractFxmlView {
}
