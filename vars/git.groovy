def checkout(branch) {
    // echo "Bye, ${branch}."
    echo "begin ${branch}"
    sh """
    #!/bin/sh -xe
    # get hotfix branch
    # git checkout ${branch}
    echo "Nombre de la rama ${branch}"
    echo "Nombre de la rama 2 $branch"
    echo "Nombre de la rama 3 $branch"
    """
    sh '''
    echo "cuarto comentario"
    '''
    echo "end ${branch}"
}
