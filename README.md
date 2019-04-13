# log
log kotlin android

### 用法

//初始化全局应用的context, 用于获取日志文件目录, 默认的目录是cache目录  
`Yog.init(applicationContext)`   
或者   
`Yog.setPrinter(YogDir(File("...."))`  
`Yog.setPrinter(TreePrinter(LogcatPrinter,YogDir(dir)))`  

`logd("aaa", 111,true, exception, map, list, array)`  
`loge(...)`  
`logi(...)`  
 
