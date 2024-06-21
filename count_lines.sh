#!/bin/bash

# Function to count lines in a file
count_lines() {
    filename="$1"
    if [ -f "$filename" ]; then
        num_lines=$(wc -l < "$filename")
        echo "The file '$filename' has $num_lines lines."
    else
        echo "Error: The file '$filename' was not found."
    fi
}

# Example usage
count_lines "Check_odd_even.sh"
count_lines "check_file_existence.sh"
count_lines "nonexistent_file.txt"
