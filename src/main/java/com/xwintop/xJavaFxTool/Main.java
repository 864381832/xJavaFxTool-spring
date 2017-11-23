package com.xwintop.xJavaFxTool;

import com.xwintop.xJavaFxTool.fxmlView.IndexView;
import com.xwintop.xJavaFxTool.utils.Config;
import com.xwintop.xJavaFxTool.utils.XJavaFxSystemUtil;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.application.Platform;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

/** 
 * @ClassName: Main 
 * @Description: 启动类
 * @author: xufeng
 * @date: 2017年11月10日 下午4:34:11  
 */
@SpringBootApplication
public class Main extends AbstractJavaFxApplicationSupport {
	private static Logger log = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure(Main.class.getResource("/config/log4j.properties"));//加载日志配置
		XJavaFxSystemUtil.initSystemLocal();//初始化本地语言
		XJavaFxSystemUtil.addJarByLibs();//添加外部jar包
		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				Platform.runLater(()->{
					ResourceBundle resourceBundle = ResourceBundle.getBundle("locale.Menu", Config.defaultLocale);
					AbstractJavaFxApplicationSupport.setTitle(resourceBundle.getString("Title"));
				});
			}
		},5000);

		launchApp(Main.class, IndexView.class, args);
	}
}