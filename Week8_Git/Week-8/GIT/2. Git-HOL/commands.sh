#!/bin/bash
git init
git status
# Verify that debug.log and log/ are not tracked
# Add and commit remaining files
git add .
git commit -m "Initial commit ignoring .log files and log folder"
