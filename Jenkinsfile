pipeline{
    agent any
    stages{
        stage("stage1"){
            steps{
                echo "starting stage 1"
            }
           
            }
        }
        stage("stage1"){
            steps{
                catchError(buildResult : 'SUCCESS',stageResult : 'FAIL')
                echo "starting stage 1"
                sh '''
                sleep 5
                exit 1
                '''
            }
           
            }
        }
        stage("stage2"){
            steps{
                sh '''
                echo "starting stage 2"
                sleep 5
                '''
            }
           
            }
        
    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}