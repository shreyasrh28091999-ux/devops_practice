
pipeline {

    agent any

    tools {
        jdk 'JDK21'
        maven 'Maven3'
    }

    environment {
        PROJECT_DIR = '/home/ubuntu/repos/devops_practice/devops-demo'
    }

    options {
        timestamps()
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code'
                checkout scm
            }
        }

        stage('Environment Check') {
            steps {
                sh '''
                    java -version
                    mvn -version
                '''
            }
        }

        stage('Clean') {
            steps {
                dir("${PROJECT_DIR}") {
                    sh 'mvn clean'
                }
            }
        }

        stage('Compile') {
            steps {
                dir("${PROJECT_DIR}") {
                    sh 'mvn compile'
                }
            }
        }

        stage('Test') {
            steps {
                dir("${PROJECT_DIR}") {
                    sh 'mvn test'
                }
            }
        }

        stage('Package') {
            steps {
                dir("${PROJECT_DIR}") {
                    sh 'mvn package -DskipTests'
                }
            }
        }

        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts:
                    'target/devops-demo.war',
                    fingerprint: true
            }
        }

        stage('Deploy to Tomcat') {
            steps {
                sh '''
                    sudo /usr/local/bin/deploy-devops-demo \
                    "${PROJECT_DIR}/target/devops-demo.war"
                '''
            }
        }

        stage('Verify Deployment') {
            steps {
                sh '''
                    curl --fail --retry 10 --retry-delay 3 \
                    http://localhost:8081/devops-demo/info
                '''
            }
        }
    }

    post {
        success {
            echo 'BUILD AND DEPLOYMENT SUCCESSFUL'
        }

        failure {
            echo 'PIPELINE FAILED - CHECK CONSOLE OUTPUT'
        }

        always {
            echo 'Pipeline execution completed'
        }
    }
}



