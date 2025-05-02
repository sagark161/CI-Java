pipeline {
    agent {
        label 'local_mac' // Ensure the agent has the required environment
    }
    environment {
        JAVA_HOME = tool name: 'openjdk11', type: 'jdk' // Use the correct JDK name
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
    }
    tools {
        maven 'Maven3.9' // Use the correct Maven name
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build with Maven') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }
    }
    post {
        always {
            echo 'Pipeline execution completed.'
        }
        success {
            echo 'Build and tests succeeded.'
        }
        failure {
            echo 'Build or tests failed.'
        }
    }
}