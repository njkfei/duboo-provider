# duboo-provider
 dubbo 服务提供者，提供数据访问服务．
 
* 数据模型在接口文件中定义，通过jar包共享给消费者

* 数据存储在mysql,通过mybatis框架提供数据访问功能

* dubbo发布服务

## 此路有若几个坑
### 序列化
如果接口定义文件未指定序列化，则会报下面的错误

```
must implement java.io.Serializable
```

解决方案,MODEL增加指定序列化
```
public class Order implements Serializable{
	private int order_id;
	private String order_no;
｝
```

### 版本不匹配
alibaba的hessian-lite的编译环境与提供者工程环境的jre版本应一致，否则会报jar错误．
