def command = "git submodule init"
def command2 = "git submodule update"
def proc = command.execute()
def proc2 = command2.execute()
proc.waitFor()
proc2.waitFor()