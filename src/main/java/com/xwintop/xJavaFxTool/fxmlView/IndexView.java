package com.xwintop.xJavaFxTool.fxmlView;

import com.xwintop.xJavaFxTool.utils.Config;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.springframework.context.annotation.Scope;

import java.util.Optional;
import java.util.ResourceBundle;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import de.felixroske.jfxsupport.GUIState;

/** 
 * @ClassName: IndexView
 * @Description: 
 * @author: xufeng
 * @date: 2017/11/22 17:38  
 */
@Scope("prototype")
@FXMLView(value = "/fxml/Index.fxml", bundle = "locale.Menu")
public class IndexView extends AbstractFxmlView {
    public IndexView() throws Exception {
        //反射修改默认语言
        ResourceBundle bundle = ResourceBundle.getBundle(this.getResourceBundle().get().getBaseBundleName(), Config.defaultLocale);
        FieldUtils.writeField(this,"bundle",Optional.ofNullable(bundle),true);
        GUIState.getStage().setTitle(bundle.getString("Title"));//修改标题国际化
    }
}
