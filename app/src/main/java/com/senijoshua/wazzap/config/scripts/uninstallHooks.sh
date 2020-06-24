#!/bin/bash
#
# This script will delete all files created by install.sh
# and will uninstall dependencies.

cd "$(git rev-parse --show-toplevel)" || return

echo "Removing pre-commit hook"
rm -rf .git/config/scripts/pre-commit
if [ $? -ne 0 ]; then
    echo "! Failed to remove pre-commit hook. You will have to do so manually."
fi