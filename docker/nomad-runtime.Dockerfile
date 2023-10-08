FROM java-build-env:latest AS builder

# Source directory
ARG SOURCE_DIR=./
ARG WORKDIR="/app"
WORKDIR ${WORKDIR}

# Copy directory into builder
COPY ${SOURCE_DIR} ${WORKDIR}/

RUN echo "*** Build and run unit tests ***" && \
    /gradle/gradle-7.6/bin/gradle clean build installDist -P app=""

# Create a new runtime environment
FROM nomad-env:latest AS runtime

# Setup the application filesystem
WORKDIR /app
RUN mkdir -p log

# Copy the JARs, resources created by the builder into the runtime
COPY --from=builder /app/app/build/install/app /app/
COPY --from=builder /app/app/build/resources/main /app/resources/
