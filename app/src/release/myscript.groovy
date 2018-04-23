//"git rm contrib/dependency".execute().waitFor()
//"rm -rf .git/modules/contrib/dependency".execute().waitFor()
//"rm -rf contrib/dependency".execute().waitFor()
//"rm -rf contrib".execute().waitFor()

"git config -f .gitmodules submodule.contrib/dependency.branch master".execute().waitFor()
//"git submodule init".execute().waitFor()
"git submodule update --remote".execute().waitFor()
