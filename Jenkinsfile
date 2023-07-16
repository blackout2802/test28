pipeline {
  agent any
  
  stages {
    stage('Build') {
      steps {
        def workingDir = "${WORKSPACE}/docker_docker/"
        
        if (!workingDir.startsWith('/')) {
          error("Working directory path is not absolute: ${workingDir}")
        }
        sh "docker run -v ${workingDir}:/app -w /app node:18.16.0-alpine npm install"
      }
    }
  }
}

