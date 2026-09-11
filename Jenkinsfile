pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out code...'
                sh 'echo "this is checking" '
            }
        }

        stage('Build') {
            steps {
                echo 'Building application...'
                sh ''' 
                    sleep 5
                    ls -lrt
                    '''
            }
        }

        stage('Test') {
            steps {
                echo 'Testing application...'
                sh 'echo "$date" '
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deployment successful!'
            }
        }
    }
}
