#!/usr/bin/env groovy

def first_time_execution = true
def config(branch) {
    if ( first_time_execution ) {
        sh """
        echo "Primera vez que ejecutamos con la rama $branch"
        """
        first_time_execution = false
    }
    echo "Finalizamos ejecución"
}

def checkout(branch) {
    sh """
    #!/bin/sh -xe
    echo "Nombre de la rama $branch"
    """
}
