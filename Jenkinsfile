pipeline{
    agent any
    stages{
        stage("Stage1"){
            steps{
                echo "this is stage 1"
                sh 'sleep 5'
            }
        }
        stage("Stage2"){
            steps{
                catchError(buildResult: 'SUCCESS',stageResult: 'FAILURE'){
                    sh '''
                    exit 1
                    '''
                }
            }
        }
        stage("Stage3"){
            steps{
                echo "this is step 3"
                sh ''' sleep 5 '''
            }
        }
    }
}
  