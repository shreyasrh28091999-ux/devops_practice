pipeline{
    agent none
    stages{
        stage('in agent1'){
            agent{
                label 'agent1'
            }
            steps{
                sh '''
                echo "this is in agent1"
                echo "hello from agent1" > newfile.txt
                cat newfile.txt
                '''
                stash name: 'newfile',
                includes: 'newfile.txt'
            }
        }
        stage('in agent 2'){
            agent{
                label 'agent2'
            }
            steps{
                unstash 'newfile'
                sh'''
                echo "file recieved"
                cat newfile.txt
                '''
            }
        }
    }
}
    