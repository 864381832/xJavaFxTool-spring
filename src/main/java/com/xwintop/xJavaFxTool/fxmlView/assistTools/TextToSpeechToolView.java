package com.xwintop.xJavaFxTool.fxmlView.assistTools;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
@FXMLView(value = "/com/xwintop/xJavaFxTool/fxmlView/assistTools/TextToSpeechTool.fxml")
@Lazy
public class TextToSpeechToolView extends AbstractFxmlView {
}
