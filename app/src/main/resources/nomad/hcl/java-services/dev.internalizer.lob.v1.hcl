job "dev.internalizer.lob.v1" {
  region = "global"
  datacenters = ["dc1"]
  type = "service"

  group "dev.internalizer" {
    count = 1

    task "dev.internalizer.lob.v1" {
      driver = "raw_exec"

      restart {
        attempts = 0
        mode     = "fail"
      }

      config {
        command = "/app/bin/app"
        args = ["-DSERVICE_KEY=dev.internalizer.lob.v1",
                "-DCONFIG_SVC=${CONFIG_SVC}",
                "-DNOMAD_ENDPOINT=${NOMAD_ENDPOINT}",
                "-DTRACE_ENDPOINT=${TRACE_ENDPOINT}",
                "-DMETER_ENDPOINT=${METER_ENDPOINT}",
                "garden_leave.internalizer.InternalizerService"]
      }
    }
  }
}
