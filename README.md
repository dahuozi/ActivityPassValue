# Activity传值
---

 1. 通过Intent传值
 2. 通过Bundle传值
 3. Application全局对象传值
 4. 启动Activity回传数据

----------
##通过Bundle传值##
发送方：
 1. 新建一个Bundle类
 2. Bundle类中Key-value对的形式储存数据
 3. 创建Intent对象，将Bundle存入Intent

----------
接收方：

 1. 获取激活Intent对象
 2. 获取传递的Bundle对象
 3. 根据Bundle中的key获取指定的value

----------

##通过Application全局对象传值##

发送方：

 1. 将数据存储到Application

----------

接收方：

 1. 从Application中获取

----------
创建类继承Application，将需要存储的数据定义为application属性
发送的Activity中存储数据
在清单文件中进行注册

 
