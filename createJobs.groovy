//pipelineJob('pipelineJob') {
//    definition {
//        cps {
//            script(readFileFromWorkspace('pipelineJob.groovy'))
//            sandbox()
//        }
//    }
//}
//
//pipelineJob('build-job') {
//    definition {
//        cpsScm {
//            scm {
//                git {
//                    remote {
//                        url 'https://github.com/Dylar/TestSpringApi.git'
//                    }
//                    branch 'master'
//                }
//            }
//        }
//    }
//}

pipelineJob('buildInDocker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/Dylar/TestSpringApi.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-docker')
                }
            }
        }
    }
}