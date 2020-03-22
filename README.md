#### 项目简介：
**gitee地址：**[xJavaFxTool-spring](https://gitee.com/xwintop/xJavaFxTool-spring)

**GitHub地址：**[xJavaFxTool-spring](https://github.com/864381832/xJavaFxTool-spring)

**腾讯云开发平台地址：**[xJavaFxTool-spring](https://dev.tencent.com/u/xwintop/p/xJavaFxTool-spring)

<p align="center">
	<a target="_blank" href="https://www.apache.org/licenses/LICENSE-2.0.html">
		<img src="https://img.shields.io/:license-apache-blue.svg" ></img>
	</a>
	<a target="_blank" href="https://www.oracle.com/technetwork/java/javase/downloads/index.html">
		<img src="https://img.shields.io/badge/JDK-1.8+-green.svg" ></img>
	</a>
	<a target="_blank" href="https://gitee.com/xwintop/xJavaFxTool-spring/stargazers">
		<img src='https://gitee.com/xwintop/xJavaFxTool-spring/badge/star.svg?theme=dark' alt='gitee star'></img>
	</a>
	<a target="_blank" href='https://github.com/864381832/xJavaFxTool-spring'>
		<img src="https://img.shields.io/github/stars/864381832/xJavaFxTool-spring.svg?style=social" alt="github star"></img>
	</a>
</p>

[英文说明/English Documentation](README_EN.md)

**xJavaFxTool交流QQ群：== [387473650](https://jq.qq.com/?_wv=1027&k=59UDEAD) ==**
#### 项目简介：
xJavaFxTool-spring是基于springBoot，使用javaFx开发的实用小工具集，利用业余时间把工作中遇到的一些问题总结起来，打包进小工具集中，供大家参考和使用，里面包含了javaFx的一些功能的示例，如布局、国际化、第三方UI库([controlsfx](http://fxexperience.com/controlsfx/)、[JFoenix](http://www.jfoenix.com/)等)、外部jar包加载(插件机制)等一些常用功能，想学习javaFx的同学可以参考参考，学习javaFx的资料参考[www.javafxchina.net](http://www.javafxchina.net/main/)

xJavaFxTool-spring为基于原有项目[xJavaFxTool](https://gitee.com/xwintop/xJavaFxTool)之上构建的，后续两个版本都会更新，感谢大家的支持。

#### 下载试用地址：
- 可直接运行的jar包（本地需要有jdk1.8环境）[xJavaFxTool-spring-0.1.4.jar](https://dev.tencent.com/s/4b3eee09-482c-4269-83e9-fc9c1068baf5)
- Windows x86安装包（兼容xp、windows7、8、10等系统）[xJavaFxTool-spring-0.1.4-windows-x86.exe](https://dev.tencent.com/s/c3537a14-5528-4d6c-a605-2375e1810d3a)
- Windows x64安装包（兼容xp、windows7、8、10等系统）[xJavaFxTool-spring-0.1.4-windows-x64.exe](https://dev.tencent.com/s/d0ee7c9f-8611-432c-b445-b61fc6aad5f1)
- Linux x64 [xJavaFxTool-spring-0.1.4-linux-x64.zip](https://dev.tencent.com/s/6100efc7-fd3f-404c-a528-fed3d32b016c) （Linux平台64位运行压缩包，解压即可运行）
- Mac OS X x64 [xJavaFxTool-spring-0.1.4-macosx-x64.dmg](https://dev.tencent.com/s/b566b428-da9c-4cab-972a-35831cace479)
- Mac OS X x64 [xJavaFxTool-spring-0.1.4-macosx-x64.pkg](https://dev.tencent.com/s/68633719-cf9b-41f0-b3e0-7a7ec9d51d01)
#### 若上面下链接失效可使用下面下载链接：
- 百度云链接：[https://pan.baidu.com/s/1RjlR58eu_GZC4iy46eGKLw](https://pan.baidu.com/s/1RjlR58eu_GZC4iy46eGKLw)  提取码：zerc
- 腾讯微云链接：[https://share.weiyun.com/57irGHJ](https://share.weiyun.com/57irGHJ) 提取码：java

将插件jar包放至根目录libs下即可自动加载(插件开发示例见[开源项目xJavaFxTool-plugin](https://gitee.com/xwintop/xJavaFxTool-plugin)，后续准备将小工具拆分至各插件中按需加载，目前插件功能暂不完善，后续将各功能拆分至各模块按需加载，减小jar包的大小);

#### 环境搭建说明：
- 开发环境为jdk1.8，基于maven构建；
- 使用eclipase或Intellij Idea开发(推荐使用[Intellij Idea](https://www.jetbrains.com/idea/))
- 基于SpringBoot搭建，大大简化了配置操作。
- 本项目使用了lombok,在查看本项目时如果您没有下载lombok 插件，请先安装,不然找不到get/set方法；
- 依赖的[xcore包](https://gitee.com/xwintop/xcore)已上传至git托管的maven平台，git托管maven可参考教程。[教程地址：点击进入](http://blog.csdn.net/u011747754/article/details/78574026)
- 使用[javafx-maven-plugin](https://github.com/javafx-maven-plugin/javafx-maven-plugin)插件进行打包操作（可打包windows、Linux、Mac安装包）；
- 使用[exe4j](https://www.ej-technologies.com/download/exe4j/files)将jar包转成exe执行文件（仅供参考，可使用其它程序打包）；
- 使用[InnoSetup](http://www.jrsoftware.org/)可进行制作windows安装包；

#### 目前集成的小工具有：
1. FileCopy：文件复制(支持自动调度拷贝功能)(使用[quartz](https://www.quartz-scheduler.org/)工具)
2. CronExpBuilder：Cron表达式生成器
3. CharacterConverter：编码转换
4. EncryptAndDecrypt：加密解密(Ascii、Hex、Base64、Base32、URL、MD5、SHA、AES、DES、文件加密DM5、文件加密SHA1、摩斯密码、Druid加密)(使用[commons-codec](http://commons.apache.org/codec/)工具)
5. TimeTool：Time转换(常用格式转换(含时区)、计算时间差、时间叠加计算)
6. LinuxPathToWindowsPath：路径转换(使用[oshi](https://github.com/oshi/oshi)工具)
7. QRCodeBuilder：二维码生成工具(自动生成、加入logo、截图识别、自定义格式)(使用[google.zxing](https://github.com/zxing/zxing)、[jkeymaster](https://github.com/tulskiy/jkeymaster)等工具)
8. IdCardGenerator：身份证生成器
9. RegexTester：正则表达式生成工具
10. ShortURL：网址缩短(目前支持百度、新浪、缩我等短网址缩短)
11. EscapeCharacter：转义字符(支持Html、XML、Java、JavaScript、CSV、Sql)(使用[commons-lang3](https://commons.apache.org/lang)工具)
12. ZHConverter：字符串转换(使用[hanlp](http://hanlp.com/)开源工具，实现拼音、简体-繁体、简体-臺灣正體、简体-香港繁體、繁體-臺灣正體、繁體-香港繁體、香港繁體-臺灣正體、数字金额-大写金额等直接的转换)
13. ActiveMqTool:Mq调试工具(目前仅支持[ActiveMq](http://activemq.apache.org))
14. HttpTool：Http调试工具(支持自定义发送数据、header和cookie)(使用[okhttp](https://square.github.io/okhttp/))
15. jsonEditor：json格式化编辑工具
16. IconTool：图标生成工具(使用[thumbnailator](https://github.com/coobird/thumbnailator)工具)
17. RedisTool：Redis连接工具(使用[jedis](https://github.com/xetorthio/jedis)工具)
18. WebSourcesTool：网页源码下载工具
19. SwitchHostsTool：切换Hosts工具(使用[richtextfx](https://github.com/FXMisc/RichTextFX)工具)
20. FtpServer：Ftp服务器(快速搭建本地Ftp服务)(基于[apache.ftpserver](https://mina.apache.org/ftpserver-project))
21. CmdTool：Cmd调试工具
22. FtpClientTool：Ftp(s)/Sftp客户端调试工具(批量上传、下载、删除文件及文件夹)(implicit/explicit SSL/TLS)(使用[jsch](http://www.jcraft.com/jsch)、[commons-io](http://commons.apache.org/io/)等工具)
23. PdfConvertTool：Pdf转换工具(目前仅支持pdf转图片、pdf转text功能)(使用[pdfbox](https://pdfbox.apache.org/)工具)
24. DirectoryTreeTool：文件列表生成器
25. ImageTool：图片压缩工具(批量压缩、修改尺寸、转换格式)
26. AsciiPicTool：图片转码工具(包括图片生成banner码、图片转Base64码、图片转Excel表)
27. KafkaTool：Kafka调试工具(未完善)(使用了[kafka-clients](http://kafka.apache.org/))
28. EmailTool：Email群发工具(支持自定义群发模版)(使用[commons-email](https://commons.apache.org/email)工具)
29. ColorCodeConverterTool：颜色代码转换工具(包括16进制、RGB、ARGB、RGBA、HSL、HSV等代码之间转换)
30. SmsTool：短信群发工具(目前支持中国移动、中国电信、腾讯云、阿里云、梦网云通讯等平台)
31. ScriptEngineTool：脚本引擎调试工具(目前支持JavaScript、Groovy、Python、Lua等脚本)(使用[groovy](http://groovy-lang.org)、[jython](https://jython.org)、[luaj](http://www.luaj.org/luaj.html)等工具)
32. FileRenameTool：文件重命名工具
33. JsonConvertTool：Json转换工具(目前支持Json转Xml、Json转Java实体类、Json转C#实体类、Json转Excel、Json转Yaml、Properties转Yaml、Yaml转Properties)(使用[fastjson](https://github.com/alibaba/fastjson)、[snakeyaml](https://bitbucket.org/asomov/snakeyaml)、[dom4j](https://dom4j.github.io)等工具)
34. WechatJumpGameTool：微信跳一跳助手
35. TextToSpeechTool：语音转换工具(调用[百度语音](https://ai.baidu.com/tech/speech/tts)转换api)
36. 2048：小游戏2048
37. SocketTool：Socket调试工具(使用[Apache Mina](http://mina.apache.org)实现Tcp、Udp服务端和Client端)
38. ImageAnalysisTool:图片解析工具(1、.atlas文件反解析2、图片快速拆分工具)
39. DecompilerWxApkgTool:微信小程序反编译工具(一键反编译微信小程序包)
40. ZookeeperTool:Zookeeper工具(方便对zookeeper的一系列操作，包括新增、修改、删除(包括子文件)、重命名、复制、添加变更通知)(使用[zkclient](https://github.com/sgroschupf/zkclient)工具)
41. ExcelSplitTool:Excel拆分工具(支持对xls、xlsx、csv及文件进行拆分操作)(使用[commons-csv](http://commons.apache.org/csv)工具)
42. PathWatchTool:文件夹监控工具
43. CharsetDetectTool:文件编码检测工具(使用[juniversalchardet](https://github.com/albfernandez/juniversalchardet)工具)
44. TransferTool:传输工具(集成各种传输协议，使用自定义定时任务(简单模式、cron表达式模式)，分为Receiver接收器、Filter处理器、Sender发送器)
45. ScanPortTool:端口扫描工具
46. FileMergeTool:文件合并工具(支持对xls、xlsx、csv及文件进行合并操作)(使用[apache.poi](http://poi.apache.org/)工具)
47. SedentaryReminderTool:久坐提醒工具
48. RandomGeneratorTool:随机数生成工具(使用[hutool](https://hutool.cn)工具)
49. ClipboardHistoryTool:剪贴板历史工具

项目开发中，以后会陆续添加新工具，欢迎大家参与其中，多提提意见，谢谢。

#### 项目结构

```
xJavaFxTool-spring
├─ images	项目截图
├─ libs	插件jar包存放
├─ pom.xml	maven配置文件
├─ README.md	说明文件
├─ src
│  ├─ main
│  │  ├─ java
│  │  │  └─ com
│  │  │   └─ xwintop
│  │  │    └─ xJavaFxTool
│  │  │     ├─ common	第三方工具类
│  │  │     ├─ config	springBoot配置类
│  │  │     ├─ controller	javafx控制层
│  │  │     │  ├─ assistTools	辅助工具控制层
│  │  │     │  ├─ codeTools	Code工具控制层
│  │  │     │  ├─ debugTools	调试工具控制层
│  │  │     │  ├─ developTools	开发工具控制层
│  │  │     │  ├─ epmsTools	epms工具控制层
│  │  │     │  ├─ javaFxTools	javaFx工具控制层
│  │  │     │  ├─ littleTools	小工具控制层
│  │  │     │  └─ webTools	html工具控制层
│  │  │     ├─ fxmlView     FxmlView控制层
│  │  │     ├─ job	定时任务处理job
│  │  │     ├─ main	主函数包
│  │  │     ├─ manager	管理层
│  │  │     ├─ model	基础bean类层
│  │  │     ├─ services	工具服务层
│  │  │     │  ├─ assistTools   辅助工具服务层
│  │  │     │  ├─ codeTools	Code工具服务层
│  │  │     │  ├─ debugTools	调试工具服务层
│  │  │     │  ├─ developTools	开发工具服务层
│  │  │     │  ├─ epmsTools	epms工具服务层
│  │  │     │  ├─ javaFxTools	javaFx工具服务层
│  │  │     │  ├─ littleTools	小工具服务层
│  │  │     │  └─ webTools	html工具服务层
│  │  │     ├─ utils	系统工具类
│  │  │     ├─ view	javafx视图层
│  │  │     │  ├─ assistTools   辅助工具视图层
│  │  │     │  ├─ codeTools	Code工具视图层
│  │  │     │  ├─ debugTools	调试工具视图层
│  │  │     │  ├─ developTools	开发工具视图层
│  │  │     │  ├─ javaFxTools	javaFx工具视图层
│  │  │     │  ├─ littleTools	小工具视图层
│  │  │     │  └─ webTools	html工具视图层
│  │  │     └─ web	web控制视图层
│  │  └─ resources
│  │   ├─ com
│  │   │  └─ xwintop
│  │   │   └─ xJavaFxTool
│  │   │    └─ fxmlView     .fxml文件
│  │   ├─ config	配置文件
│  │   │  └─ toolFxmlLoaderConfiguration.xml	系统菜单加载配置文件
│  │   ├─ css	样式资源
│  │   ├─ data	数据资源
│  │   ├─ images	图片资源
│  │   ├─ locale	国际化
│  │   ├─ web	html工具
│  │   ├─ application.yaml	SpringBoot配置文件
│  │   ├─ banner.txt	启动banner图片
│  │   └─ logback.xml	logback日志配置文件
│  └─ test  测试类
│   ├─ java
│   └─ resources
├─ xJavaFxTool-spring.jar	直接运行程序包

```

运行截图展示：

![输入图片说明](images/传输工具.gif "传输工具.gif")
![输入图片说明](images/邮件发送工具.gif "邮件发送工具.png")
![输入图片说明](images/Cron表达式生成器.gif "Cron表达式生成器.gif")
![输入图片说明](images/加密解密.gif "加密解密.png")
![输入图片说明](images/正则表达式生成工具.gif "正则表达式生成工具.png")
![输入图片说明](images/二维码生成工具.gif "二维码生成工具.png")
![输入图片说明](images/随机数生成工具.gif "随机数生成工具.png")
![输入图片说明](images/Redis连接工具.gif "Redis连接工具.png")
![输入图片说明](images/图片压缩工具.gif "图片压缩工具.png")
![输入图片说明](images/图片转码工具.gif "图片转码工具.png")
![输入图片说明](images/短信群发工具.gif "短信群发工具.png")
![输入图片说明](images/文件重命名工具.gif "文件重命名工具.png")
![输入图片说明](images/成语字典工具.gif "成语字典工具.png")
