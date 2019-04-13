# log
log kotlin android

### 用法

//
Yog.init(applicationContext)
OR
Yog.setPrinter(YogDir(File("...."))
Yog.setPrinter(TreePrinter(LogcatPrinter,YogDir(dir)))

logd("aaa", 111,true, exception, map, list, array)
loge(...)
logi(...)

