pipeline {
    agent {
        label 'ubuntu' // Ensure the agent has the required environment
    }
    environment {
        JAVA_HOME = tool name: 'JDK 22', type: 'jdk' // Configure JDK 22
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
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