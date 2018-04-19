def command = "git submodule foreach git pull origin master"
//def command2 = "git submodule update"
def proc = command.execute()
//def proc2 = command2.execute()
//proc.waitFor()
proc.waitFor()