pipeline{
    agent none
    stages{
        stage('checking in agent1'){
            agent{
                label 'agent1'
            }
            steps{
                echo "this is execution in agent 1"
                sh '''
                whoami
                echo "this is execution in agent1"
                '''
            }
        
        }
        stage('creating parralel in stage2'){
            parallel{
                stage('parallel 1'){
                    agent{
                        label 'agent2'
                    }
                    steps{
                        echo "this is parallel in agent 2"
                    }
                }
                stage('parallel 2'){
                    agent{
                        label 'agent1'
                    }
                    steps{
                        echo "this is paralel execution in agent1"
                    }
                }
            }
        }
    }
}