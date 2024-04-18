#!/usr/bin/env groovy

def loadColors() {
    RED= '31'
    BLUE= '34'
    CYAN= '36'
    GREEN= '32'
    MAGENTA='35'
    YELLOW= '33'
    LIGHT_MAGENTA='95'
    LIGHT_YELLOW= '93'
    ON_YELLOW= '43'
    ON_GREEN= '42'
    ON_LIGHT_MAGENTA= '105'
    ON_BLUE= '44'
    ON_LIGHT_BLUE= '104'
    NORMAL= '0'
    BOLD= '1'
    PRE= '\033['
    POST= 'm'
}

def date(){
    return new Date().format("yyyy-MM-dd HH:mm:ss")
}

def infoStage() {
    loadColors()
    date = date()
    sh"""set +x; echo "${PRE}${BOLD};${BLUE}${POST} [STAGE] - $date - ==================================== HOLAAAAA ========================================================== ${PRE}${NORMAL}${POST} " """
}
