package com.xwintop.xJavaFxTool.fxmlView.debugTools.redisTool;

import com.xwintop.xJavaFxTool.model.RedisToolDataTableBean;
import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
@Lazy
@FXMLView(value = "/com/xwintop/xJavaFxTool/fxmlView/debugTools/redisTool/RedisToolDataTable.fxml")
public class RedisToolDataTableView extends AbstractFxmlView {

}