pipeline{
	agent any
	environment {
		imageName = "myImage"
		registryCredentials = "jenkins-nexus"
		registry = "http://192.168.1.7:8085/"
		dockerImage = ""
	}
	tools{
		maven "maven_3.6.3"
		}
	stages{
		stage("Fetching Code from Git"){
			steps{
				git branch: 'master', url: 'https://github.com/saba8683/limitservice.git'
			}
		}
		stage("Building Artifact"){
			steps{
				sh "mvn clean package"
			}
		}
		stage ('Build Docker Image'){
			steps{
				script{
					dockerImage = docker.build imageName
				}
			}	
		}
		stage ("Pushing Docker Image to Nexus Docker Registry"){
			steps{
				script {
					docker.withegistry('registry, registryCredentials'){
						dockerImage.push('latest')
					}
				}
				
			}
		}
	}
}
