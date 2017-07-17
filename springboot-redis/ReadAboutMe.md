#Spring Boot 配置Druid数据源

#功能（一）：配置监控统计功能{DruidMonitorConfig.java}，下方有解释
#功能（二）：springboot+mybatis控制台打印sql语句，下方有解释
#功能（三）：springboot+redis缓存（ReadisConfiguration.java）


Druid是阿里巴巴开源平台上的一个项目,整个项目由数据库连接池、插件框架和SQL解析器组成。

一、关于Druid

Druid是一个JDBC组件，它包括三部分： 

DruidDriver 代理Driver，能够提供基于Filter－Chain模式的插件体系。 
DruidDataSource 高效可管理的数据库连接池。 
SQLParser 
Druid可以做什么？ 

1) 可以监控数据库访问性能，Druid内置提供了一个功能强大的StatFilter插件，能够详细统计SQL的执行性能，这对于线上分析数据库访问性能有帮助。 

2) 替换DBCP和C3P0。Druid提供了一个高效、功能强大、可扩展性好的数据库连接池。 

3) 数据库密码加密。直接把数据库密码写在配置文件中，这是不好的行为，容易导致安全问题。DruidDruiver和DruidDataSource都支持PasswordCallback。 

4) SQL执行日志，Druid提供了不同的LogFilter，能够支持Common-Logging、Log4j和JdkLog，你可以按需要选择相应的LogFilter，监控你应用的数据库访问情况。 

扩展JDBC，如果你要对JDBC层有编程的需求，可以通过Druid提供的Filter-Chain机制，很方便编写JDBC层的扩展插件。

Druid开源中国社区地址：http://www.oschina.NET/p/druid


#功能（一）：配置监控统计功能{DruidMonitorConfig.java}
启动项目后访问 ip:端口/druid 输入配置类设置的账号密码进入监控后台。我们先执行一个数据库操作，可以在sql监控选项卡看到执行的sql 【是一个可视化的界面，可查看相关的监控】
例如本demo：
		地址栏输入：localhost:8080/druid
		回显界面：http://localhost:8080/druid/index.html	=====》》可查看许多监控
		
#功能（二）：springboot+mybatis控制台打印sql语句	{还需完善}
此demo采用mybatis的是log4j日志，且为debug模式才能打印出sql,	
将log4j配置文件中info改为debug可以输出sql，仍需优化
#功能（三）：springboot+redis缓存
当出现下面情况：有可能原因①redis未打开或端口号不正确
"Cannot get Jedis connection; nested exception is redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool",