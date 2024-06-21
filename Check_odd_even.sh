#!/bin/bash

while true; do
    # Prompt the user for input
    read -p "Enter a number (0 to stop): " num

    # Ensure the input is a valid number
    if ! [[ "$num" =~ ^-?[0-9]+$ ]]; then
        echo "Invalid input. Please enter an integer."
        continue
    fi

    # Check if the input number is 0
    if [ "$num" -eq 0 ]; then
        echo "Stopping the script."
        break
    fi

    # Determine if the number is odd or even
    if [ $((num % 2)) -eq 0 ]; then
        echo "$num is even."
    else
        echo "$num is odd."
    fi
done
