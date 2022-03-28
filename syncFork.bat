git remote add upstream https://github.com/terebinto/deal-javaEstagio.git

git fetch upstream

git checkout master

git rebase upstream/master

git merge upstream/master

git push -f origin master