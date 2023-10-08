### Update `compose/env.dev` with WSL IPv4 Address
```
<start powershell>
PS C:\Users> ipconfig

Windows IP Configuration
...
Ethernet adapter vEthernet (WSL):

   Connection-specific DNS Suffix  . :
   Link-local IPv6 Address . . . . . : fe80::a181:b6bf:2381:ae1b%39
   IPv4 Address. . . . . . . . . . . : 192.168.240.1
   Subnet Mask . . . . . . . . . . . : 255.255.240.0
   Default Gateway . . . . . . . . . :
PS C:\Users>
```

### JAVA-BUILD-ENV, NOMAD-ENV and NOMAD-RUNTIME images
```
docker build -f docker/java-build-env.Dockerfile -t java-build-env .
docker build -f docker/nomad-env.Dockerfile -t nomad-env .
docker build -f docker/nomad-runtime.Dockerfile -t nomad-runtime .
```

### Docker Compose
Run environment with two docker compose instances
```
# run DEV OTEL services
docker-compose --env-file docker/compose/env.dev -f docker/compose/otel.yml up

# build and run DEV services in Nomad
docker build -f docker/nomad-env.Dockerfile -t nomad-env .
docker build -f docker/nomad-runtime.Dockerfile -t nomad-runtime .
docker-compose --env-file docker/compose/env.dev -f docker/compose/nomad-runtime.yml up
```

### run services individually within Docker compose
```
docker build -f docker/nomad-env.Dockerfile -t nomad-env .
docker build -f docker/nomad-runtime.Dockerfile -t nomad-runtime .
docker-compose --env-file docker/compose/env.dev -f docker/compose/nomad-runtime.yml up
```

### Java Services image (outside of VSCode)
```
docker build --rm -f docker/nomad-runtime.Dockerfile -t nomad-runtime .
docker run -it --rm --entrypoint /bin/bash java-services:latest
```

### Run the java services individually
```
docker run -it -p 8080:8080 --rm java-services:latest /app/bin/app -DSERVICE_KEY=dev.config garden_leave.config.ConfigService
docker run -it --rm java-services:latest /app/bin/app -DCONFIG_SVC=localhost:8080 -DSERVICE_KEY=dev.webapp.sweeper.v1 garden_leave.webapp.WebappService
docker run -it --rm java-services:latest /app/bin/app -DCONFIG_SVC=localhost:8080 -DSERVICE_KEY=dev.webapp.tape.v1 garden_leave.webapp.WebappService
```

### Nomad UI
http://localhost:4646/ui/jobs

### Sweeper UI
http://localhost:9099

### TAPE UI
http://localhost:9098

### Jaeger UI
http://localhost:16686

### Prometheus
http://localhost:9090
