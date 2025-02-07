package closures

def log = { String type, Date createdOn, String msg ->
    println "$createdOn [$type] - $msg"
}
log("DEBUG", new Date(), "The first debug...")

def logDebug = log.curry("DEBUG")

logDebug(new Date(), "The first debug...")

def logAnotherLog = log.rcurry("The another log...")

logAnotherLog("DEBUG", new Date())

def indexLog = log.ncurry(1, new Date())
indexLog("ERROR", "The index log...")

