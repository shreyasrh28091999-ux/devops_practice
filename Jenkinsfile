pipeline {
    agent {
        label 'agent1'
    }
    environment {
  USER = "shreyas"
  PLACE = "banglore"
}

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out code...'
                echo "${env.PLACE}"
                sh '''
                echo "this is checking"
                sleep 5
                echo "$USER"
                 '''
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
