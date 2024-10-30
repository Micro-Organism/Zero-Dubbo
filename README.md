# Zero-Dubbo
Zero-Dubbo
# 1. 概述
## 1.1. 背景
Apache Dubbo 是一款微服务开发框架，它提供了 RPC通信 与 微服务治理 两大关键能力。这意味着，使用 Dubbo 开发的微服务，将具备相互之间的远程发现与通信能力，
同时利用 Dubbo 提供的丰富服务治理能力，可以实现诸如服务发现、负载均衡、流量调度等服务治理诉求。同时 Dubbo 是高度可扩展的，
用户几乎可以在任意功能点去定制自己的实现， 以改变框架的默认行为来满足自己的业务需求。

# 2. 功能

# 3. 使用
## 3.1. zookeeper 环境搭建
```yaml
version: '3'
services:
  zookeeper:
    image: zookeeper:3.7.0
    container_name: zookeeper
    restart: unless-stopped
    volumes:
      - "./zookeeper/data:/data"
      - "./zookeeper/datalog:/datalog"
    ports:
      - "2181:2181"

  # webui
  zookeeper-webui:
    image: tobilg/zookeeper-webui
    container_name: zookeeper-webui
    restart: unless-stopped
    environment:
      ZK_DEFAULT_NODE: zookeeper:2181
    depends_on:
      - zookeeper
    links:
      - zookeeper
    ports:
      - "8089:8080"
```
## 3.2. 启动
```shell
docker-compose -f docker-compose-zookeeper.yml -p zookeeper up -d
```

## 3.3. 访问
可视化界面访问地址：[http://localhost:8089](http://localhost:8089) ,输入 [http://localhost:2181](http://localhost:2181) 进入

# 4. 其他

# 5. 参考
> 桌面可视化工具PrettyZoo: [https://github.com/vran-dev/PrettyZoo](https://github.com/vran-dev/PrettyZoo)