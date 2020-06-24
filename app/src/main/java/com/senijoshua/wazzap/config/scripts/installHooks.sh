#!/bin/bash
#
# This script will install a pre-commit hook that will run any and all
# .hook files in this directory. It will also install dependencies, if any
# required by these hooks.
#

cd "$(git rev-parse --show-toplevel)/config/scripts" || return

mkdir ../.git/config/scripts/
echo "Copying pre-commit to git hooks"
cp -rp pre-commit ../.git/scripts/pre-commit
if [ $? -eq 0 ]; then
    echo "...Success!"
else
    echo "...Failed!"
    exit 1
fi

# Check if all dependencies have been installed

echo ""
echo "Integrating ktlint with Android Studio..."
"$(git config --get ktlint.jar)" --android applyToIDEA -y
