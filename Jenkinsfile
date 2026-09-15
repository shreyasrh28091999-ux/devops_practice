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
                script{
                    try{
                        sh '''
                        exit 1 
                        '''
                    }
                    catch(err){
                        echo "caught an error messgae ${err}"
                    }
                    
                }
                
            }
        }
        stage("stage4"){
            steps{
                echo "this stage 4"
            }
        }
    }
}
  