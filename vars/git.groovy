#!/usr/bin/env groovy
import groovy.transform.Field

@Field first_time_execution = true
@Field project = ''

def project(project) {
    project = ${project}
    echo "Project: ${project}"
}

def checkIfProjectExists() {
    if ( project == '' ) {
        error "No project found. You must call project(projectName) before this method"
    }
}

def config(branch) {
    checkIfProjectExists()
    echo "Comenzamos ejecución $first_time_execution"
    if ( first_time_execution ) {
        sh """
        echo "Primera vez que ejecutamos con la rama $branch"
        """
        first_time_execution = false
    }
    echo "Finalizamos ejecución $first_time_execution"
}

def checkout(branch) {
    sh """
    #!/bin/sh -xe
    echo "Nombre de la rama $branch"
    """
}

def merge(main, secondary = '') {
    sh """
    #!/bin/sh -xe
    if [ -z "${secondary}" ]; then
        echo "No branch found. Finishing stage."
        exit 0
    fi
    echo "Merge ${secondary} into ${main}"
    """
}
