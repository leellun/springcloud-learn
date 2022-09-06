# springcloud学习例子
## 1 服务发现
### 1.1 eureka  eureka4001
### 1.2 zookeeper cloud-zk
### 1.3 consul   cloud-consul
### 1.4 nacos   cloud-alibaba-nacos
Nacos就是注册中心 + 配置中心的组合，即 Nacos = Eureka+Config +Bus
## 2 负载均衡客户端
### 2.1 ribbon cloud-ribbon
### 2.2 feign  cloud-feign
## 3 断路器Hystrix cloud-hystrix
## 4 网关
### 4.1 zuul cloud-zuul
### 4.2 gateway cloud-gateway
## 5 配置
### 5.1 配置 cloud-config
### 5.2 消息总线 cloud-config-bus
### 5.3 nacos
## 6 消息驱动
### 6.1 rabbitmq cloud-stream-rabbitmq
### 6.2 rocketmq cloud-stream-rocketmq
### 6.3 kafka cloud-stream-kafka
## 7 分布式链路追踪 cloud-rest sleuth+zipkin
## 8 Sentinel熔断与限流 cloud-alibaba-sentinel cloud-alibaba-sentinel-gateway网关限流
## 9 分布式事务
### 9.1 seata at模式 cloud-alibaba-seata
### 9.2 tcc cloud-hmily-tcc
### 9.3 最终可靠一致性 cloud-tx-rocketmq
## 10 dubbo cloud-dubbo
## 11 springsecurity+auth2 cloud-security 
服务统一认证及服务之间认证传递，以及系统中同一用户只能在一个地方进行登录实现，可以配合redis bitmap实现在线人数统计及记录哪些用户在线
## 12 sso cloud-sso 单点登录