pipeline{
    agent any
    stages{
        stage("stage1"){
            steps{
                sh '''
                pwd
                echo "this is executing in jenkins file folder"
                '''
            }
            
        }
        stage("chechking out scm"){
            steps{
            git branch: 'main',
            credentialsId: 'github_repo',
            url: 'https://github.com/QwenLM/Qwen.git'
            }
        }
        stage("checking whether in that branch"){
            steps{
                sh'''
                pwd
                ls -lrt
                sleep 5
                '''
            }
        }
        stage("classical method branch"){
            steps{
                checkout([
                    $class: 'GitSCM',
                    branches: [['*/main']],
                    userRemoteConfigs: [[
                        url: 'https://github.com/ashishpatel26/500-AI-Agents-Projects.git',
                        credentialsId: 'github_repo'
                    ]],
                    submoduleCfg: []
                ])
            }
        }
        stage("listing in new repo"){
            steps{
                sh '''
                ls -lrt
                sleep 3
                '''
            }
        }
    }
    
}