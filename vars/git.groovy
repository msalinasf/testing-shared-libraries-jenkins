def checkout(branch) {
    // echo "Bye, ${branch}."
    echo "begin"
    sh '''
    #!/bin/sh -xe
    # get hotfix branch
    # git checkout ${branch}
    echo "Nombre de la rama ${branch}"
    echo "Nombre de la rama 2 $branch"
    '''
    echo "end"
}
