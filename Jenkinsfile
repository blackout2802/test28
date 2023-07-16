pipeline {
  agent any

  stages {
    stage('Build') {
      steps 
      {
        script {
          // Set the working directory path
          def workingDir = "${WORKSPACE}/docker_docker/"

          // Verify the path is absolute
          if (!workingDir.startsWith('/')) {
            error("Working directory path is not absolute: ${workingDir}")
          }

          // Run the Docker image with the updated working directory
          sh "docker run -v ${workingDir}:/app -w /app node:18.16.0-alpine npm install"
        }
      }
    }
  }
}

