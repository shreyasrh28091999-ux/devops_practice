pipeline {
    agent {
        label '!master'
    }
    environment {
  USER = "shreyas"
  PLACE = "banglore"
}
parameters {
  choice choices: ['Testing', 'staging', 'pre production', 'production'], description: 'to determine where to run', name: 'Environment'
  booleanParam description: 'to check something', name: 'check ready'
}


    stages {

        stage('Checkout') {
            agent {
        label 'agent1'
    }
            steps {
                echo 'Checking out code...'
                echo "${env.PLACE}"
                echo "${params.Environment}"
                sh 'bash script.sh'
                
                sh '''
                echo "this is checking"
                sleep 5
                echo "$USER"
                 '''
            }
        }

        stage('Build') {
            agent {
        label 'agent2'
    }
            steps {
                echo 'Building application...'
                sh ''' 
                    sleep 5
                    ls -lrt
                    '''
            }
        }

        stage('Test') {
            agent {
        label 'agent1'
    }
            steps {
                echo 'Testing application...'
                sh 'echo "$date" '
            }
        }

        stage('Deploy') {
            agent {
        label 'agent2'
    }
            steps {
                echo 'Deployment successful!'
            }
        }
    }
}
