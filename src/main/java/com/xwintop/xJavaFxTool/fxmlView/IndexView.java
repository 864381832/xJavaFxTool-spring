package com.xwintop.xJavaFxTool.fxmlView;

import com.xwintop.xJavaFxTool.utils.Config;
import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.springframework.context.annotation.Scope;

import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

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
    }
}
