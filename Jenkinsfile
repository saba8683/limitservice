pipeline{
	agent any
	tools{
		maven "maven-3.9.6"
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
	}
}