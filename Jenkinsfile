pipeline {
    agent any

    stages {
        stage('GIT Clone') {
            steps {
                git url: "https://github.com/minsick3/Calculator.git" ,branch:'master'
            }
        }
        stage("Package"){
            steps{
                sh "chmod 777 mvnw"
                sh "./mvnw package"
            }
        }

    }
}
