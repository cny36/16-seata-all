# 16-seata-all
分布式事务

AT模式--Seata


0、nacos正常启动

1、启动seata-server
    执行 sh nacos-config.sh 把 config.txt 文件的信息上传到nacos配置中心
    执行 sh seata-server.sh -h 192.168.27.5 -p 8091 启动seata服务，nacos注册中心可以看到服务正常启动

2、分别启动 tm-order、tm-storage、tm-mall，MallController模拟下单，库存不足会发生回滚
