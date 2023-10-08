### Start Nomad from nomad-env docker image
```
docker build -f docker/nomad-env.Dockerfile -t nomad-env .
docker run -it --rm -p 4646-4648:4646-4648 --cap-add SYS_ADMIN nomad-env:latest /nomad/bin/nomad agent -dev -config=/nomad/config/server.conf
```

https://medium.com/hashicorp-engineering/hashicorp-nomad-from-zero-to-wow-1615345aa539
