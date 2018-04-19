def init = "git submodule init"
def command = "git submodule foreach git pull origin master"
def command2 = "git submodule update"
def proc2 = init.execute()
def proc = command.execute()
def dskao = command2.execute()
proc2.waitFor()
proc.waitFor()
dskao.waitFor()