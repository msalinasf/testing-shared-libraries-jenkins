def checkout(branch) {
    // echo "Bye, ${branch}."
    echo "begin"
    sh '''
    #!/bin/sh -xe
    # get hotfix branch
    # git checkout ${branch}
    echo ${branch}
    '''
    echo "end"
}
