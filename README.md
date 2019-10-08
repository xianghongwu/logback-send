# logback-send
模拟发送日志到日志服务器

此项目是配合 https://github.com/xianghongwu/logback-receive 这个项目使用的。

说明:在项目中加入这些配置。就可以上传本项目的日志到日志服务器中，同一管理。

配置说明：
1.LogbackFilter类的作用是过滤什么级别的日志上传到日志服务器。
2.application.properties中的logback.loggly.endpointUrl用于配置日志服务区的地址其中最后一个/后面的内容应该是本项目的项目名
3.logback-spring.xml的详细配置参考示例代码。


