FROM ubuntu:22.04

# Install OpenJDK-17
RUN apt-get update && \
    apt-get install -y openjdk-17-jre-headless && \
    apt-get install -y wget unzip curl && \
    apt-get install -y gpg coreutils vim && \
    apt-get install -y nginx && \
    apt-get clean;

# Fix certificate issues
RUN apt-get update && \
    apt-get install ca-certificates-java && \
    apt-get clean && \
    update-ca-certificates -f;

# Setup JAVA_HOME -- useful for docker commandline
ENV JAVA_HOME /usr/lib/jvm/java-17-openjdk-amd64/

# Download and install HashiCorp Nomad
WORKDIR /nomad
RUN mkdir -p /nomad/bin
RUN mkdir -p /nomad/data/alloc
RUN mkdir -p /nomad/data/plugins
RUN mkdir -p /nomad/config
RUN wget https://releases.hashicorp.com/nomad/1.5.3/nomad_1.5.3_linux_amd64.zip -P /nomad/bin && \
    unzip /nomad/bin/nomad_1.5.3_linux_amd64.zip -d /nomad/bin && \
    rm /nomad/bin/nomad_1.5.3_linux_amd64.zip;

COPY /nomad/bootstrap /nomad/bootstrap
COPY /nomad/config /nomad/config
