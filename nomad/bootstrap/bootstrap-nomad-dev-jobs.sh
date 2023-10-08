#!/bin/sh

sleep 2

echo "/nomad/bin/nomad job run -address=$NOMAD_ENDPOINT /nomad/bootstrap/hcl/dev.config.hcl"
/nomad/bin/nomad job run -address=$NOMAD_ENDPOINT /nomad/bootstrap/hcl/dev.config.hcl

echo "/nomad/bin/nomad job run -address=$NOMAD_ENDPOINT /nomad/bootstrap/hcl/dev.scheduler.hcl"
/nomad/bin/nomad job run -address=$NOMAD_ENDPOINT /nomad/bootstrap/hcl/dev.scheduler.hcl
