job "dev.gateway.example-fix44.client" {
  region = "global"
  datacenters = ["dc1"]
  type = "service"

  group "dev.gateway" {
    count = 1

    task "dev.gateway.example-fix44.client" {
      driver = "raw_exec"

      restart {
        attempts = 0
        mode     = "fail"
      }

      config {
        command = "/app/bin/app"
        args = ["-DSERVICE_KEY=dev.gateway.example-fix44.client",
                "-DCONFIG_SVC=${CONFIG_SVC}",
                "-DNOMAD_ENDPOINT=${NOMAD_ENDPOINT}",
                "-DTRACE_ENDPOINT=${TRACE_ENDPOINT}",
                "-DMETER_ENDPOINT=${METER_ENDPOINT}",
                "garden_leave.gateway.GatewayServiceFactory",
                "FIX44.ExampleClient"]
      }
    }
  }
}
