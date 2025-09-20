pipeline {
    agent any

    tools {
        // Instala a versão do Maven configurada como "M3" e adiciona ao PATH.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                // Busca o código do repositório do GitHub
                git 'https://github.com/lucaspagliari/INF335-trabalho-5.git/'

                // Executa o Maven
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

            }

            post {
                // registra os resultados dos testes e arquiva o arquivo .jar gerado.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
