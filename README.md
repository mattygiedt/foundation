### Gradle installDist
```
root@727eccc76b1e:/workspaces/garden_leave# gradle clean build installDist -P app=""
```

### Gradle run
```
root@727eccc76b1e:/workspaces/garden_leave# ./gradlew run -P app=garden_leave.config.ConfigService
```

### Codegen Service
```
root@727eccc76b1e:/workspaces/garden_leave# gradle build installDist -P app=""
root@727eccc76b1e:/workspaces/garden_leave# ./app/build/install/app/bin/app garden_leave.codegen.QuickfixTransformers
```

#### clang-format generated code
```
root@727eccc76b1e:~/millennium_advisors/garden_leave$ clang-format -i --style=Google gateway/src/main/java/garden_leave/gateway/transform/fix42/*.java
root@727eccc76b1e:~/millennium_advisors/garden_leave$ clang-format -i --style=Google gateway/src/main/java/garden_leave/gateway/transform/fix44/*.java
root@727eccc76b1e:~/millennium_advisors/garden_leave$ clang-format -i --style=Google gateway/src/main/java/garden_leave/gateway/transform/fixt11/*.java
root@727eccc76b1e:~/millennium_advisors/garden_leave$ clang-format -i --style=Google gateway/src/main/java/garden_leave/gateway/transform/fix50sp2/*.java
```

### Config Service
```
root@727eccc76b1e:/workspaces/garden_leave# ./app/build/install/app/bin/app -DSERVICE_KEY=dev.config garden_leave.config.ConfigService
root@727eccc76b1e:/workspaces/garden_leave# ./app/build/install/app/bin/app -DGRPC_PORT=8090 garden_leave.config.ConfigService
```

### Gateway Service (Example client and venue)
```
root@727eccc76b1e:/workspaces/garden_leave# gradle build installDist -P app=""

# FIX.4.2
root@727eccc76b1e:/workspaces/garden_leave# ./app/build/install/app/bin/app -DSERVICE_KEY=dev.gateway.example-fix42.venue -DCONFIG_SVC=LOCAL garden_leave.gateway.GatewayServiceFactory FIX42.ExampleVenue
root@727eccc76b1e:/workspaces/garden_leave# ./app/build/install/app/bin/app -DSERVICE_KEY=dev.gateway.example-fix42.client -DCONFIG_SVC=LOCAL garden_leave.gateway.GatewayServiceFactory FIX42.ExampleClient

# FIX.4.4
root@727eccc76b1e:/workspaces/garden_leave# ./app/build/install/app/bin/app -DSERVICE_KEY=dev.gateway.example-fix44.venue -DCONFIG_SVC=LOCAL garden_leave.gateway.GatewayServiceFactory FIX44.ExampleVenue
root@727eccc76b1e:/workspaces/garden_leave# ./app/build/install/app/bin/app -DSERVICE_KEY=dev.gateway.example-fix44.client -DCONFIG_SVC=LOCAL garden_leave.gateway.GatewayServiceFactory FIX44.ExampleClient
```

### Internalizer Service (internalizer, client and venue)
```
root@727eccc76b1e:/workspaces/garden_leave# gradle build installDist -P app=""

root@727eccc76b1e:/workspaces/garden_leave# ./app/build/install/app/bin/app -DSERVICE_KEY=dev.internalizer.lob.v1 -DCONFIG_SVC=LOCAL garden_leave.internalizer.InternalizerService

root@727eccc76b1e:/workspaces/garden_leave# ./app/build/install/app/bin/app -DSERVICE_KEY=dev.gateway.internalizer-fix42.venue -DCONFIG_SVC=LOCAL garden_leave.gateway.GatewayServiceFactory FIX42.InternalizerVenue

root@727eccc76b1e:/workspaces/garden_leave# ./app/build/install/app/bin/app -DSERVICE_KEY=dev.gateway.internalizer-fix42.client -DCONFIG_SVC=LOCAL garden_leave.gateway.GatewayServiceFactory FIX42.InternalizerClient
```

### Scheduler Service
```
root@727eccc76b1e:/workspaces/garden_leave# ./app/build/install/app/bin/app -DCONFIG_SVC=192.168.248.16:8080 -DSERVICE_KEY=dev.scheduler garden_leave.scheduler.SchedulerService
```

### WebApp Service
```
root@727eccc76b1e:/workspaces/garden_leave# ./app/build/install/app/bin/app -DCONFIG_SVC=localhost:8080 -DSERVICE_KEY=dev.webapp.telemetry.v1 garden_leave.webapp.WebappService
```

### Market Data Service(s)
```
./app/build/install/app/bin/app -DSERVICE_KEY=dev.marketdata.consumer.a garden_leave.marketdata.MarketDataConsumer

./app/build/install/app/bin/app -DSERVICE_KEY=dev.marketdata.consumer.b garden_leave.marketdata.MarketDataConsumer

./app/build/install/app/bin/app -DSERVICE_KEY=dev.marketdata.producer garden_leave.marketdata.MarketDataProducer

./app/build/install/app/bin/app -DSERVICE_KEY=dev.marketdata.simulator garden_leave.marketdata.ExchangeSimulator
```

### Open Telemetry - https://opentelemetry.io/docs/instrumentation/java/manual/
```
root@727eccc76b1e:/workspaces/garden_leave# app/build/install/app/bin/app \
-DTRACE_ENDPOINT=http://172.26.232.223:4317 \
-DMETER_ENDPOINT=http://172.26.232.223:4317 \
garden_leave.config.ConfigService

root@727eccc76b1e:/workspaces/garden_leave# app/build/install/app/bin/app \
-DCONFIG_SVC=localhost:8080 \
-DSERVICE_KEY=dev.webapp.telemetry.v1 \
-DTRACE_ENDPOINT=http://172.26.232.223:4317 \
-DMETER_ENDPOINT=http://172.26.232.223:4317 \
garden_leave.webapp.WebappService
```

### Utility to create library gradle file structure
```
mkdir <new library>
cd <new library>
mkdir -p src/main/resources
mkdir -p src/test/resources
mkdir -p src/main/java/garden_leave/<new library>
mkdir -p src/test/java/garden_leave/<new library>
```

### Python webserver to view test results
```
python -m http.server --directory /tmp/
```
