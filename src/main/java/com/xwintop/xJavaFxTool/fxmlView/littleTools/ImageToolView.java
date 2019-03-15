package com.xwintop.xJavaFxTool.fxmlView.littleTools;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;

@Scope("prototype")
@Lazy
@FXMLView(value = "/com/xwintop/xJavaFxTool/fxmlView/littleTools/ImageTool.fxml")
public class ImageToolView extends AbstractFxmlView {

}