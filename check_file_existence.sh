#!/bin/bash

filename="Check_odd_even.sh"

if [ -e "$filename" ]; then
    echo "File exists"
else
    echo "File not found"
fi
