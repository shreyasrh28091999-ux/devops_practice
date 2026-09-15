def stage1status = ''
pipeline{
    agent any
    environment {
  version = "1.0.01"
    }
    parameters {
  choice choices: ['test', 'build', 'pre prod', 'production'], description: 'area to be forwarded', name: 'area'
}
    stages{
        stage("Stage1"){
            steps{
                echo "this is stage 1"
                sh 'sleep 5'
                echo "app version ${env.version}"
                script{ 
                    stage1status = 'SUCCESS'
                    }
            }
        }
        stage("Stage2"){
            when{
                expression{
                    stage1status == 'SUCCESS'
                }
            }
            steps{
                catchError(buildResult: 'SUCCESS',stageResult: 'FAILURE'){
                    sh '''
                    echo "starting stage 2 build"
                    sleep 3
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
            when{
                expression {
                    params.area == 'production'
                }
            }
            steps{
                echo "this is deployed"
            }
        }
    }
}
  