# Running Healinium with Docker

This guide will walk you through the steps to download and start Docker, and then execute Healinium within a Docker container.

## Prerequisites

Before you begin, ensure you have the following prerequisites installed on your system:

- [Docker](https://www.docker.com/get-started) - Containerization platform used to run Healinium in a container.

## Step 1: Download and Install Docker

1. Visit the [Docker website](https://www.docker.com/get-started) and follow the instructions to download and install Docker for your operating system.

## Step 2: Verify Docker Installation

1. Once Docker is installed, open a terminal or command prompt.
2. Run the following command to verify that Docker is installed correctly:

   ```bash
   docker --version

   # Using Healinium with Maven

This guide will walk you through the steps to add Healinium as a dependency in your Maven project, initialize the self-healing driver, and configure the `healinium.properties` file.

## Step 3: Add Healinium Dependency to Your Maven Project

1. Open your project's `pom.xml` file.
2. Add the following dependency to the `<dependencies>` section:

  <dependency>
    <groupId>com.epam.healenium</groupId>
    <artifactId>healenium-web</artifactId>
    <version>3.5.0</version>
</dependency>

Note: get latest dependency from https://mvnrepository.com/artifact/com.epam.healenium/healenium-web

