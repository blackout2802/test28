stage('Docker Build') {

steps{


sh "docker build. -t harbor.intrastream.cyou/hello-world-java/hello-java:${DOCKER_TAG}"
				}
}

stage('Podman push') {

steps{

withCredentials([string(credentialsId: 'harbor- pass', variable: 'harborpwd')]) {

sh "docker login harbor.intrastream.cyou -u demo -p ${harborpwd}"
}
sh "docker push harbor.intrastream.cyou/hello-world-java/hello-java:$(DOCKER_TAG}"
}
}
}
}
def getmykeyPath() {
}
def getVersion() {
def commitHash = sh returnstdout: true, script: 'git rev-parse --short HEAD' return commitHash;
}
