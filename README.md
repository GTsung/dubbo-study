~~~~~~

dubbo
    admin:查看github

    xml配置及springboot

    springboot:
        1.開啓dubbo
        2.生產者service注解
        3.消費者reference注解

    配置：
        1.消費者啓動不檢查生產者是否已經注冊(真正調用服務時才會報錯)：
            <dubbo:reference check="false"/>
            全局配置<dubbo:consumer check="false"/>
        2.消費者超時時間配置timeout;
        3.重試次數retries(這個不包含第一次調用)
        4.多版本version
        5.存根：當調用失敗后會將代理類傳給存根，存根根據自定義的條件來決定是否要調代理
            消費端配置：<dubbo:service interface="com.gt.gmail.service.UserService" 
                                     stub="com.gt.gmail.service.impl.UserServiceStub"/>
        6.當注冊中心宕掉后，可以使用直連模式進行交互
        7.負載均衡：loadbalance(隨機、輪詢、hash)
        8.服務降級：(1)客戶端直接返回null，不去調用服務端;(2)調用失敗則返空;
        9.容錯機制：(1)直接快速失敗;(2)自動調用其他節點
        
~~~~~~