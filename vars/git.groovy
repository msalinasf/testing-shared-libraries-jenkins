def checkout(branch) {
    // echo "Bye, ${branch}."
    sh '''
    #!/bin/sh -xe
    # get hotfix branch
    # git checkout ${branch}
    echo ${branch}
    '''
}
